package com.sharabaddin;

/**
 * Created by Sharabaddin on 7/10/17.
 * @author general1308@gmail.com
 */
public class ArtfulArithmetic {
    public static String multiBigInteger(String text, int multiNumber) {
        if (text != null && !text.isEmpty()) {
            if (multiNumber >= 1 && multiNumber <= 9 && isNumeric(text)) {

                // 900000000
                //x9i*
                //8100000000

                //appened 100000000 in string
                //save 8

                int firstOrderNumber;
                String withoutfirstOrderNumber;
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i <= text.length() / 8; i++) {
                    if(text.length() < 8) {
                        return "" + (multiNumber * Integer.parseInt(text));
                    }

                    // TODO: 7/12/17
                    String splitText = text.substring(i * 8, 8);
                    int resultMultiple = multiNumber * Integer.parseInt(splitText);
                    firstOrderNumber = resultMultiple / (int)Math.pow(10, 8);
                    if(firstOrderNumber != 0) {
                        withoutfirstOrderNumber = Integer.toString(resultMultiple);
                    } else {
                        withoutfirstOrderNumber = Integer.toString(resultMultiple).substring(0, 7);
                    }


                    stringBuilder.append(withoutfirstOrderNumber);
                }





                return stringBuilder.toString();
            }

        }
        return "";
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");  //match a number with optional '-' and decimal.
    }
}
