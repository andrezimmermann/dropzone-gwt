package com.twocentsforthoughts.dropzone.client.injector.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

/**
 * Interface that provides the Dropzone resources.
 *
 * @author andrezimmermann
 */
public interface Resources extends ClientBundle {

  /**
   * Returns the CSS file.
   * <p>
   * Override this method to use your own CSS file.
   *
   * @return the CSS file
   */
  @Source("css/dropzone.css")
  CssResource dropzoneCss();

  /**
   * Returns the JS file. Version 3.10.2
   * <p>
   * Override this method to use your own JS file.
   *
   * @return the JS file
   */
  @Source("js/dropzone.min.js")
  TextResource dropzoneJs();

  @Source("images/spritemap.png")
  ImageResource spritemap();

}
