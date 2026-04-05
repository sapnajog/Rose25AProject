package com.exception;

import java.io.FileReader;
import java.io.IOException;

public class Throws {
	
	static void readFile() throws IOException {
		FileReader fr = new FileReader("sshelloTeam.txt");
		
	}

	
	public static void main(String[] args) throws IOException {
		
		 readFile();
	}
}
