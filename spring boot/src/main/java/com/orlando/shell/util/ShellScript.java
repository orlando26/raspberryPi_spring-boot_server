package com.orlando.shell.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShellScript {
	
	public static String executeCommand(String command) {
	    StringBuffer output = new StringBuffer();
	    String homeDirectory = System.getProperty("user.home") + "/";
	    Process p;
	    try {
	      p = Runtime.getRuntime().exec(homeDirectory + command);
	      // p.waitFor();	
	      InputStreamReader in = new InputStreamReader(p.getInputStream());
	      BufferedReader reader = new BufferedReader(in);
	      String line = "";
	      while ((line = reader.readLine()) != null) {
	        output.append(line + "\n");
	      }
	      p.destroy();
	      reader.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return output.toString();
	  }

}
