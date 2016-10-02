

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class GetLanguage {
	
	HashMap<String,Integer> langCount=new HashMap<String,Integer>();
	public GetLanguage(File file, HashMap<String,String[]> langs) {
		for (String s: langs.keySet()) {
			WordsCount ob=new WordsCount(file,langs.get(s));
			langCount.put(s, ob.count);
		}	
	}
	int findMax(Collection<Integer> c)
	{
		int a=0;
		for (int i:c) {
			if (a<i) {
				a=i;
			}
		}
		return a;
	}
	ArrayList<String> getMaxKeys(int a, HashMap<String,Integer> hm)
	{
		ArrayList<String> b=new ArrayList<String>();
		for (String k : hm.keySet()) {
			if (hm.get(k)==a) {
				b.add(k);
			}
		}
		return b;
	}
	ArrayList<String> find()
	{
		ArrayList<String> l=new ArrayList<String>();
		l=getMaxKeys(findMax(langCount.values()), langCount);
		return l;
	}
	
	static void Test()
	{
		HashMap<String,String[]> langs=new HashMap<String,String[]>();
		String[] java_keyword = {
				"abstract",	"continue",	"for"	,"new",	"switch",
				"assert",	"default","goto","package","synchronized","boolean"	,
				"do","if","private","this","break","double","implements","protected","throw",
				"byte","else","import","public","throws","case","enum","instanceof","return",
				"transient","catch","extends","int","short","try","char","final","interface",
				"static","void","class","finally","long","strictfp","volatile","const","float",
				"native","super","while"};
		
		
		
		String[] cpp_keyword = { "alignas","alignof","and","and_eq","asm","atomic_cancel","atomic_commit","atomic_noexcept","auto","bitand",
									"bitor","bool","break","case","catch","char","char16_t","char32_t","class","compl",
									"concept","const","constexpr","const_cast","continue","decltype","default","delete","do","double",
									"dynamic_cast","else","enum","explicit","export","extern","false","float","for","friend",
									"goto","if","inline","int","import","long","module","mutable","namespace","new",
									"noexcept","not","not_eq","nullptr","operator","or","or_eq","private","protected","public",
									"register","reinterpret_cast","requires","return","short","signed","sizeof","static","static_assert","static_cast",
									"struct","switch","synchronized","template","this","thread_local","throw","true","try","typedef",
									"typeid","typename","union","unsigned","using","virtual","void","volatile","wchar_t","while",
									"xor","xor_eq","override","final","transaction_safe","transaction_safe_dynamic","printf","scanf"
									 };

		
		String[] python_keyword = { "false","class","finally","is", "return", "none","continue","for","lambda","try",
				"true","def","from","nonlocal","while","with","not","global","del","and","as","elif","if","or","yield",
				"assert","else","import","pass","break","except","in","raise" };
		
		String[] js_keyword = {"break", "case", "catch", "continue", "debugger", "default", "delete", "do", "else", "false",
				"finally", "for", "function", "if", "in", "instanceof", "new", "null", "return", "switch", "this", "throw", 
				"true", "try", "typeof", "var", "void", "while", "with"};
		
		String[] ruby_keyword = {"BEGIN", "END", "__ENCODING__", "__END__", "__FILE__", "__LINE__", "alias",
				"and", "begin", "break", "case", "class", "def", "defined?", "do", "else", "elsif", "end", "ensure",
				"false", "for", "if", "in", "module", "next", "nil", "not", "or", "redo", "rescue", "retry", "return", 
				"self", "super", "then", "true", "undef", "unless", "until", "when", "while", "yield"};
		
		String[] perl_keyword = {"__DATA__", "else", "lock", "qw", "__END__", "elsif", "lt", "qx", "__FILE__", "eq", "m", "s",
				"__LINE__", "exp", "ne", "sub", "__PACKAGE__", "for", "no", "tr", "and", "foreach", "or", "unless", "cmp", "ge",
				"package", "until", "continue", "gt", "q", "while", "CORE", "if", "qq", "xor", "do", "le", "qr", "y"};
		langs.put("c/c++", cpp_keyword);
		langs.put("python", python_keyword);
		langs.put("java Script", js_keyword);
		langs.put("ruby", ruby_keyword);
		langs.put("perl", perl_keyword);
		langs.put("java", java_keyword);
		
		Scanner fl = null;
        Scanner input = new Scanner(System.in);
        File file = new File(input.nextLine());
        
		GetLanguage ob=new GetLanguage(file, langs);
		System.out.println("Possible Languages:");
		for (String l: ob.find()) {
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test();
	}

}
