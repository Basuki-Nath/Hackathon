
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileToWords {
	int count;
	BreakFile ob;
	ArrayList<String> words;
	
	FileToWords(File file, String compareWith) {
		words=GetWords(file,compareWith);
	}
	
	ArrayList<String> GetWords(File file,String compareWith)
	{
		ArrayList<String> arrL=new ArrayList<String>();
		ob=new BreakFile(file);

		for (String s: ob.lines) {
			BreakLine ob1=new BreakLine(s.toString());
			for (String h: ob1.words) {
				if (compareWith.equals(h)) {
					count=1;
				}
				arrL.add(h);
			}
		}

		return arrL;
	}
	
	static void Test()
	{
        Scanner input = new Scanner(System.in);
        File file = new File(input.nextLine());
		FileToWords ob = new FileToWords(file,"public");
		for (String m: ob.words) {
			System.out.println(m);
		}
		
		System.out.println(ob.count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test();
	}

}
