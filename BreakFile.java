
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BreakFile {
	ArrayList<String> lines;
	
	BreakFile(File file) {
		this.lines=GetLines(file);
	}
	
	ArrayList<String> GetLines(File file)
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<String> returning = null;
		ArrayList<String> l=new ArrayList<String>();
		String line;
		try {
			while ((line = br.readLine()) != null)
			{
			    if ((line.equals("")) || (line.trim().equals(null))) {
			    	 continue;
				}
			    RemoveSpecialChars ruc=new RemoveSpecialChars(line);
			    line=ruc.str.trim();
			    if (!(line.isEmpty()) && !(line.equals(null))) {
			        l.add(line);
				}
			    returning = l;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returning;
	}
	static void Test()
	{
		Scanner fl = null;
        Scanner input = new Scanner(System.in);
        File file = new File(input.nextLine());
		BreakFile ob=new BreakFile(file);
		for (int i = 0; i < ob.lines.size(); i++) {
			System.out.println(ob.lines.get(i));
		}
	}
	

	public static void main(String[] args) {
		Test();
	}
}
