package com.endava.utilities;

import java.io.BufferedReader;
import java.io.*;

/**
 * Created by lex on 26.03.2017.
 */
public class Utilities {

    public static String readString() {
        BufferedReader box = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = box.readLine();
        } catch (IOException e) {

        }
        return str;
    }

    public static int convertStringToInt() {
        return (Integer.valueOf(readString())).intValue();
    }

    public static float convertStringToFloat() {
        return (Float.valueOf(readString())).floatValue();
    }

}
