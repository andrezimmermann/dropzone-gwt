package com.twocentsforthoughts.dropzone.client.interfaces;

import java.util.Date;

public interface File {
	/**
	 * @return The last modified Date of the file referenced by the File object.
	 */
	public Date lastModifiedDate();

	/**
	 * @return The name of the file referenced by the File object.
	 */
	public String name();

}
