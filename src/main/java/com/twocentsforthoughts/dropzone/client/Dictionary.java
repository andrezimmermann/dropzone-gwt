package com.twocentsforthoughts.dropzone.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneDictonary;

/**
 * Wrapper for the Dropzone options
 *
 * @author Andre
 *
 */
class Dictionary extends JavaScriptObject implements DropzoneDictonary {

	protected final static native DropzoneDictonary create()/*-{
		return {};
	}-*/;

	protected Dictionary() {
	}

	public final native void setCancelUpload(String cancelUpload) /*-{
		this.dictCancelUpload = cancelUpload;
	}-*/;

	public final native void setCancelUploadConfirmation(
			String cancelUploadConfirmation)/*-{
		this.dictCancelUploadConfirmation = cancelUploadConfirmation;
	}-*/;

	public final native void setDefaultMessage(String defaultMessage) /*-{
		this.dictDefaultMessage = defaultMessage;
	}-*/;

	public final native void setFallbackMessage(String fallbackMessage) /*-{
		this.dictFallbackMessage = fallbackMessage;
	}-*/;

	public final native void setFallbackText(String fallbackText)/*-{
		this.dictFallbackText = fallbackText;
	}-*/;

	public final native void setFileTooBig(String fileTooBig)/*-{
		this.dictFileTooBig = fileTooBig;
	}-*/;

	public final native void setInvalidFileType(String invalidFileType)/*-{
		this.dictInvalidFileType = invalidFileType;
	}-*/;

	public final native void setMaxFilesExceeded(String maxFilesExceeded) /*-{
		this.dictMaxFilesExceeded = maxFilesExceeded;
	}-*/;

	public final native void setRemoveFile(String removeFile)/*-{
		this.dictRemoveFile = removeFile;
	}-*/;

	public final native void setResponseError(String responseError) /*-{
		this.dictResponseError = responseError;
	}-*/;

}
