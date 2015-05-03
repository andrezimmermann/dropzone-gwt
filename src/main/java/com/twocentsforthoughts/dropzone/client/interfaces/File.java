package com.twocentsforthoughts.dropzone.client.interfaces;

import java.util.Date;

/**
 * Represent a File from the Javascript File API
 *
 * @author andre
 *
 */
public interface File {
	/**
	 * @return The last modified Date of the file referenced by the File object.
	 */
	public Date lastModifiedDate();

	/**
	 * @return The name of the file referenced by the File object.
	 */
	public String name();

	/**
	 * @return Size of the file referenced by the File object.
	 */
	public Integer size();
	
	/**
	 * @return Status of the file referenced by the File object.
	 */
	public String status();
}
