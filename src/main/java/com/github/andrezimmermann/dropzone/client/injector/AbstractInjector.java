package com.github.andrezimmermann.dropzone.client.injector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;

/**
 * Base class for classes that inject someting into the document header. From
 * https://gwtbootstrap.github.io/
 *
 */
abstract class AbstractInjector {

  private static HeadElement head;

  /**
   * Gets the document header.
   *
   * @return the document header
   */
  protected static HeadElement getHead() {
    if (head == null) {
      final Element element = Document.get().getElementsByTagName("head").getItem(0);
      assert element != null : "HTML Head element required";
      final HeadElement head = HeadElement.as(element);
      AbstractInjector.head = head;
    }
    return AbstractInjector.head;
  }
}
