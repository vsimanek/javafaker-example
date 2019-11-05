package cz.vsimanek.examples.javafaker.utils;

import org.apache.commons.lang3.StringUtils;

public class EmailUtils {

    public static String email(String firstName, String lastName) {
        return StringUtils.stripAccents(firstName).toLowerCase() + "." + StringUtils.stripAccents(lastName).toLowerCase() + "@mailinator.com";
    }
}
