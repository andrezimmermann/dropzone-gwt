package com.github.andrezimmermann.dropzone.client;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.github.andrezimmermann.dropzone.client.event.DropzoneFallbackEvent;
import com.github.andrezimmermann.dropzone.client.interfaces.DropzoneOptions;
import com.github.andrezimmermann.dropzone.client.interfaces.Method;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Wrapper for the Dropzone options
 *
 * @author Andre
 *
 */
class Options extends JavaScriptObject implements DropzoneOptions {

    protected final static native DropzoneOptions create()/*-{
		return {
			// remove svg tick and cross that conflict with dropzone-gwt's tick and cross
			"previewTemplate" : "<div class=\"dz-preview dz-file-preview\">\n  <div class=\"dz-image\"><img data-dz-thumbnail /></div>\n  <div class=\"dz-details\">\n    <div class=\"dz-size\"><span data-dz-size></span></div>\n    <div class=\"dz-filename\"><span data-dz-name></span></div>\n  </div>\n  <div class=\"dz-progress\"><span class=\"dz-upload\" data-dz-uploadprogress></span></div>\n  <div class=\"dz-error-message\"><span data-dz-errormessage></span></div>\n  <div class=\"dz-success-mark\">\n   </div>\n  <div class=\"dz-error-mark\">\n </div>\n</div>",
			"params" : {}
		};
	}-*/;

    protected Options() {
    }

    public final native String getUrl() /*-{
		return this.url;
    }-*/;

    @Override
    public final native void setAcceptedFiles(String acceptedFiles)/*-{
		this.acceptedFiles = acceptedFiles;
    }-*/;

    @Override
    public final native void setAddRemoveLinks(boolean addRemoveLinks) /*-{
		this.addRemoveLinks = addRemoveLinks;
    }-*/;

    @Override
    public final native void setAutoProcessQueue(boolean autoProcessQueue)/*-{
		this.autoProcessQueue = autoProcessQueue;
    }-*/;

    @Override
    public final native void setClickable(boolean clickable)/*-{
		this.clickable = clickable;
    }-*/;

    @Override
    public final native void setClickable(
        Collection<Element> arrayOfClickableElements)/*-{
		this.clickable = arrayOfClickableElements;
    }-*/;

    @Override
    public final native void setClickable(String cssSelectorOfClickableElements)/*-{
		this.clickable = cssSelectorOfClickableElements;
    }-*/;

    @Override
    public final native void setFallback(DropzoneFallbackEvent fallbackHandler) /*-{
		this.fallback = function() {
			fallbackHandler.@com.github.andrezimmermann.dropzone.client.event.DropzoneFallbackEvent::onFallback()();
		}
    }-*/;

    @Override
    public final native void setForceFallback(boolean forceFallback)/*-{
		this.forceFallback = forceFallback;
    }-*/;

    @Override
    public final void setHeaders(Map<String, String> headers) {
        Map<String, String> currentHeader = headers;

        if (currentHeader == null) {
            currentHeader = Collections.emptyMap();
        }

        MapOverlay mapOverlay = MapOverlay.create();

        Set<Entry<String, String>> headerEntries = currentHeader.entrySet();
        for (Entry<String, String> entry : headerEntries) {
            mapOverlay.put(entry.getKey(), entry.getValue());
        }
        setHeadersJS(mapOverlay);
    }

    private final native void setHeadersJS(JavaScriptObject headers) /*-{
		this.headers = headers;
    }-*/;

    @Override
    public final native void setMaxFiles(int maxFiles) /*-{
		this.maxFiles = maxFiles;
    }-*/;

    @Override
    public final native void setMaxFilesize(int maxFilesize) /*-{
		this.maxFilesize = maxFilesize;
    }-*/;

    @Override
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

    @Override
    public final native void setParallelUploads(int parallelUploads) /*-{
		this.parallelUploads = parallelUploads;
    }-*/;

    @Override
    public final native void setParamName(String paramName)/*-{
		this.paramName = paramName;
    }-*/;

    @Override
    public final native void setPreviewsContainer(String previewsContainer)/*-{
		this.previewsContainer = previewsContainer;
    }-*/;

    @Override
    public final native void setPreviewTemplate(String previewTemplate) /*-{
		this.previewTemplate = previewTemplate;
    }-*/;

    @Override
    public final native void setThumbnailHeight(int height) /*-{
		this.thumbnailHeight = height;
    }-*/;

    @Override
    public final native void setThumbnailWidth(int width) /*-{
		this.thumbnailWidth = width;
    }-*/;

    @Override
    public final native void setUploadMultiple(boolean uploadMultiple)/*-{
		this.uploadMultiple = uploadMultiple;
    }-*/;

    @Override
    public final native void setUrl(String url) /*-{
		this.url = url;
    }-*/;

	@Override
	public final native void addParameter(String name, String value)/*-{
		this.params[name] = value;
	}-*/;

}
