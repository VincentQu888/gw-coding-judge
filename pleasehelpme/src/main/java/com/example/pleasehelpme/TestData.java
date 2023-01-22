package com.example.pleasehelpme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.*;
import java.io.*;

public class TestData {
	//basic skills trainig
	public static String[] basicskillstest1CASES(){
		String[] cases = {
			"3 5 5\n" +
			"1 1 3 1\n" +
			"4 3 5 2\n" +
			"2 1 1 1",
			"2 1 100\n" +
			"0 0 99 214748364" +
			"0 99 1 0",
			"1000 1000 5\n" +
			"0 0 2001 6\n" +
			"0 1 2001 8\n" +
			"1 0 2001 3\n"+
			"2 2 2001 5\n" +
			"5 5 1 10000"
		};
		return cases;
	}

	public static ArrayList<ArrayList<String>> basicskillstest1OUT(){
		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("2 1");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("0 0");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("5 5");

        return casesOut;
	}


	public static String[] basicskillstest2CASES(){ 
		String[] cases = {
			"100 5\n" +
			"33\n" +
			"66\n"+
			"15\n"+
			"1\n"+
			"24",
			"250 25\n"+
			"1\n" +
			"2\n" +
			"3\n" +
			"4\n" +
			"5\n" +
			"6\n" +
			"7\n" +
			"8\n" +
			"9\n" +
			"10\n" +
			"11\n" +
			"12\n" +
			"13\n" +
			"14\n" +
			"15\n" +
			"16\n" +
			"17\n" +
			"18\n" +
			"19\n" +
			"20\n" +
			"21\n" +
			"22\n" +
			"23\n" +
			"24\n" +
			"25"
		};
		return cases;
	}

	public static ArrayList<ArrayList<String>> basicskillstest2OUT(){
		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("3");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("10");

        return casesOut;
	}


	public static String[] basicskillstest3CASES(){ 
		String[] cases = {
			"4 4\n" +
			"1 2 5\n" +
			"1 3 6\n" +
			"2 3 7\n"+
			"3 4 8",
			"3 1\n" +
			"1 2 100",
			"5 8\n" +
			"1 2 8\n" +
			"2 3 7\n" +
			"3 4 2\n" +
			"1 5 9\n" +
			"4 2 5\n" +
			"5 4 3\n" +
			"5 3 7\n" +
			"5 2 6"
		};
		return cases;
	}

	public static ArrayList<ArrayList<String>> basicskillstest3OUT(){
		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("1 2");
		casesOut.get(0).add("1 3");
		casesOut.get(0).add("3 4");
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("-1");
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("3 4");
		casesOut.get(0).add("5 4");
		casesOut.get(0).add("4 2");
		casesOut.get(0).add("1 2");

        return casesOut;
	}
	


	public static String[] basicskillstest4CASES(){ 
		String[] cases = {
			"5 4\n" +
			"1 2\n" +
			"2 4\n"+
			"5 4\n" +
			"2 3\n", 
			"8 10\n" +
			"1 3\n" +
			"5 3\n" +
			"5 6\n" +
			"1 2\n" +
			"2 3\n" +
			"4 3\n" +
			"4 6\n" +
			"8 6\n" +
			"2 7\n" +
			"4 8"
		};
		return cases;
	}

	public static ArrayList<ArrayList<String>> basicskillstest4OUT(){
		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("3");
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("5");


        return casesOut;
	}
	//2022gwcc1j1
    public static String[] gwcc1j1CASES2022(){
        String[] cases = {"pokemon are cool",
			"abcd abcd abcde abcde abc abc a b c",
			"gw williams is awesome! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa []{};':,./9@`",
			"fourth test case"};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1j1OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("nomekop ae cl");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("ad ad edcba edcba ac ac a b c");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("gw smailliw is !emosewa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa '`@9/.,:';{}[]");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("htruof tt ce");

        return casesOut;
    }


