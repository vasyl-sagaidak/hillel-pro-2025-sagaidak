package org.example;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_SYMBOL = "!@#$%^&*()_+-=?";
    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_SYMBOL;
    private final SecureRandom random = new SecureRandom();

    public String generatePassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length of the password should be greater than 0.");
        }

        StringBuilder builder = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            int randomCharIndex = random.nextInt(PASSWORD_ALLOW_BASE.length());
            builder.append(PASSWORD_ALLOW_BASE.charAt(randomCharIndex));
        }
        return builder.toString();
    }
}
