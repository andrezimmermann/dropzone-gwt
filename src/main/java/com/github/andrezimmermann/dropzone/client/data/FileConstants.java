package com.github.andrezimmermann.dropzone.client.data;

public class FileConstants {

	public final static String ADDED = "added";
	public final static String QUEUED = "queued";
	/**
	 *  For backwards compatibility. Now, if a file is accepted, it's either queued or uploading.
	 */
	public final static String ACCEPTED = QUEUED;
	public final static String UPLOADING = "uploading";
	/**
	 * Alias of UPLOADING
	 */
	public final static String PROCESSING = UPLOADING;
	public final static String CANCELED = "canceled";
	public final static String ERROR = "error";
	public final static String SUCCESS = "success";

}
