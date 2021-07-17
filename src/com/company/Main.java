package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1) {
            System.out.println("Value = 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 5;

        switch(switchValue) {  // can be used with byte short char and int
            case 1:
                System.out.println("Value = 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }


        char charSwitchValue = 'f';

        switch(charSwitchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E': // a is != A
                System.out.println("Char found was " + charSwitchValue);
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "JUNE";
        switch(month.toLowerCase()) { // convert to lowercase so search works regardless of input
            case "january":         // must be sure to test for lowercase
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }




    }
}
