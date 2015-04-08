package com.twocentsforthoughts.dropzone.client;

import com.twocentsforthoughts.dropzone.client.event.DropzoneEventHandler;
import com.twocentsforthoughts.dropzone.client.interfaces.File;
import com.twocentsforthoughts.dropzone.client.interfaces.FormData;
import com.twocentsforthoughts.dropzone.client.interfaces.XHRObjet;

/**
 * Empty implementation for the events dispatched by the Dropzone
 * @author andrezimmermann
 *
 */
public class DropzoneEventHandlerAdaptor implements DropzoneEventHandler {

	@Override
	public void onAddedFile(File file) {
	}

	@Override
	public void onCancelled(File file) {
	}

	@Override
	public void onComplete(File file) {
	}

	@Override
	public void onError(File file, String message, XHRObjet xhrObject) {
	}

	@Override
	public void onMaxFilesExceeded(File file) {
	}

	@Override
	public void onMaxFilesReached(File file) {
	}

	@Override
	public void onProcessing(File file) {
	}

	@Override
	public void onRemovedfile(File file) {
	}

	@Override
	public void onSending(File file, FormData formData, XHRObjet xhrObject) {
	}

	@Override
	public void onSuccess(File file, String response) {

	}

	@Override
	public void onThumbnail(File file, String dataURI) {
	}

	@Override
	public void onUploadProgress(File file, int progressSent, int bytesSent) {
	}

}