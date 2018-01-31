
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidaTelefone {
    private Pattern pattern;
    private Matcher matcher;
    private final String regexTelefone = "([0-9]{2}) ?([0-9]{9})|([0-9]{5}-[0-9]{4})";
    
    public ValidaTelefone() {
	pattern = Pattern.compile(regexTelefone);
    }
    
    public boolean validate(final String hex) {
	matcher = pattern.matcher(hex);
	return !matcher.matches();

    }
}