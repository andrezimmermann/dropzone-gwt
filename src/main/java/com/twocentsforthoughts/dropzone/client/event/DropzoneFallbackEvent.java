package com.twocentsforthoughts.dropzone.client.event;

import com.twocentsforthoughts.dropzone.client.Dropzone;

/**
 * A simple eventHandler for the Fallback Event
 *
 * @author andrezimmermann
 *
 */
public interface DropzoneFallbackEvent {

	/**
	 * Called when the {@link Dropzone} dispatch the onFallback event
	 */
	public void onFallback();

}
