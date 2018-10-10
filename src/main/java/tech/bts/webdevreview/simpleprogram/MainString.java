package tech.bts.webdevreview.simpleprogram;

import tech.bts.webdevreview.classes.util.StringUtil;

public class MainString {

    public static void main(String[] args) {

        System.out.println(StringUtil.repeatString("go",3));
        System.out.println(StringUtil.repeatString("xxx",0));

        System.out.println(StringUtil.padLeft("go", 6));
        System.out.println(StringUtil.padLeft("gone", 6));

        System.out.println(StringUtil.padRight("go", 6) + "go");
        System.out.println(StringUtil.padRight("gone", 6) + "gone");

        System.out.println(StringUtil.repeatString(StringUtil.padRight("go",5),3));

        System.out.println(StringUtil.listOfNumbers(3, 18));
    }
}
