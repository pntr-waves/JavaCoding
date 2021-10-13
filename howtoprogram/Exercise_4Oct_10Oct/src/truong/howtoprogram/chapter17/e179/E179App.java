package truong.howtoprogram.chapter17.e179;

import java.io.IOException;

import truong.howtoprogram.chapter17.e179.service.E179Service;

public class E179App {
//	Modify the program of Fig. 17.17 to summarize
//	the number of occurrences of every character in the file.
	public static void main(String[] args) {
		E179Service service = new E179Service();
		try {
			service.getSumarize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
