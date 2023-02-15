package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = scan.next();
		
		File path = new File(strPath);
		
		//Listando diretórios
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders:");
		for (File file : folders) {
			System.out.println(file);
		}
		
		System.out.println();
		
		//Listando Arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		//Criando diretórios
		System.out.print("Create a subdir? (y/n): ");
		char createFolder = scan.next().charAt(0);
		
		if (createFolder == 'y') {
			System.out.print("Name: ");
			String nameSubDir = scan.next();
			
			boolean success = new File(strPath + "\\" + nameSubDir).mkdir();
			System.out.println("Directory was created: " + success);
		}
		
		scan.close();
		
	}

}
