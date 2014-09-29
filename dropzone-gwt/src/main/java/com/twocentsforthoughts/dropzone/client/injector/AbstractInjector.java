package com.twocentsforthoughts.dropzone.client.injector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;

/**
 * Base class for classes that inject someting into the document header.
 *
 * @since 2.0.4.0
 * @author Carlos Alexandro Becker
 * @author Dominik Mayer
 */
abstract class AbstractInjector {

	/**
	 * Gets the document header.
	 *
	 * @return the document header
	 */
	protected static HeadElement getHead() {
		if (head == null) {
			Element element = Document.get().getElementsByTagName("head")
					.getItem(0);
			assert element != null : "HTML Head element required";
			HeadElement head = HeadElement.as(element);
			AbstractInjector.head = head;
		}
		return AbstractInjector.head;
	}

	private static HeadElement head;
}