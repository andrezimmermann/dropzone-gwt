package com.github.andrezimmermann.dropzone.client.data;

import com.github.andrezimmermann.dropzone.client.interfaces.File;
import com.google.gwt.core.client.JavaScriptObject;

import java.util.Date;

public class FileJS extends JavaScriptObject implements File {

    protected FileJS() {
    }

    @Override
    public final native Date lastModifiedDate() /*-{
                                              return this.lastModifiedDate;
                                              }-*/;

    @Override
    public final native String name() /*-{
                                    return this.name;
                                    }-*/;

    @Override
    public final native Integer size() /*-{
                                     return this.size != null ? @java.lang.Integer::valueOf(I)(this.value) : null;
                                     }-*/;

    @Override
    public final native String status() /*-{
                                      return this.status;
                                      }-*/;

}
