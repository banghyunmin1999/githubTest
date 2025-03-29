import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		String strInput = s.nextLine();
		int totalCount = strInput.length();
		String tr = "dz=";
		String[] croaList = {"c=" , "c-"  , "d-" , "lj" , "nj" , "s=" ,"z="};
		for (int i = 0; i < 7; i++ ) {
			for (int j = 0; j < strInput.length() -1; j++) {
				if (croaList[i].equals(strInput.substring(j, j+2))) {
					totalCount--;
					totalCount--;
					count++;
				}
			}
		}
		for (int j = 0; j < strInput.length()-2; j++) {
			if (tr.equals(strInput.substring(j, j+3))) {
				totalCount--;	
			}
		}
		System.out.println(count + totalCount);
		s.close();
	}
}
