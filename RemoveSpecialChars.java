

public class RemoveSpecialChars {
	
	String str;
	
	RemoveSpecialChars(String s)
	{
		str=s;
		Remove();
	}
	
	void Remove()
	{
		str = str.replaceAll("[!?,.;//\\(){}\"]", " ").replaceAll("\\s+"," ").trim();
	}
	
	static void Test()
	{
		RemoveSpecialChars ob=new RemoveSpecialChars("        // Prints \"Hello, World\" to the terminal window.");
		System.out.println(ob.str);
	}

	public static void main(String[] args) {
		Test();
	}
}
