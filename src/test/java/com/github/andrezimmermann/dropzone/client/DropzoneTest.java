package com.github.andrezimmermann.dropzone.client;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.andrezimmermann.dropzone.client.interfaces.DropzoneOptions;
import com.github.andrezimmermann.dropzone.client.interfaces.File;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.RootPanel;

public class DropzoneTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.github.andrezimmermann.dropzone.TestModule";
	}


	@Test
	public void testRemoveFileFromDropzone() {
		//TODO Too long refactor to 4 separated test cases when in a proper IDE
		Dropzone dropzone = createDefaultDropzoneWidget();
		int filesExpected = 5;

		for (int i = filesExpected; i > 0; i--) {
			String indexString = String.valueOf(i);
			dropzone.addFile("Fake File " + indexString, i, "/fakeFileUrl" + indexString);
		}

		int filesCount = dropzone.getFilesCount();

		assertEquals("Files werent added properly"  ,filesExpected, filesCount);


		ArrayList<File> files = dropzone.getFiles();

		//Try delete the second 

		File removedFile = files.get(1);
		dropzone.removeFile(removedFile);

		assertEquals(filesExpected -1, dropzone.getFilesCount());

		files = dropzone.getFiles();

		assertFalse("Should have removed the file!", files.contains(removedFile));

		
		testRemoveLastFile(dropzone);
		testRemoveMiddleFile(dropzone);
		testRemoveFirstFile(dropzone);
		
		
		dropzone.removeAllFiles();
		filesCount = dropzone.getFilesCount();
		assertEquals("Files werent removed properly"  ,0, filesCount);

	}


	private void testRemoveFirstFile(Dropzone dropzone) {
		removeFileTest(dropzone, "Should have removed first file!", 0);
	}


	private void testRemoveMiddleFile(Dropzone dropzone) {
		removeFileTest(dropzone, "Should have removed 2nd file!", 1);
	}


	private void testRemoveLastFile(Dropzone dropzone) {
		String message = "Should have removed the last file!";
		
		int indexToRemove = 3;

		removeFileTest(dropzone, message, indexToRemove);
	}


	private void removeFileTest(Dropzone dropzone, String message, int indexToRemove) {
		List<File> files = dropzone.getFiles();
		File anotherRemovedFile = files.get(indexToRemove);
		dropzone.removeFile(indexToRemove);
		files = dropzone.getFiles();
		assertFalse(message, files.contains(anotherRemovedFile));
	}

	@Test
	public void testShouldCreateDefaultDropzone() {

		createDefaultDropzoneWidget();

	}


	private Dropzone createDefaultDropzoneWidget() {
		DropzoneOptions options = Dropzone.options();
		options.setUrl("/upload");

		Dropzone dropzone = new Dropzone(
				options
				);

		assertNotNull(dropzone);

		RootPanel.get().add(dropzone);
		assertTrue(dropzone.isAttached());

		return dropzone;
	}

}
