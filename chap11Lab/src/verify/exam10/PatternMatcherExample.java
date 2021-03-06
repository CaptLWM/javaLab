package verify.exam10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "Angel1004";
		//String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		String regExp = "[a-zA-Z]\\w{7,11}";//\는 특수기호 두개를 써야함
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
