package common;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Utils {
    public static String generateRandomString(int minLength, int maxLength, boolean useLetters, boolean useNumbers) {
        Random random = new Random();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
