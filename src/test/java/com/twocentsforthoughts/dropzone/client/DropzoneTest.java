package com.twocentsforthoughts.dropzone.client;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.RootPanel;
import com.twocentsforthoughts.dropzone.client.interfaces.DropzoneOptions;
import org.junit.Test;


public class DropzoneTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.twocentsforthoughts.dropzone.TestModule";
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