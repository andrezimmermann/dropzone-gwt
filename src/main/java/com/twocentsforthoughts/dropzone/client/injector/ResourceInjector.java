package com.twocentsforthoughts.dropzone.client.injector;

import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;

public class ResourceInjector {

  public static void configure(Resources resources) {
    if (!configured) {
      injectCss(resources.dropzoneCss());
      injectJs(resources.dropzoneJs());
      configured = true;
    }
  }

  /**
   * <p>
   * This injector allows using CSS3 styles in resources, at least to some degree.
   * GWT does not parse CSS3 styles, however, it is possible to use them by escaping
   * functionality that can not be parsed.
   * </p>
   * <p>
   * E.g. {@code .dz-filename:not(:hover )} should be written as {@code .dz-filename:not\(:hover \)}
   * Resulting css will contain an extra backslash: {@code .dz-filename:not(:hover \)} which causes
   * problems in newer browser. So, code below removes all occurrences of " \)" and provides regular css.
   * </p> 
   * @param r css resource to inject
   */
  private static void injectCss(CssResource r) {
    String css = r.getText();
    css = css.replaceAll(" \\\\\\)", ")");
    StyleInjector.inject(css);
  }

  private static void injectJs(TextResource r) {
    JavaScriptInjector.inject(r.getText());
  }

  private static boolean configured;

}
