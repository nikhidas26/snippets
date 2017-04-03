package com.nikhil.log.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Nikhil Das Nomula
 * 
 * Test slf4j logging
 *
 */
public class Main {
	
	private final static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		System.out.println("Hello World");
		log.info("Test logg");
		String fileName = "asf";
		
		Pojo pojo = new Pojo();
		pojo.setProperty1("Property 1");
		pojo.setProperty2("Property 2");
		pojo.setProperty3("Property 3");
		pojo.setProperty4("Property 4");
		
		AnotherPojo anotherPojo = new AnotherPojo();
		anotherPojo.setProperty5("Property 5");
		anotherPojo.setProperty5("Property 6");
		
		pojo.setAnotherPojo(anotherPojo);
		
		try {
			File f = new File(fileName);
			f.exists();
			f.canRead();
			
			List<Object> asdf = new ArrayList<Object>();
			Stream<String> stream = Files.lines(f.toPath());
			asdf = stream.collect(Collectors.toList());
			stream.close();
		}
		catch (IOException e) {
			log.error("IOException while reading file: " + fileName
					+ ". here are the pojo details: " + pojo
					+ ". Here are the exception details:", e);
			
			log.error("IOException while reading file: {}. "
					+ "Here are the exception details: {}", fileName, e.getMessage());
		}
	}
}


// Output

/*Mar 31, 2017 10:09:38 AM com.nikhil.log.test.Main main
INFO: Test logg
Mar 31, 2017 10:09:38 AM com.nikhil.log.test.Main main
SEVERE: IOException while reading file: asf. Here are the exception details: 
java.nio.file.NoSuchFileException: asf
	at sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:79)
	at sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:97)
	at sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:102)
	at sun.nio.fs.WindowsFileSystemProvider.newByteChannel(WindowsFileSystemProvider.java:230)
	at java.nio.file.Files.newByteChannel(Files.java:361)
	at java.nio.file.Files.newByteChannel(Files.java:407)
	at java.nio.file.spi.FileSystemProvider.newInputStream(FileSystemProvider.java:384)
	at java.nio.file.Files.newInputStream(Files.java:152)
	at java.nio.file.Files.newBufferedReader(Files.java:2784)
	at java.nio.file.Files.lines(Files.java:3744)
	at java.nio.file.Files.lines(Files.java:3785)
	at com.nikhil.log.test.Main.main(Main.java:28)

Mar 31, 2017 10:09:38 AM com.nikhil.log.test.Main main
SEVERE: IOException while reading file: asf. Here are the exception details: */

/*
RESULT:

Just use e. e.getMessage nah

*/