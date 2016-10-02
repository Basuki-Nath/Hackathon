
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {
	
	int count;
	public WordsCount(File file,String[] keyList) {
		count=Count(file, keyList);
	}
	
	int Count(File file,String[] keyList)
	{
		for (int i = 0; i < keyList.length; i++) {
			FileToWords gaw=new FileToWords(file, keyList[i]);
			count+=gaw.count;
		}
		return count;
	}
	
	static void Test()
	{
        Scanner input = new Scanner(System.in);
        File file = new File(input.nextLine());
		String [] a={"World","terminal","window","out","System","Hello","println"};
		WordsCount ob=new WordsCount(file, a);
		System.out.println(ob.count);
	}
	
	public static void main(String[] args) {
		Test();
	}
}
