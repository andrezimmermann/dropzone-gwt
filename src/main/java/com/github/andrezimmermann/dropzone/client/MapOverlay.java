package com.github.andrezimmermann.dropzone.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple overlay for a javascript dictionary
 * @author andrezimmermann
 *
 */
class MapOverlay extends JavaScriptObject {
    protected MapOverlay() {

    }

    protected final static native MapOverlay create()/*-{
                                                   return {};
                                                   }-*/;

    public native final void put(String key, String value)/*-{
                                                        this.key = value;
                                                        }-*/;

}
