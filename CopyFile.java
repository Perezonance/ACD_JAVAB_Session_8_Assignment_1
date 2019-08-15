package assignment_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) {
		File f = new File("original.txt");
		File f2 = new File("originalCopy.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
			
			Scanner scan = new Scanner(f);
			
			while(scan.hasNext()){
				bw.write(scan.nextLine() + "\n");
				
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
