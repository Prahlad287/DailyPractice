package com.io;

import java.io.File;

public class CheckDirectoryAndFilesRecursive {
	static int Mainfoldercount = 0;
	static int Subfoldercount = 0;

	public static void fileAndDirectories(String folderPath) {
		File folder = new File(folderPath);
		if (folder.isDirectory()) {
			Mainfoldercount++;
			String[] filesAndDirectory = folder.list();
			if (filesAndDirectory != null) {
				System.out.println("Files and directories in " + folderPath + ":");
				for (String name : filesAndDirectory) {
					String fullPath = folderPath + "\\" + name;
					System.out.println(fullPath);
					
					File fileordir = new File(fullPath);
					if (fileordir.isDirectory()) {
						fileAndDirectories(fullPath);
						Subfoldercount++;
					}
				}
			} else {
				System.out.println("No files or directories found in " + folderPath);
			}
		} else {
			System.out.println(folderPath + " is not a directory.");
		}
	}

	public static void main(String[] args) {
		String folderPath = "D:";
		fileAndDirectories(folderPath);
		System.out.println("Total Main folder :" + Mainfoldercount);
		System.out.println("Total Sub folder :" + Subfoldercount);
	}

}
