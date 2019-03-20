import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumber {
	public String validation(){
//	    String phoneRegex = ("^\\+88(?:[0-9] ?){10}[0-9]$");
//	    //"^(((+88|00)?880)|0){10}$"
//	    //"^\\+(?:[0-9] ?){6,14}[0-9]$"
//		Pattern phonePat = Pattern.compile(phoneRegex,Pattern.CASE_INSENSITIVE);
//		Matcher m = phonePat.matcher(s);
//		
//	    return (m.find() && m.group().equals(s));
		
		//By Sir
		String number="01730281708";
		if(number.length() != 11 ) {
			return "Invalid";
		}else if(number.startsWith("017")||number.startsWith("016")||number.startsWith("018")||number.startsWith("019")){
			return "Success->Grameen,airtel,robi,Banglalink";
		}
		else{
			return "Invalid";
		}
	}
}