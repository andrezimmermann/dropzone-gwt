package com.twocentsforthoughts.dropzone.client.event;

import com.twocentsforthoughts.dropzone.client.Dropzone;
import com.twocentsforthoughts.dropzone.client.interfaces.File;
import com.twocentsforthoughts.dropzone.client.interfaces.FormData;
import com.twocentsforthoughts.dropzone.client.interfaces.XHRObjet;

/**
 * Maps the events handlers for the {@link Dropzone}, if needed, instance your
 * own {@link DropzoneEventHandler} and implement the required method
 *
 * @author Andre
 *
 */
public interface DropzoneEventHandler {

  /**
   * When a file is added
   *
   * @param file
   *            that was added
   */
  void onAddedFile(File file);

  /**
   * Called when a file upload gets canceled.
   *
   * @param file
   *            that was cancelled
   */
  void onCancelled(File file);

  /**
   * Called when the upload was either successful or erroneous.
   *
   * @param file
   *            that was completed, either was sucess or failiture
   */
  void onComplete(File file);

  /**
   * An error occured. Receives the errorMessage as second parameter and if
   * the error was due to the XMLHttpRequest the xhr object as third.
   *
   * @param file
   *            instance
   * @param message
   *            from the error
   * @param xhrObject
   *            null if not present (ommited by javascript code)
   */
  void onError(File file, String message, XHRObjet xhrObject);

  /**
   * Called for each file that has been rejected because the number of files
   * exceeds the maxFiles limit.
   *
   * @param file
   *            that was rejected because of the maxFile limit
   */
  void onMaxFilesExceeded(File file);

  /**
   * Called when the number of files accepted reached the maxFiles limit.
   *
   * @param file
   *            the last file that was accepted
   */
  void onMaxFilesReached(File file);

  /**
   * When a file gets processed (since there is a queue not all files are
   * processed immediately). This event was called processingfile previously.
   *
   * @param file
   */
  void onProcessing(File file);

  /**
   * Called whenever a file is removed from the list. You can listen to this
   * and delete the file from your server if you want to.
   *
   * @param file
   */
  void onRemovedfile(File file);

  /**
   * Called just before each file is sent. Gets the xhr object and the
   * formData objects as second and third parameters, so you can modify them
   * (for example to add a CSRF token) or add additional data.
   *
   * @param file
   * @param formData
   * @param xhrObject
   */
  void onSending(File file, FormData formData, XHRObjet xhrObject);

  /**
   * The file has been uploaded successfully. Gets the server response as
   * second argument. (This event was called finished previously)
   *
   * @param file
   */
  void onSuccess(File file, String response);

  /**
   * When the thumbnail has been generated. Receives the dataUrl as second
   * parameter.
   *
   * @param file
   * @param dataURI
   */
  void onThumbnail(File file, String dataURI);

  /**
   * Gets called periodically whenever the file upload progress changes. Gets
   * the progress parameter as second parameter which is a percentage (0-100)
   * and the bytesSent parameter as third which is the number of the bytes
   * that have been sent to the server. When an upload finishes dropzone
   * ensures that uploadprogress will be called with a percentage of 100 at
   * least once. Warning: This function can potentially be called with the
   * same progress multiple times.
   *
   * @param file
   * @param progressSent
   *            percentage (0-100)
   * @param bytesSent
   */
  void onUploadProgress(File file, int progressSent, int bytesSent);
}
