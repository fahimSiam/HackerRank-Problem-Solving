import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ContentExtractor {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
		
		while (numSentences-- > 0) {
				String line =in.nextLine();
				boolean matched=false;
				Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
				Matcher m = p.matcher(line);
				while(m.find()){
					System.out.println(m.group(2));
					matched=true;
				}
				if(!matched){
					System.out.println("None");
				}
			
		}
		in.close();
	}
	}
