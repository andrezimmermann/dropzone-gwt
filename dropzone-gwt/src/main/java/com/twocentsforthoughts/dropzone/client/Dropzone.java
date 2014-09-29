package com.twocentsforthoughts.dropzone.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler;
import com.twocentsforthoughts.dropzone.client.injector.ResourceInjector;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneOptions;

public class Dropzone extends Composite {

	public static DropzoneEventHandler eventHandlers() {
		return new DropzoneEventHandlerAdaptor();
	}

	public static DropzoneOptions options() {
		return Options.create();
	}

	private DropzoneOptions options;
	private DropzoneEventHandler handler;

	public Dropzone(DropzoneOptions options) {
		this(options, null, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler) {
		this(options, handler, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler,
			Resources resources) {
		this.options = options;
		this.handler = handler;
		injectResources(resources);
		initWidget();
	}

	private native void initDropzone(Element e, DropzoneOptions options,
			DropzoneEventHandler handler) /*-{
		var dropzone = new $wnd.Dropzone(e, options);

		if (this.@com.twocentsforthoughts.dropzone.client.Dropzone::handler) {

			dropzone
					.on(
							"addedfile",
							function(file) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onAddedFile(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
							});
			dropzone
					.on(
							"removedfile",
							function(file) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onRemovedfile(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
							});
			dropzone
					.on(
							"thumbnail",
							function(file, dataUri) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onThumbnail(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;Ljava/lang/String;)(file,dataUri);
							});
			dropzone
					.on(
							"error",
							function(file, message, xhrObject) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onError(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;Ljava/lang/String;Lcom/twocentsforthoughts/dropzone/client/interfaces/XHRObjet;)(file,message,xhrObject);
							});
			dropzone
					.on(
							"processing",
							function(file) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onProcessing(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
							});
			dropzone
					.on(
							"uploadprogress",
							function(file, progress, bytesSent) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onUploadProgress(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;II)(file,progress,bytesSent);
							});
			dropzone
					.on(
							"sending",
							function(file, xhrObject, formData) {
								handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onSending(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;Lcom/twocentsforthoughts/dropzone/client/interfaces/FormData;Lcom/twocentsforthoughts/dropzone/client/interfaces/XHRObjet;)(file,xhrObject,formData);
							});
			//			dropzone.on("success",);
			//			dropzone.on("complete",);
			//			dropzone.on("canceled",);
			//			dropzone.on("maxfilesreached",);
			//			dropzone.on("maxfilesexceeded",);

		}

	}-*/;

	private void initWidget() {
		HTML widget = new HTML();
		widget.setStylePrimaryName("dropzone");
		initWidget(widget);
	};

	private void injectResources(Resources resources) {
		ResourceInjector.configure(resources);
	}

	@Override
	protected void onAttach() {
		initDropzone(getElement(), options, handler);
	}

}
