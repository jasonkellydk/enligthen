/*
 * This is the enlighten Validation class. It may be used to validate user input.
 * Made with <3 by Jason kelly.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    /**
     * Validate email
     * @param email
     * @return
     */
    public Boolean vEmail(String email)
    {
        String EMAIL_REGIX = "^.+@.+\\..+$";
        Pattern pattern = Pattern.compile(EMAIL_REGIX);
        Matcher matcher = pattern.matcher(email);


        return ((!email.isEmpty()) && (email != null) && (matcher.matches()));
    }

    /**
     * Validate min length
     * @param text
     * @param length
     * @return
     */
    public Boolean vMinLength(String text, int length)
    {

        return text.length() >= length;
    }

    /**
     * validate passwords
     * @param password
     * @param passwordRepeat
     * @return
     */
    public Boolean vPassword(String password, String passwordRepeat)
    {
        return password.equals(passwordRepeat);
    }

}
