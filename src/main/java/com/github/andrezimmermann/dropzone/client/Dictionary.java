package com.github.andrezimmermann.dropzone.client;

import com.github.andrezimmermann.dropzone.client.interfaces.DropzoneDictonary;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper for the Dropzone options
 *
 * @author Andre
 *
 */
class Dictionary extends JavaScriptObject implements DropzoneDictonary {

    protected Dictionary() {
    }

    protected final static native DropzoneDictonary create()/*-{
                                                          return {};
                                                          }-*/;

    @Override
    public final native void setCancelUpload(String cancelUpload) /*-{
                                                                this.dictCancelUpload = cancelUpload;
                                                                }-*/;

    @Override
    public final native void setCancelUploadConfirmation(
            String cancelUploadConfirmation)/*-{
                                    this.dictCancelUploadConfirmation = cancelUploadConfirmation;
                                    }-*/;

    @Override
    public final native void setDefaultMessage(String defaultMessage) /*-{
                                                                    this.dictDefaultMessage = defaultMessage;
                                                                    }-*/;

    @Override
    public final native void setFallbackMessage(String fallbackMessage) /*-{
                                                                      this.dictFallbackMessage = fallbackMessage;
                                                                      }-*/;

    @Override
    public final native void setFallbackText(String fallbackText)/*-{
                                                               this.dictFallbackText = fallbackText;
                                                               }-*/;

    @Override
    public final native void setFileTooBig(String fileTooBig)/*-{
                                                           this.dictFileTooBig = fileTooBig;
                                                           }-*/;

    @Override
    public final native void setInvalidFileType(String invalidFileType)/*-{
                                                                     this.dictInvalidFileType = invalidFileType;
                                                                     }-*/;

    @Override
    public final native void setMaxFilesExceeded(String maxFilesExceeded) /*-{
                                                                        this.dictMaxFilesExceeded = maxFilesExceeded;
                                                                        }-*/;

    @Override
    public final native void setRemoveFile(String removeFile)/*-{
                                                           this.dictRemoveFile = removeFile;
                                                           }-*/;

    @Override
    public final native void setResponseError(String responseError) /*-{
                                                                  this.dictResponseError = responseError;
                                                                  }-*/;

}
