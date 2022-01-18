/*
 * Course: FIXME
 * Winter 2019-20
 * Homework 6 - Validation
 * Name: FIXME
 * Created: FIXME
 */
package FIXME;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * A database of Entry objects for a system
 */
public class Database {




    /**
     * Helper method that verifies the given String is a valid email using the following rules
     * <pre>
     * * starts with at least one letter, digit, or special character
     * * then has exactly one @ symbol
     * * then has one or more series of characters followed by a .
     * * ends with a series of between 2 and 7 letters (case does not matter)
     *</pre>
     * @param email String provided by user
     * @return true if a valid email, false otherwise
     */
    private boolean isEmail(String email) {
        /*
         *  https://www.geeksforgeeks.org/check-email-address-valid-not-java/
         *  https://www.regexpal.com/
         *  https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
         */
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)" +
                "+[a-zA-Z]{2,7}";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    /**
     * Helper method that verifies the given String is a valid password using the following rules
     * <pre>
     * * At least 8 characters
     * * At least one lowercase letter
     * * At least one uppercase letter
     * * At least one digit
     * * At least one special character
     * </pre>
     * @param password String provided by user
     * @return true if a valid password, false otherwise
     */
    private boolean isPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=]).{8,}$";

        Pattern pat = Pattern.compile(passwordRegex);
        if (password == null) {
            return false;
        }
        return pat.matcher(password).matches();
    }

// Inner Exception classes go here

}
