package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidaEmail {

    private Pattern pattern;
    private Matcher matcher;
    private final String regex = "[A-Za-z0-9_.-]+@([A-Za-z0-9_]+\\.)+[A-Za-z]{2,3}";
    
    public ValidaEmail() {
	pattern = Pattern.compile(regex);
    }
    
    public boolean validate(final String hex) {
	matcher = pattern.matcher(hex);
	return !matcher.matches();

    }
}
