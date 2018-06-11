package com.orlando.shell.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.shell.model.Command;
import com.orlando.shell.model.ShellResponse;
import com.orlando.shell.util.ShellScript;
import com.orlando.shell.util.StreamGlobber;

@RestController
@RequestMapping("/api/shell")
public class shellController {
	
	
	@GetMapping()
	public String state(){
		return "Working...";
	}
	
	@PostMapping("/commands")
	public String execute(@RequestBody Command command) throws IOException, InterruptedException{
		 String result = ShellScript.executeCommand(command.getCommands());
		return result;
	}
	

}
