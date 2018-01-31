
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidaCPF {
    private Pattern pattern;
    private Matcher matcher;
    private final String regexCPF = "([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})-[0-9]{2}";
    
    public ValidaCPF() {
	pattern = Pattern.compile(regexCPF);
    }
    
    public boolean validate(final String hex) {
	matcher = pattern.matcher(hex);
	return !matcher.matches();

    }
}