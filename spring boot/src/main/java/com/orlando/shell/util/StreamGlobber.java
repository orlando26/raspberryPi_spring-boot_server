package com.orlando.shell.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class StreamGlobber implements Runnable{

	private InputStream inputStream;
    private Consumer<String> consumer;
    
    private String shellOutput;
    
    public static boolean isWindows = System.getProperty("os.name")
    		  .toLowerCase().startsWith("windows");
 
    public StreamGlobber(InputStream inputStream, Consumer<String> consumer) {
        this.inputStream = inputStream;
        this.consumer = consumer;
    }
	
	@Override
	public void run() {
		 new BufferedReader(new InputStreamReader(inputStream)).lines()
         .forEach(consumer);
		
	}

	public String getShellOutput() {
		return shellOutput;
	}

	public void setShellOutput(String shellOutput) {
		this.shellOutput = shellOutput;
	}

}
