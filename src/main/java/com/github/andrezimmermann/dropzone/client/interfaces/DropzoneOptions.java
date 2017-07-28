package com.github.andrezimmermann.dropzone.client.interfaces;

import com.github.andrezimmermann.dropzone.client.event.DropzoneFallbackEvent;
import com.google.gwt.dom.client.Element;

import java.util.Collection;
import java.util.Map;

public interface DropzoneOptions {

  /**
   * The default implementation of accept checks the file's mime type or
   * extension against this list. This is a comma separated list of mime types
   * or file extensions. Eg.: image/*,application/pdf,.psd. If the Dropzone is
   * clickable this option will be used as accept parameter on the hidden file
   * input as well.
   *
   * @param acceptedFiles This is a comma separated list of mime types or file
   *                      extensions. Eg.: image/*,application/pdf,.psd.
   */
  void setAcceptedFiles(String acceptedFiles);

  /**
   * This will add a link to every file preview to remove or cancel (if
   * already uploading) the file. The dictCancelUpload,
   * dictCancelUploadConfirmation and dictRemoveFile options are used for the
   * wording.
   *
   * @param addRemoveLinks
   */
  void setAddRemoveLinks(boolean addRemoveLinks);

  /**
   * When set to false you have to call myDropzone.processQueue() yourself in
   * order to upload the dropped files. See below for more information on
   * handling queues.
   *
   * @param autoProcessQueue
   */
  void setAutoProcessQueue(boolean autoProcessQueue);

  /**
   * If true, the dropzone element itself will be clickable, if false nothing
   * will be clickable. Otherwise you can pass an HTML element, a CSS selector
   * (for multiple elements) or an array of those.
   *
   * @param clickable
   */
  void setClickable(boolean clickable);

  /**
   * If true, the dropzone element itself will be clickable, if false nothing
   * will be clickable. Otherwise you can pass an HTML element, a CSS selector
   * (for multiple elements) or an array of those.
   *
   * @param arrayOfClickableElements
   */
  void setClickable(Collection<Element> arrayOfClickableElements);

  /**
   * If true, the dropzone element itself will be clickable, if false nothing
   * will be clickable. Otherwise you can pass an HTML element, a CSS selector
   * (for multiple elements) or an array of those.
   *
   * @param cssSelectorOfClickableElements
   */
  void setClickable(String cssSelectorOfClickableElements);

  /**
   * is a function that gets called when the browser is not supported. The
   * default implementation shows the fallback input field and adds a text.
   *
   * @param fallbackHandler
   *            (GWT Callback)
   */
  void setFallback(DropzoneFallbackEvent fallbackHandler);

  /**
   * If true the fallback will be forced. This is very useful to test your
   * server implementations first and make sure that everything works as
   * expected without dropzone if you experience problems, and to test how
   * your fallbacks will look. Defaults to false.
   *
   * @param forceFallback
   */
  void setForceFallback(boolean forceFallback);

  void setHeaders(Map<String, String> headers);

  /**
   * if not null defines how many files this Dropzone handles. If it exceeds,
   * the event maxfilesexceeded will be called. The dropzone element gets the
   * class dz-max-files-reached accordingly so you can provided visual
   * feedback.
   *
   * @param maxFiles
   */
  void setMaxFiles(int maxFiles);

  /**
   * in MB
   */
  void setMaxFilesize(int fileSize);

  /**
   * Defaults to "post" and can be changed to "put" if necessary.
   *
   * @param method
   */
  void setMethod(Method method);

  /**
   * How many file uploads to process in parallel (See the Enqueuing file
   * uploads section for more info)
   *
   * @param amount
   */
  void setParallelUploads(int amount);

  /**
   * The name of the file param that gets transferred. Defaults to file. NOTE:
   * If you have the option uploadMultiple set to true, then Dropzone will
   * append [] to the name.
   *
   * @param paramName
   */
  void setParamName(String paramName);

  /**
   * Defines where to display the file previews – if null the Dropzone
   * element is used. Can be a plain HTMLElement or a CSS selector. The
   * element should have the dropzone-previews class so the previews are
   * displayed properly.
   *
   * @param previewsContainer
   */
  void setPreviewsContainer(String previewsContainer);

  /**
   * String that contains the template used for each dropped image. Change it
   * to fulfill your needs but make sure to properly provide all elements.
   *
   * @param previewTemplate
   */
  void setPreviewTemplate(String previewTemplate);

  /**
   * Whether Dropzone should send multiple files in one request. If this it
   * set to true, then the fallback file input element will have the multiple
   * attribute as well. This option will also trigger additional events (like
   * processingmultiple). See the events section for more information.
   *
   * @param multipleUploads
   */
  void setUploadMultiple(boolean multipleUploads);

  /**
   * Has to be specified on elements other than form (or when the form doesn't
   * have an action attribute)
   *
   * @param url
   */
  void setUrl(String url);

  /**
   * If null, the ratio of the image will be used to calculate it.
   *
   * @param width
   */
  void setThumbnailWidth(int width);

  /**
   * The same as {@link setThumbnailWidth}. If both are null, images will not be resized.
   *
   * @param height
   */
  void setThumbnailHeight(int height);
  
  /**
   * Adds a parameter to the upload request. This is equivalent to adding a hidden input to a form.
   * 
   * @param name
   * @param value
   */
  void addParameter(String name, String value);
}
