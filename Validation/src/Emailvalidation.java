import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {
	public static String valEmail(String input){
		String emailRegex = "^[\\u0E00-\\u0E7FA-Z0-9._%+-]+@[\\u0E00-\\u0E7FA-Z0-9.-]+\\.[\\u0E00-\\u0E7FA-Z]{2,20}$";
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
//		return "matcher.find(): "+matcher.find();
		if(matcher.find()) {
			return "Email validation success";
		}else {
			return "Email validation Failed";
		}
	}
}
