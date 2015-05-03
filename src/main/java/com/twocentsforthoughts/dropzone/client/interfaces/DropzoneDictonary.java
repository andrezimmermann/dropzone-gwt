package com.twocentsforthoughts.dropzone.client.interfaces;

public interface DropzoneDictonary {
  /**
   * If addRemoveLinks is true, the text to be used for the cancel upload
   * link.
   *
   * @param cancelUpload
   */
  void setCancelUpload(String cancelUpload);

  /**
   * If addRemoveLinks is true, the text to be used for the cancel upload
   * link.
   *
   * @param cancelUploadConfirmation
   */
  void setCancelUploadConfirmation(String cancelUploadConfirmation);

  /**
   * The message that gets displayed before any files are dropped. This is
   * normally replaced by an image but defaults to "Drop files here to upload"
   *
   * @param defaultMessage
   */
  void setDefaultMessage(String defaultMessage);

  /**
   * If the browser is not supported, the default message will be replaced
   * with this text. Defaults to
   * "Your browser does not support drag'n'drop file uploads."
   *
   * @param fallbackMessage
   */
  void setFallbackMessage(String fallbackMessage);

  /**
   * This will be added before the file input files. If you provide a fallback
   * element yourself, or if this option is null this will be ignored.
   * Defaults to
   * "Please use the fallback form below to upload your files like in the olden days."
   *
   * @param fallbackText
   */
  void setFallbackText(String fallbackText);

  /**
   * Shown when the file is too big. and will be replaced.
   *
   * @param fileTooBig
   */
  void setFileTooBig(String fileTooBig);

  /**
   * Shown as error message if the file doesn't match the file type.
   *
   */
  void setInvalidFileType(String invalidFileType);

  /**
   * If maxFiles is set, this will be the error message when it's exceeded.
   *
   * @param maxFilesExceeded
   */
  void setMaxFilesExceeded(String maxFilesExceeded);

  /**
   * If addRemoveLinks is true, the text to be used to remove a file.
   */
  void setRemoveFile(String removeFile);

  /**
   * Shown as error message if the server response was invalid. `` will be
   * replaced with the servers status code.
   *
   * @param responseError
   */
  void setResponseError(String responseError);

}
