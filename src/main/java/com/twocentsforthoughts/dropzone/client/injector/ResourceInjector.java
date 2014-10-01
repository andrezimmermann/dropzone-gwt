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

	private static void injectCss(CssResource r) {
		StyleInjector.inject(r.getText());
	}

	private static void injectJs(TextResource r) {
		JavaScriptInjector.inject(r.getText());
	}

	private static boolean configured;

}