	//2022gwcc1j2
	public static String[] gwcc1j2CASES2022(){
        String[] cases = {"Pumpkin Apple Banana\n"
		+ "5\n"
		+ "Pumpkin\n"
		+ "c\n"
		+ "c\n"
		+ "c\n"
		+ "c\n"
		+ "c\n"
		+ "Apple\n"
		+ "h\n"
		+ "h\n"
		+ "c\n"
		+ "d\n"
		+ "ace\n"
		+ "Banana\n"
		+ "c\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n", 
		"Blue Green yellow\n"
		+ "3\n"
		+ "yellow\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "Blue\n"
		+ "d\n"
		+ "c\n"
		+ "c\n"
		+ "Green\n"
		+ "d\n"
		+ "c\n"
		+ "h\n",
		"a b c\n"
		+ "11\n"
		+ "a\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "b\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "h\n"
		+ "c\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "c\n"
		+ "d\n"
		+ "d\n"
		+ "d\n"
		+ "d"};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1j2OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("Apple");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("Yellow");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("a");

        return casesOut;
    }



	//2022gwcc1j3
	public static String[] gwcc1j3CASES2022(){
        String[] cases = {"2 4 8 8 10\n"
				+ "3 5 7 9 11\n"
				+ "100 200 300 400 500\n"
				+ "1 9 3 4 5\n"
				+ "1 1 1 1 1\n", 
				"1 2 6 4 5\n"
				+ "1 2 3 4 6\n"
				+ "1 6 3 4 5\n"
				+ "1192 203 1200 1208 1016\n"
				+ "8 9 10 11 12",
				"0 0 0 0 0\n"
				+ "1 1 1 1 1\n"
				+ "2 2 2 2 2\n"
				+ "958237 958237 958237 958237\n"
				+ "58 58 58 58 58", 
				"1 2 3 4 9\n"
				+ "9 4 3 2 1\n"
				+ "1 1 1 2 1\n"
				+ "1 0 1 1 1\n"
				+ "0 0 0 0 1"};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1j3OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("2");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("3");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("0");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("5");

        return casesOut;
    }



	//2022gwcc1s1
	public static String[] gwcc1s1CASES2022(){
        String[] cases = {"3\n"
		+ "1 0 0\n"
		+ "0 1 0\n"
		+ "0 0 1\n", 
		"4\n"
		+ "16 2 3 13\n"
		+ "5 11 10 8\n"
		+ "9 7 6 12\n"
		+ "4 14 15 1\n", 
		"0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0\n"
		+ "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ",
		"3\n"
		+ "1 5 9\n"
		+ "8 3 4\n"
		+ "6 7 2",
		"4\n"
		+ "4 14 15 1\n"
		+ "9 7 6 12\n"
		+ "5 11 10 8\n"
		+ "16 2 3 13"};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1s1OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("yes");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("no");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("no");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("yes");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("no");

        return casesOut;
    }


	
	//2022gwcc1s2
	public static String[] gwcc1s2CASES2022(){
		StringBuilder str = new StringBuilder();
		str.append(Integer.toString(1000000) + " " + Integer.toString(100) + "\n");
		for(int j = 0; j < 1000000; j++) {
			str.append(Integer.toString(j) + "\n");
		}
		for(int j = 0; j < 96; j++){
			str.append(Integer.toString(500069) + "\n"); //69 lol
		}
		str.append(Integer.toString(1) + "\n");
		str.append(Integer.toString(999999) + "\n");
		str.append(Integer.toString(-5) + "\n");
		str.append(Integer.toString(4390930) + "\n");
		String case2 = str.toString();
		
        String[] cases = {
			"4 2\n"
			+ "2\n"
			+ "3\n"
			+ "4\n"
			+ "6\n"
			+ "7\n"
			+ "6\n",
			case2
		};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1s2OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("no");
		casesOut.get(0).add("yes");
		casesOut.add(new ArrayList<>());
		for(int i = 0; i < 98; i++){
			casesOut.get(1).add("yes");
		}
		casesOut.get(1).add("no");
		casesOut.get(1).add("no");

        return casesOut;
    }



	//2022gwcc1s2
	public static String[] gwcc1s3CASES2022(){
        String[] cases = {
			"1 6\n"
			+ "a b\n"
			+ "b c\n"
			+ "o n\n"
			+ ", 4\n"
			+ "e f\n"
			+"i $\n"
			+"hi, you are cool!",
			"2 5\n"
			+ "a b\n"
			+ "b c\n"
			+ "c d\n"
			+ ", e\n"
			+ "e f\n"
			+ "hello, im vincent\n"
			+ "a c\n"
			+ "b d\n"
			+ "e g\n"
			+ "h *\n"
			+ "m l\n"
			+ "java moment"
		};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc1s3OUT2022(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("h$4 ynu brf dnnl!");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("hflloe im vindfnt");
		casesOut.get(1).add("jcvc lolgnt");

        return casesOut;
    }
}
