package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try (FileWriter fr = new FileWriter("try.txt");
				BufferedWriter br = new BufferedWriter(fr)) {
			br.write("Hello Prahlad");
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
