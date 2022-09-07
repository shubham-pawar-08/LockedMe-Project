package simplilearnFinalProject;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class LockedMe 

{
	static final String projectFilesPath = "C:\\Users\\KP\\eclipse-workspace\\LockedMeFile";

	public static void displayMenu() {
			System.out.println("*****************************************************");
			System.out.println("\tWelcome to LockedMe.com secure app");
			System.out.println("\tDeveloped by : Shubham Pawar");

			System.out.println("*****************************************************");
			System.out.println("\t\t 1. Display all the files");
			System.out.println("\t\t 2. Add a new file");
			System.out.println("\t\t 3. Delete a file");
			System.out.println("\t\t 4. Search a file");
			System.out.println("\t\t 5. Exit");
	}
public static void getAllFiles() {
	File folder = new File(projectFilesPath);
	File[] listofFile = folder.listFiles();
	if(listofFile.length>0) {
		System.out.println("Files list is displayed below:");
		for(var l:listofFile) {
			System.out.println(l.getName());
			
		}
	}
	else
	{
		System.out.println("folder is empty");
	}
	
}
public static void createFiles() {
	try {
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter the file name");
	fileName = obj.nextLine();
	
	int linesCount;
	System.out.println("Enter how many files in line:");
	linesCount = Integer.parseInt(obj.nextLine());
	
	FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
	for (int i=1; i<=linesCount;i++) {
		System.out.println("Enter file line:");
		fw.write(obj.nextLine() + "\n");
		
	}
	System.out.println("File created successfully and content added");
	fw.close();
}catch(Exception e) {
	}
	
}
public static void deleteFiles() {
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter the file name:");
	fileName = obj.nextLine();
	File f = new File(projectFilesPath+"\\"+fileName);
	if(f.exists()) {
		f.delete();
		System.out.println("File deleted successfully");
	}
	else {
		System.out.println("File does not exists");
	}
}

public static void searchFiles() {
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter the file name:");
	fileName =obj.nextLine();
	File f = new File(projectFilesPath+"\\"+fileName);
	if(f.exists()) {
		System.out.println("File found");
	}
	else
	{
		System.out.println("File not found");
	}
}

}
