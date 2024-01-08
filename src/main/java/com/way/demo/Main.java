package com.way.demo;

/**
 * main
 * self testing case in  UnitTest
 *
 * @author wayleung
 * @date 2024/01/03
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== findIdenticalLetterStage1 start ====");
        findIdenticalLetterStage1("aabcccbbad");
        System.out.println("=== findIdenticalLetterStage1 end ====");

        System.out.println("=== findIdenticalLetterStage2 start ====");
        findIdenticalLetterStage2("abcccbad");
        System.out.println("=== findIdenticalLetterStage2 end ====");
    }

    static String findIdenticalLetterStage1(String inputStr) {
        System.out.println("->"+inputStr);

        char[] chars = inputStr.toCharArray();
        int sameCount = 1;

        String newStr = inputStr;
        for (int i = 0; i < chars.length; i++) {
            if (i >= 1) {
                //跟上一个字符一样 +1
                if (chars[i] == chars[i - 1]) {
                    sameCount++;
                    if (sameCount >= 3) {
                        newStr = inputStr.substring(0, i - 2) + inputStr.substring(i + 1, chars.length);
                        break;
                    }
                } else {
                    //不一样重置为1
                    sameCount = 1;
                }
            }
        }

        if (newStr.equals(inputStr)) {
            return null;
        }
        return findIdenticalLetterStage1(newStr);
    }


    static String findIdenticalLetterStage2(String inputStr) {
        System.out.println("->"+inputStr);

        char[] chars = inputStr.toCharArray();
        int sameCount = 1;

        String newStr = inputStr;
        for (int i = 0; i < chars.length; i++) {
            if (i >= 1) {
                //跟上一个字符一样 +1
                if (chars[i] == chars[i - 1]) {
                    sameCount++;
                    if (sameCount >= 3) {
                        //上一个字符的前一个字母
                        char beforeLetter = (char) (chars[i] - 1);
                        newStr = inputStr.substring(0, i - 2) + beforeLetter + inputStr.substring(i + 1, chars.length);
                        //限制不小于a
                        if (beforeLetter < 'a') {
                            newStr = inputStr.substring(0, i - 2) + inputStr.substring(i + 1, chars.length);
                        }
                        break;
                    }
                } else {
                    //不一样重置为1
                    sameCount = 1;
                }
            }
        }

        if (newStr.equals(inputStr)) {
            return null;
        }
        return findIdenticalLetterStage2(newStr);
    }

}
