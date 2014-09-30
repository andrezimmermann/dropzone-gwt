package com.twocentsforthoughts.dropzone.client.data;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;
import com.twocentsforthoughts.dropzone.client.interfaces.File;

public class FileJS extends JavaScriptObject implements File {

	protected FileJS() {
	}

	public final native Date lastModifiedDate() /*-{
		return this.lastModifiedDate;
	}-*/;

	public final native String name() /*-{
		return this.name;
	}-*/;

}
