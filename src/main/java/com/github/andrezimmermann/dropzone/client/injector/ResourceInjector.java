package com.github.andrezimmermann.dropzone.client.injector;

import com.github.andrezimmermann.dropzone.client.injector.resources.Resources;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

/**
 * Responsible for injecting the resources within the application
 * @author andrezimmermmann
 *
 */
public class ResourceInjector {

    private static boolean configured;

    public static void configure(Resources resources) {
        if (!configured) {
            injectCss(resources.dropzoneCss());
            injectJs(resources.dropzoneJs());
            configured = true;
        }
    }

    private static void injectCss(CssResource resource) {
        StyleInjector.injectAtStart(resource.getText(), true);
    }

    private static void injectJs(TextResource r) {
        JavaScriptInjector.inject(r.getText());
    }

    private ResourceInjector() {
    }

}
