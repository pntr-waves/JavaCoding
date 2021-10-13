package truong.howtoprogram.chapter17.e1710;

import java.io.IOException;
import java.nio.file.Paths;

import truong.howtoprogram.chapter17.e1710.service.E1710Service;

public class E1710App {
//	
//	Section 15.3 demonstrated how to get infor-
//	mation about files and directories on disk. In addition, you used a DirectoryStream to display the
//	contents of a directory. Interface DirectoryStream now contains default method entries, which
//	returns a Stream. Use the techniques from Section 15.3, DirectoryStream method entries, lamb-
//	das and streams to summarize the types of files in a specified directory.
	public static void main(String[] args) {
		var myPath = Paths.get("C:/Users/Truong/Downloads");
		E1710Service service = new E1710Service();
		
		System.out.println("Content of path " + myPath + "\n");
		try {
			var paths = service.demo(myPath);
			
			paths.forEach(path -> System.out.println(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nType of file\n");
		try {
			service.getSumariesTypeFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
