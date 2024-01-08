package com.way.demo;

import org.junit.Test;

/**
 * unit test
 *
 * @author wayleung
 * @date 2024/01/03
 */
public class UnitTest {

    @Test
    public void test1001() {
        String oriStr = "aabcccbbad";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1002() {
        String oriStr = "a";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1003() {
        String oriStr = "aaa";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1004() {
        String oriStr = "abc";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1005() {
        String oriStr = "aa";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1006() {
        String oriStr = "aaabbb";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1007() {
        String oriStr = "";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1008() {
        String oriStr = "abcccbad";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test1009() {
        String oriStr = "aaaaaaaa";
        Main.findIdenticalLetterStage1(oriStr);
        System.out.println("=====end====");
    }


    @Test
    public void test2001() {
        String oriStr = "abcccbad";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2002() {
        String oriStr = "bbccc";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2003() {
        String oriStr = "cccbb";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2004() {
        String oriStr = "bcccb";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2005() {
        String oriStr = "ccc";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2006() {
        String oriStr = "abc";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2007() {
        String oriStr = "a";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2008() {
        String oriStr = "ab";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }

    @Test
    public void test2009() {
        String oriStr = "abcdccc";
        Main.findIdenticalLetterStage2(oriStr);
        System.out.println("=====end====");
    }
}
