package com.handlers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldHandlers {

    public static boolean isValid(String str) {

        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();

    }

}
