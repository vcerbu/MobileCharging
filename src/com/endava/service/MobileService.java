package com.endava.service;

import com.endava.utilities.Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by lex on 26.03.2017.
 */

public class MobileService {

    public static Calendar cal;

    public static String validateNumber() {
        cal = Calendar.getInstance();
        System.out.println("------------------------------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time: " + sdf.format(cal.getTime()));
        System.out.println("MobileService.validateNumber():\nThe user is required to introduce the phone number" +
                " at most 4 times \nand the method will validate this number according to a specific pattern");
        int numberOfTries = 0;
        boolean flag = false;
        do {
            System.out.println("Introduce your phone number: ");
            String number = Utilities.readString();
            numberOfTries++;
            if (number.matches("[+]{1}[(]*[3][7][3][)]*(([ ]|-)*\\d{1}){8}"))
            {
                flag = true;
                System.out.println("You introduced number: " + number);
                return number;
            } else
                System.out.println("You should introduce something like:\n'+373 60 066006' OR\n" +
                        "'+(373)-79-85-85-85' OR\n" +
                        "'+373 79 666-999' OR\n");
        }
        while (flag == false && numberOfTries < 4);
        System.exit(0);
        return "";
    }

    public static int validateAmountOfMoney() {
        cal = Calendar.getInstance();
        System.out.println("------------------------------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time: " + sdf.format(cal.getTime()));
        System.out.println("MobileService.validateAmountOfMoney():\nThe user is required to introduce " +
                "at most 3 times the amount of money \nto top up the phone with a value between 10 and 500 ");
        int numberOfTries = 0;
        boolean flag = false;
        do {
            System.out.println("Introduce the amount of money: ");
            int amount = Utilities.convertStringToInt();
            numberOfTries++;
            if ((amount > 9) && (amount < 501)) {
                flag = true;
                System.out.println("You introduced amount: " + amount);
                return amount;
            } else
                System.out.println("You should introduce a value between 10 and 500");
        }
        while (flag == false && numberOfTries < 3);
        System.exit(0);
        return 0;
    }

}
