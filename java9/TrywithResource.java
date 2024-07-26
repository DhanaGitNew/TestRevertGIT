package com.java9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TrywithResource {

	public static void main(String[] args) throws FileNotFoundException {
		// Before Try with resource
		/*
		 * Scanner scanner=null; InputStream inputStream=null; try { inputStream = new
		 * FileInputStream(new File("test.txt")); scanner = new Scanner(inputStream);
		 * while (scanner.hasNext()) { String string = (String) scanner.nextLine();
		 * System.out.println(string);
		 * 
		 * } }catch(FileNotFoundException fe) {
		 * System.out.println(fe.getLocalizedMessage()); }finally { if(scanner!=null) {
		 * scanner.close(); } if(inputStream!=null) { scanner.close(); } }
		 */

		// Try with resource before java9

		/*
		 * try (InputStream inputStream = new FileInputStream(new File("test.txt"));
		 * Scanner scanner = new Scanner(inputStream)) {
		 * 
		 * while (scanner.hasNext()) { String string = (String) scanner.nextLine();
		 * System.out.println(string); }
		 * 
		 * } catch (IOException fe) { System.out.println(fe.getLocalizedMessage()); }
		 */

		// Try with resource enhancement
		InputStream inputStream = new FileInputStream(new File("test.txt"));
		Scanner scanner = new Scanner(inputStream);
		try (inputStream; scanner) {

			while (scanner.hasNext()) {
				String string = (String) scanner.nextLine();
				System.out.println(string);
			}

		} catch (IOException fe) {
			System.out.println(fe.getLocalizedMessage());
		}

	}

}
