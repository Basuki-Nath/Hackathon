

public class BreakLine {
	
	String [] words;
	
	public BreakLine(String line) {
		words=GetWords(line);
	}
	
	String [] GetWords(String line)
	{
		words=line.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			RemoveSpecialChars ob=new RemoveSpecialChars(words[i]);
			words[i]=ob.str;
		}
		return words;
	}
	
	static void Test()
	{
		String line="Prints Hello World to the terminal window";
		BreakLine ob=new BreakLine(line);
		for (int i = 0; i < ob.words.length; i++) 
		{
			System.out.println(ob.words[i]);
		}
	}
	
	public static void main(String[] args) {
		Test();
	}

}
