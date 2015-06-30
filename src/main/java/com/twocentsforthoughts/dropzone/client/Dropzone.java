package com.twocentsforthoughts.dropzone.client;

import java.util.ArrayList;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.twocentsforthoughts.dropzone.client.data.FileJS;
import com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler;
import com.twocentsforthoughts.dropzone.client.injector.ResourceInjector;
import com.twocentsforthoughts.dropzone.client.injector.resources.Resources;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneDictonary;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneOptions;
import com.twocentsforthoughts.dropzone.client.interfaces.File;

/**
 * Main class, that is used to interact
 *
 * @author andrezimmermann
 *
 */
public class Dropzone extends Composite {
	
	public final static String ADDED = "added";
	public final static String QUEUED = "queued";
	public final static String ACCEPTED = QUEUED;
	public final static String UPLOADING = "uploading";
	public final static String PROCESSING = UPLOADING;
	public final static String CANCELED = "canceled";
	public final static String ERROR = "error";
	public final static String SUCCESS = "success";

	/**
	 * Create the object that contains the Dictionary used by {@link Dropzone}
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

	private final DropzoneOptions options;
	private final DropzoneEventHandler handler;
	private final DropzoneDictonary dictionary;

	public Dropzone(DropzoneOptions options) {
		this(options, null, null, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneDictonary dictionary) {
		this(options, null, dictionary, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler) {
		this(options, handler, null, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler, DropzoneDictonary dictionary) {
		this(options, handler, dictionary, (Resources) GWT.create(Resources.class));
	}

	public Dropzone(DropzoneOptions options, DropzoneEventHandler handler, DropzoneDictonary dictionary,
			Resources resources) {
		this.options = options;
		this.handler = handler;
		this.dictionary = dictionary;
		injectResources(resources);
		initWidget();
		initDropzone(getElement(), options, handler, dictionary);
	}

	private native void initDropzone(Element e, DropzoneOptions options, DropzoneEventHandler handler,
			DropzoneDictonary dictionary)
	/*-{
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
		// To conform with the standard stylesheet
		final HTML widget = new HTML();
		widget.setStylePrimaryName("dropzone");
		initWidget(widget);
	};

	private void injectResources(Resources resources) {
		ResourceInjector.configure(resources);
	}

	/**
	 * Add file information manually to Dropzone. Added file is not uploaded, it is just shown in the dropzone.
	 * This feature is useful for displaying e.g. files that already exists on the server.
	 * 
	 * @param fileName name of file to add
	 * @param fileSize size of file to add
	 * @param thumbnail_url thumbnail image for file
	 */
	public void addFile(String fileName, Integer fileSize, String thumbnail_url) {
		addfileNative(getElement(), fileName, fileSize, thumbnail_url);
	}

	/**
	 * Native implementation of {@link addFile} method.
	 * 
	 * @param e dropzone element
	 * @param fileName name of file to add
	 * @param fileSize size of file to add
	 * @param thumbnail_url thumbnail image for file
	 */
	private native void addfileNative(Element e, String fileName, Integer fileSize, String thumbnail_url) /*-{
		var mockFile = { name: fileName, size: fileSize, status: $wnd.Dropzone.SUCCESS };

		e.dropzone.files.push(mockFile);
		e.dropzone.emit("addedfile", mockFile);
		e.dropzone.emit("thumbnail", mockFile, thumbnail_url);
		e.dropzone.emit("complete", mockFile);
		e.dropzone.emit("success", mockFile);
	}-*/;
	
	/**
	 * Return array if all files added to dropzone.
	 * 
	 * @return all files added to dropzone.
	 */
	public ArrayList<File> getFiles() {
		JsArray<FileJS> filesJS = getFilesNative(getElement());
		ArrayList<File> files = new ArrayList<File>();
		
		if (filesJS != null)
			for (int i=0; i<filesJS.length(); i++)
				files.add(filesJS.get(i));

		return files;
	}
	
	/**
	 * Return information about particular file added to dropzone.
	 * 
	 * @param i index of the file
	 * @return file information
	 */
	public File getFile(int i) {
		return getFilesNative(getElement()).get(i);
	}
	
	/**
	 * Return number of added files.
	 * 
	 * @return number of files
	 */
	public int getFilesCount() {
		JsArray<FileJS> files = getFilesNative(getElement());
		return files != null ? files.length() : 0;
	}
	
	/**
	 * Native implementation of {@link getFiles}
	 * 
	 * @param e dropzone element
	 * @return array of {@link FileJS} elements
	 */
	private native JsArray<FileJS> getFilesNative(Element e) /*-{
		return e.dropzone.files;
	}-*/;
	
	/**
	 * Removes file at index i.
	 * 
	 * @param i index of the file to remove.
	 */
	public void removeFile(int i) {
		removeFileNative(getElement(), i);
	}
	
	/**
	 * Native implementation of {@link removeFile}
	 * 
	 * @param e dropzone element
	 * @param i index of the file to remove
	 */
	private native void removeFileNative(Element e, int i) /*-{
		if (e.dropzone.files[i]!=null){
        	e.dropzone.removeFile(e.dropzone.files[i]);
		}
	}-*/;
	
	/**
	 * Removes all files from dropzone.
	 */
	public void removeAllfiles() {
		removeAllFilesNative(getElement());
	}
	
	/**
	 * Native implementation of {@link removeAllfiles}
	 * 
	 * @param e dropzone element
	 */
	private native void removeAllFilesNative(Element e) /*-{
		e.dropzone.removeAllFiles(true);
	}-*/;
}
