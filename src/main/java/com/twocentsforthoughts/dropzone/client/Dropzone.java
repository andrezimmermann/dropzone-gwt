package com.twocentsforthoughts.dropzone.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler;
import com.twocentsforthoughts.dropzone.client.injector.ResourceInjector;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneDictonary;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneOptions;

public class Dropzone extends Composite {

	/**
	 * Create the object that contains the Dictonary used by {@link Dropzone}
	 * 
	 * @return a default (en-us) {@link DropzoneDictonary} instance
	 */
	public static DropzoneDictonary dictionary() {
		return Dictionary.create();
	}

	/**
	 * Create the object that contains the Options used by {@link Dropzone}
	 *
	 * @return a default {@link DropzoneOptions} instance
	 */
	public static DropzoneOptions options() {
		return Options.create();
	}

	private DropzoneOptions options;
	private DropzoneEventHandler handler;
	private DropzoneDictonary dictionary;

	public Dropzone(DropzoneOptions options) {
		this(options, null, null, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneDictonary dictionary) {
		this(options, null, dictionary, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler) {
		this(options, handler, null, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler,
			DropzoneDictonary dictionary) {
		this(options, handler, dictionary, (Resources) GWT
				.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler,
			DropzoneDictonary dictionary, Resources resources) {
		this.options = options;
		this.handler = handler;
		this.dictionary = dictionary;
		injectResources(resources);
		initWidget();
	}

	private native void initDropzone(Element e, DropzoneOptions options,
			DropzoneEventHandler handler, DropzoneDictonary dictionary) /*-{

																		//if there is a dictionary, iterate over it and transfer the values

																		if (dictionary) {
																		for ( var key in dictionary) {
																		if (dictionary.hasOwnProperty(key)) {
																		options[key] = dictionary[key];
																		}
																		}
																		}

																		var dropzone = new $wnd.Dropzone(e, options);

																		//If not loaded, don't add the handlers.
																		if (!(dropzone instanceof $wnd.Dropzone)) {
																		return;
																		}
																		//I'm loaded, add the eventHandlers

																		//TODO: refactor this to another method

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

																		dropzone
																		.on(
																		"success",
																		function(file, response) {
																		handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onSuccess(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;Ljava/lang/String;)(file,response);
																		});

																		dropzone
																		.on(
																		"complete",
																		function(file) {
																		handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onComplete(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
																		});

																		dropzone
																		.on(
																		"canceled",
																		function(file) {
																		handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onCancelled(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
																		});

																		dropzone
																		.on(
																		"maxfilesreached",
																		function(file) {
																		handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onMaxFilesReached(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
																		});

																		dropzone
																		.on(
																		"maxfilesexceeded",
																		function(file) {
																		handler.@com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler::onMaxFilesExceeded(Lcom/twocentsforthoughts/dropzone/client/interfaces/File;)(file);
																		});

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
		initDropzone(getElement(), options, handler, dictionary);
	}

}
