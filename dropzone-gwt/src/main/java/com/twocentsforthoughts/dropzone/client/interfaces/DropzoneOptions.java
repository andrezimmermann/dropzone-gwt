package com.twocentsforthoughts.dropzone.client.interfaces;

import java.util.Collection;
import java.util.Map;

import com.google.gwt.dom.client.Element;

public interface DropzoneOptions {

	/**
	 * This will add a link to every file preview to remove or cancel (if
	 * already uploading) the file. The dictCancelUpload,
	 * dictCancelUploadConfirmation and dictRemoveFile options are used for the
	 * wording.
	 *
	 * @param addRemove
	 */
	public void setAddRemoveLinks(boolean addRemoveLinks);

	/**
	 * If true, the dropzone element itself will be clickable, if false nothing
	 * will be clickable. Otherwise you can pass an HTML element, a CSS selector
	 * (for multiple elements) or an array of those.
	 *
	 * @param clickable
	 */
	public void setClickable(boolean clickable);

	/**
	 * If true, the dropzone element itself will be clickable, if false nothing
	 * will be clickable. Otherwise you can pass an HTML element, a CSS selector
	 * (for multiple elements) or an array of those.
	 *
	 * @param clickable
	 */
	public void setClickable(Collection<Element> arrayOfClickableElements);

	/**
	 * If true, the dropzone element itself will be clickable, if false nothing
	 * will be clickable. Otherwise you can pass an HTML element, a CSS selector
	 * (for multiple elements) or an array of those.
	 *
	 * @param clickable
	 */
	public void setClickable(String cssSelectorOfClickableElements);

	public void setHeaders(Map<String, String> headers);

	public void setMaxFiles(int maximoArquivos);

	/**
	 * in MB
	 */
	public void setMaxFilesize(int fileSize);

	/**
	 * Defaults to "post" and can be changed to "put" if necessary.
	 *
	 * @param method
	 */
	public void setMethod(Method method);

	/**
	 * How many file uploads to process in parallel (See the Enqueuing file
	 * uploads section for more info)
	 *
	 * @param amount
	 */
	public void setParallelUploads(int amount);

	/**
	 * The name of the file param that gets transferred. Defaults to file. NOTE:
	 * If you have the option uploadMultiple set to true, then Dropzone will
	 * append [] to the name.
	 *
	 * @param paramName
	 */
	public void setParamName(String paramName);

	/**
	 * Defines where to display the file previews – if null the Dropzone element
	 * is used. Can be a plain HTMLElement or a CSS selector. The element should
	 * have the dropzone-previews class so the previews are displayed properly.
	 *
	 * @param previewsContainer
	 */
	public void setPreviewsContainer(String previewsContainer);

	/**
	 * Whether Dropzone should send multiple files in one request. If this it
	 * set to true, then the fallback file input element will have the multiple
	 * attribute as well. This option will also trigger additional events (like
	 * processingmultiple). See the events section for more information.
	 *
	 * @param multipleUploads
	 */
	public void setUploadMultiple(boolean multipleUploads);

	/**
	 * Has to be specified on elements other than form (or when the form doesn't
	 * have an action attribute)
	 *
	 * @param url
	 */
	public void setUrl(String url);

}
