import com.google.common.base.Joiner;


public class Main {
	
	public static void main (String[] args){
		Main main = new Main();
		System.out.println(main.joiner(args, ""));
	}
	
	public String joiner(String[] strArr, String seperator) {
		Joiner joiner = Joiner.on(seperator);
		String joinedString = joiner.join(strArr);
		System.out.println(joinedString);
		return joinedString;
	}

}
