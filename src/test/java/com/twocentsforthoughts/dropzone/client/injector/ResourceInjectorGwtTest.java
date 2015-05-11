package com.twocentsforthoughts.dropzone.client.injector;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;
import org.junit.Test;

public class ResourceInjectorGwtTest extends GWTTestCase {

    /**
     * Ensure that a script tag is injected, fails test if not found
     *
     * @param resource to be ensured, not null
     */
    private void ensureInjected(TextResource resource) {
        JavaScriptObject scriptObject = findScriptTextInThisWindow(resource.getText());
        assertNotNull(scriptObject);
    }

    private JavaScriptObject findScriptTextInThisWindow(String text) {
        return nativeFindScriptText(nativeThisWindow(), text);
    }

    private JavaScriptObject findStyleTextInThisWindow(String text) {
        return nativeFindStyleText(nativeThisWindow(), text);
    }

    @Override
    public String getModuleName() {
        return "com.twocentsforthoughts.dropzone.TestModule";
    }

    private native JavaScriptObject nativeFindScriptText(JavaScriptObject wnd, String text) /*-{
    var scripts = wnd.document.getElementsByTagName("script");
    for ( var i = 0; i < scripts.length; ++i) {
    var script = scripts[i];
      if (script.textContent && script.textContent == text) {
        return script;
      }
    }
    return null;
  }-*/;

    private native JavaScriptObject nativeFindStyleText(JavaScriptObject wnd, String text) /*-{
    var scripts = wnd.document.getElementsByTagName("style");
    for ( var i = 0; i < scripts.length; ++i) {
    var script = scripts[i];
      if (script.textContent && script.textContent == text) {
        return script;
      }
    }
    return null;
  }-*/;


    //TODO: refactor later to this method, avoid duplicate code
    private native JavaScriptObject nativeFindElement(JavaScriptObject wnd, String text, String tagName) /*-{
    var elements = wnd.document.getElementsByTagName(tagName);
    for ( var i = 0; i < elements.length; ++i) {
    var element = elements[i];
      if (script.textContent && script.textContent == text) {
        return element;
      }
    }
    return null;
  }-*/;

    private native JavaScriptObject nativeThisWindow() /*-{
    return $wnd;
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
        ensureInjected(resources.dropzoneCss());

    }

    private void ensureInjected(CssResource resource) {
        JavaScriptObject scriptObject = findStyleTextInThisWindow(resource.getText());
        assertNotNull(scriptObject);
    }

}
