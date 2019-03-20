import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {
	public static String valEmail(){
		String input="pritamewu@naztech.io";
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
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
