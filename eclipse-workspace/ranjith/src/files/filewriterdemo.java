package files;

import java.io.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.*;

public class filewriterdemo {

	public void writetofile(File filetowriteto) throws IOException {
		FileWriter bikeinfo = new FileWriter(filetowriteto);
		//bikeinfo.flush();
		bikeinfo.write("i am a \ngoodboy");
		bikeinfo.flush();
		bikeinfo.close();
	}

	public void readfile(File readfile) throws FileNotFoundException {
		Scanner sc = new Scanner(readfile);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		filewriterdemo fwd = new filewriterdemo();
		File bikeinfo = new File("C:\\files_demo\\bikeinfo.txt");
		fwd.writetofile(bikeinfo);
		fwd.readfile(bikeinfo);
	}

}
