package com.twocentsforthoughts.dropzone.client.injector;

import org.junit.Test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.resources.client.TextResource;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;

public class ResourceInjectorGwtTest extends GWTTestCase {

  private void ensureInjected(TextResource resource) {

    JavaScriptObject scriptObject = findScriptTextInThisWindow(resource.getText());
    assertNotNull(scriptObject);

  }

  private JavaScriptObject findScriptTextInThisWindow(String text) {
    return nativeFindScriptText(nativeThisWindow(), text);
  }

  @Override
  public String getModuleName() {
    return "com.twocentsforthoughts.dropzone.TestModule";
  }

  private native JavaScriptObject nativeFindScriptText(JavaScriptObject wnd, String text) /*-{
                                                                                          var scripts = wnd.document.getElementsByTagName("script");
                                                                                          for ( var i = 0; i < scripts.length; ++i) {
                                                                                          if (scripts[i].text.match("^" + text)) {
                                                                                          return scripts[i];
                                                                                          }
                                                                                          }
                                                                                          return null;
                                                                                          }-*/;

  private native JavaScriptObject nativeThisWindow() /*-{
                                                     return window;
                                                     }-*/;

  @Test
  public void testConfigure() {
    // Given a default resource
    Resources resources = GWT.create(Resources.class);

    // When it is 'configured' by the resourceInjector
    ResourceInjector.configure(resources);

    // Then it should
    // Inject it's JS
    ensureInjected(resources.dropzoneJs());

    // Inject it's CSS
    ensureInjected(resources.dropzoneJs());

  }

}
