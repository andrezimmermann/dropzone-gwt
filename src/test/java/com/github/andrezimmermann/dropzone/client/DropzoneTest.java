package com.github.andrezimmermann.dropzone.client;

import org.junit.Test;

import com.github.andrezimmermann.dropzone.client.interfaces.DropzoneOptions;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.RootPanel;

public class DropzoneTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.github.andrezimmermann.dropzone.TestModule";
    }

    @Test
    public void testShouldCreateDefaultDropzone() {

        DropzoneOptions options = Dropzone.options();
        options.setUrl("/upload");

        Dropzone dropzone = new Dropzone(
            options
            );

        assertNotNull(dropzone);

        RootPanel.get().add(dropzone);
        assertTrue(dropzone.isAttached());

    }

}
