package cz.vsimanek.examples.javafaker.utils;

import org.apache.commons.lang3.StringUtils;

public class EmailUtils {

    /**
     * Method takes first and last name of user and creates email from them. Method also converts both names part to lower
     * case and strips accents if it is present. After @ it uses mailinator.com for preventing creating emails that actually exists.
     *
     * @param firstName of the Person.
     * @param lastName  of the Person.
     * @return created email value firstname.lastname@mailintor.com.
     */
    public static String email(String firstName, String lastName) {
        return StringUtils.stripAccents(firstName).toLowerCase() + "." + StringUtils.stripAccents(lastName).toLowerCase() + "@mailinator.com";
    }
}
