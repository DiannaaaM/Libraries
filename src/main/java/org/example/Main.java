package org.example;

import org.apache.commons.lang3.StringUtils;
import org.example.BadRequestException;

public class Main {
    public static void main(String[] args) throws BadRequestException {
        String name = "Ivan";
        String surname = "Ivanov";

        if (!StringUtils.isAlpha(name)) {
            throw new BadRequestException("Invalid name");
        } else {
            String capitalizedName = StringUtils.capitalize(name);
            System.out.println( "All information about name is right" );
        }

        if (!StringUtils.isAlpha(surname)) {
            throw new BadRequestException("Invalid surname");
        } else {
            String capitalizedSurname = StringUtils.capitalize(surname);
            System.out.println( "All information about surname is right" );
        }
    }
}
