package com.endava.main;

import com.endava.service.MobileService;

/**
 * Created by lex on 26.03.2017.
 */

public class Main {
    public static void main(String[] args) {
        MobileService.validateNumber();
        MobileService.validateAmountOfMoney();
    }
}
