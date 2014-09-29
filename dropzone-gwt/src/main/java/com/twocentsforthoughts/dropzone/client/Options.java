package com.twocentsforthoughts.dropzone.client;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneOptions;
import com.twocentsforthoughts.dropzone.client.interfaces.Method;

/**
 * Wrapper for the Dropzone options
 *
 * @author Andre
 *
 */
class Options extends JavaScriptObject implements DropzoneOptions {

	protected final static native DropzoneOptions create()/*-{
		return {};
	}-*/;

	protected Options() {
	}

	public final native String getUrl() /*-{
		return this.url;
	}-*/;

	public final native void setAddRemoveLinks(boolean addRemoveLinks) /*-{
		this.addRemoveLinks = addRemoveLinks;
	}-*/;

	public final native void setClickable(boolean clickable)/*-{
		this.clickable = clickable;
	}-*/;

	public final native void setClickable(
			Collection<Element> arrayOfClickableElements)/*-{
		this.clickable = arrayOfClickableElements;
	}-*/;

	public final native void setClickable(String cssSelectorOfClickableElements)/*-{
		this.clickable = cssSelectorOfClickableElements;
	}-*/;

	public final void setHeaders(Map<String, String> headers) {
		if (headers == null) {
			headers = Collections.EMPTY_MAP;
		}

		MapOverlay mapOverlay = MapOverlay.create();

		Set<Entry<String, String>> entrySet = headers.entrySet();

		for (Entry<String, String> entry : entrySet) {
			mapOverlay.put(entry.getKey(), entry.getValue());
		}

		setHeadersJS(mapOverlay);

	}

	private final native void setHeadersJS(JavaScriptObject headers) /*-{
		this.headers = headers;
	}-*/;

	public final native void setMaxFiles(int maxFiles) /*-{
		this.maxFiles = maxFiles;
	}-*/;

	public final native void setMaxFilesize(int maxFilesize) /*-{
		this.maxFilesize = maxFilesize;
	}-*/;

	public final void setMethod(Method method) {

		if (method != null) {
			setMethodJS(method.toString());
		} else {
			setMethod(Method.POST);
		}

	}

	private final native void setMethodJS(String method) /*-{
		this.method = method;
	}-*/;

	public final native void setParallelUploads(int parallelUploads) /*-{
		this.parallelUploads = parallelUploads;
	}-*/;

	public final native void setParamName(String paramName)/*-{
		this.paramName = paramName;
	}-*/;

	public final native void setPreviewsContainer(String previewsContainer)/*-{
		this.previewsContainer = previewsContainer;
	}-*/;

	public final native void setUploadMultiple(boolean uploadMultiple)/*-{
		this.uploadMultiple = uploadMultiple;
	}-*/;

	public final native void setUrl(String url) /*-{
		this.url = url;
	}-*/;

}
