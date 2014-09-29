package com.twocentsforthoughts.dropzone.client;

import com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler;
import com.twocentsforthoughts.dropzone.client.interfaces.File;
import com.twocentsforthoughts.dropzone.client.interfaces.FormData;
import com.twocentsforthoughts.dropzone.client.interfaces.XHRObjet;

public class DropzoneEventHandlerAdaptor implements DropzoneEventHandler {

	public void onAddedFile(File file) {
	}

	public void onCancelled(File file) {
	}

	public void onComplete(File file) {
	}

	public void onError(File file, String message, XHRObjet xhrObject) {
	}

	public void onProcessing(File file) {
	}

	public void onRemovedfile(File file) {
	}

	public void onSending(File file, FormData formData, XHRObjet xhrObject) {
	}

	public void onSuccess(File file, String response) {

	}

	public void onThumbnail(File file, String dataURI) {
	}

	public void onUploadProgress(File file, int progressSent, int bytesSent) {
	}

}