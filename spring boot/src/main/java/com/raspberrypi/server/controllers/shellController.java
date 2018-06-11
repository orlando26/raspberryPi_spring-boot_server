package com.raspberrypi.server.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raspberrypi.server.model.Command;
import com.raspberrypi.server.util.ShellScript;

@RestController
@RequestMapping("/raspberry")
public class shellController {

	@GetMapping()
	public String state() {
		return "Working...";
	}

	@PostMapping("/functions")
	public String execute(@RequestBody Command command) throws IOException, InterruptedException {
		String homeDirectory = System.getProperty("user.home") + "/server_functions/shell_functions.sh ";
		String result = ShellScript.executeCommand(homeDirectory.concat(command.getFunction()).split(" "));
		return result;
	}

}
