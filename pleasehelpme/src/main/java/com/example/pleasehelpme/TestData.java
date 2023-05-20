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
		casesOut.get(1).add("-1");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("3 4");
		casesOut.get(2).add("5 4");
		casesOut.get(2).add("4 2");
		casesOut.get(2).add("1 2");

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
		casesOut.get(1).add("4");

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
			str.append(Integer.toString(500069+j) + "\n"); //69 lol
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



	//2022gwcc1s3
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

	
	//gwcc2p1
	public static String[] gwcc2p1CASES(){
		StringBuilder str = new StringBuilder();
		str.append(Integer.toString(1000000) + " " + Integer.toString(100) + "\n");
		for(int j = 0; j < 1000000; j++) {
			str.append(Integer.toString(j) + "\n");
		}
		for(int j = 0; j < 96; j++){
			str.append(Integer.toString(500069+j) + "\n"); //69 lol
		}
		str.append(Integer.toString(1) + "\n");
		str.append(Integer.toString(999999) + "\n");
		str.append(Integer.toString(-5) + "\n");
		str.append(Integer.toString(4390930) + "\n");
		String bigcase = str.toString();
        String[] cases = {

			"63\n8\n68\n37\n79\n42\n23\n47\n33\n44\n60\n18\n87\n6\n32\n96\n45\n76\n48\n33\n23\n40\n60\n04\n29\n98\n5\n62\n89\n73\n1\n34\n47\n15\n4\n58\n58\n55\n57\n30\n15\n65\n69\n78\n02\n69\n97\n30\n93\n81\n91\n81\n95\n10\n2\n37\n31\n88\n69\n80\n19\n66\n69\n2\n",

         "80\n9\n2\n4\n9\n6\n7\n3\n1\n5\n3\n8\n1\n9\n0\n1\n4\n6\n0\n1\n5\n1\n1\n6\n3\n1\n2\n1\n9\n1\n9\n1\n9\n2\n3\n1\n3\n1\n11\n5\n7\n8\n1\n4\n8\n8\n3\n4\n2\n2\n3\n6\n1\n7\n5\n1\n1\n1\n9\n4\n5\n7\n8\n1\n8\n8\n1\n7\n4\n4\n7\n2\n5\n7\n1\n8\n1\n5\n4\n9\n1\n",

         "37\n51\n42\n68\n61\n11\n98\n14\n89\n89\n81\n61\n91\n19\n99\n62\n57\n23\n49\n11\n17\n48\n71\n83\n12\n63\n1\n23\n87\n96\n87\n35\n68\n91\n49\n15\n26\n12\n",

         "46\n9\n1\n2\n4\n8\n2\n6\n2\n3\n7\n6\n6\n5\n8\n7\n5\n2\n3\n2\n9\n8\n5\n1\n4\n2\n9\n4\n6\n7\n1\n3\n9\n1\n1\n9\n9\n4\n8\n3\n8\n14\n6\n6\n4\n5\n1\n",

         "47\n79\n4\n28\n95\n39\n75\n76\n96\n66\n73\n91\n18\n41\n73\n13\n91\n99\n85\n31\n55\n39\n62\n94\n56\n11\n15\n1\n45\n12\n71\n68\n66\n3\n29\n51\n4\n34\n12\n71\n78\n49\n81\n76\n44\n63\n53\n21\n",

         "69\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n",

         "54\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n4\n",

         "2\n7340\n6462\n",

         "5\n041\n824\n51\n338\n948\n",

         "13\n29\n88\n18\n90\n7\n65\n64\n30\n93\n96\n55\n34\n14\n"
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p1OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("640161");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("6845");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("434695");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("5058");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("523202");
		casesOut.add(new ArrayList<>());
		casesOut.get(5).add("216");
		casesOut.add(new ArrayList<>());
		casesOut.get(6).add("2712");
		casesOut.add(new ArrayList<>());
		casesOut.get(7).add("300287758");
		casesOut.add(new ArrayList<>());
		casesOut.get(8).add("5326086");
		casesOut.add(new ArrayList<>());
		casesOut.get(9).add("152355");


        return casesOut;
    }


	//gwcc2p2
	public static String[] gwcc2p2CASES(){
        String[] cases = {

		
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p2OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());
		casesOut.add(new ArrayList<>());

        return casesOut;
    }


	//gwcc2p3
	public static String[] gwcc2p3CASES(){
		StringBuilder str = new StringBuilder();
		str.append(Integer.toString(1000000) + " " + Integer.toString(1000) + " " + Integer.toString(42069) + "\n");
		for(int j = 0; j < 1000000; j++) {
			str.append(Integer.toString(j) + "\n");
		}
		int counter = 1000;
		for(int j = 0; j < 1000; j++){
			str.append(Integer.toString(counter-j) + " " + Integer.toString(987654) + "\n");
		}
		String bigcase = str.toString();

        String[] cases = {
			"96   44   22\n144\n142\n103\n29\n58\n135\n41\n82\n19\n148\n41\n12\n19\n107\n44\n20\n116\n134\n124\n81\n105\n46\n86\n100\n20\n110\n86\n143\n125\n114\n108\n79\n84\n40\n51\n1\n143\n156\n65\n138\n63\n149\n54\n159\n75\n117\n69\n138\n54\n90\n65\n39\n55\n83\n76\n143\n153\n23\n65\n39\n120\n137\n66\n75\n124\n132\n77\n119\n131\n89\n56\n63\n81\n49\n158\n126\n30\n51\n84\n75\n8\n103\n115\n14\n123\n54\n129\n81\n125\n83\n115\n141\n127\n36\n17\n16\n81   93\n21   92\n83   93\n78   80\n20   88\n25   45\n38   71\n68   78\n83   93\n65   74\n22   40\n73   77\n66   88\n6   42\n34   63\n38   63\n75   91\n33   84\n56   60\n25   74\n83   87\n75   91\n55   68\n59   96\n94   96\n29   56\n31   63\n89   91\n10   96\n35   54\n38   46\n92   93\n7   90\n69   72\n21   56\n39   63\n49   72\n23   85\n55   89\n74   87\n19   47\n41   62\n8   53\n14   48\n",

			"15   14   20\n32\n87\n107\n4\n21\n22\n95\n1\n138\n156\n86\n9\n137\n7\n38\n3   14\n10   14\n6   9\n6   8\n3   13\n10   15\n11   14\n6   15\n13   14\n4   10\n6   15\n2   10\n5   10\n6   9\n",
   
			"70   57   11\n23\n6\n87\n146\n79\n24\n35\n18\n6\n69\n3\n90\n13\n82\n55\n17\n102\n25\n57\n126\n130\n8\n4\n65\n123\n61\n110\n70\n28\n131\n118\n123\n13\n130\n45\n27\n74\n23\n128\n9\n86\n90\n78\n69\n33\n7\n118\n6\n23\n8\n119\n87\n116\n93\n48\n24\n125\n56\n119\n59\n32\n66\n94\n146\n44\n30\n137\n66\n2\n49\n43   62\n53   57\n20   38\n6   69\n19   46\n38   66\n25   27\n32   43\n56   57\n49   53\n55   58\n64   68\n17   56\n11   13\n66   70\n57   60\n31   32\n24   67\n23   68\n44   53\n8   66\n57   61\n42   52\n18   22\n2   59\n47   56\n29   54\n1   8\n65   68\n51   55\n43   55\n16   61\n62   64\n60   68\n34   62\n3   33\n36   64\n29   50\n52   58\n4   37\n68   70\n14   26\n58   69\n15   64\n22   28\n29   46\n51   52\n5   68\n24   46\n29   70\n24   54\n48   66\n39   59\n24   63\n49   55\n8   10\n20   31\n",
   
			bigcase, 
   
			"54   66   74\n51\n12\n54\n89\n67\n57\n111\n59\n18\n64\n96\n24\n1\n76\n100\n126\n107\n29\n35\n33\n97\n40\n142\n78\n121\n25\n119\n60\n56\n25\n113\n50\n145\n52\n39\n96\n69\n110\n70\n45\n86\n5\n106\n143\n45\n74\n16\n88\n154\n73\n39\n63\n12\n145\n40   52\n18   50\n38   39\n36   48\n45   52\n24   29\n40   54\n26   46\n5   44\n37   40\n5   15\n28   29\n38   44\n22   30\n16   49\n18   20\n11   34\n33   38\n14   46\n17   31\n6   27\n24   49\n14   45\n25   32\n24   43\n41   54\n12   50\n2   19\n33   51\n21   45\n6   38\n43   44\n18   41\n38   47\n52   54\n17   40\n18   41\n33   45\n38   40\n36   37\n10   52\n23   50\n16   23\n20   27\n42   48\n21   48\n25   37\n10   46\n27   41\n12   38\n22   26\n44   47\n39   49\n24   45\n29   53\n33   53\n12   30\n27   35\n34   38\n50   52\n10   30\n1   41\n50   51\n36   47\n9   12\n17   47\n",
   
			"10   54   56\n10\n43\n6\n159\n114\n25\n140\n84\n19\n43\n4   7\n6   10\n7   8\n3   5\n4   6\n8   10\n7   8\n1   10\n8   9\n2   7\n5   9\n6   10\n6   9\n5   9\n3   7\n4   10\n8   10\n7   10\n5   8\n6   7\n6   9\n4   6\n3   6\n1   4\n3   9\n8   9\n7   8\n3   5\n6   9\n4   5\n1   9\n7   8\n5   7\n8   9\n8   10\n5   9\n3   4\n8   10\n7   10\n6   7\n7   10\n4   8\n3   9\n7   8\n8   9\n8   10\n1   2\n6   9\n7   10\n3   4\n7   10\n3   4\n1   2\n8   10\n",
   
			"13   65   38\n52\n146\n85\n103\n81\n75\n24\n17\n87\n50\n125\n141\n54\n6   10\n2   3\n7   13\n4   13\n4   7\n2   10\n9   12\n9   11\n4   12\n5   7\n5   10\n3   7\n2   10\n8   10\n7   13\n4   10\n11   12\n9   10\n3   9\n8   11\n2   3\n6   11\n4   6\n4   6\n11   12\n1   5\n5   8\n3   5\n6   9\n4   9\n7   12\n9   10\n9   12\n11   12\n10   13\n2   5\n5   13\n10   11\n9   13\n4   6\n8   10\n4   12\n10   12\n11   12\n11   13\n6   13\n1   12\n6   13\n2   12\n2   12\n8   11\n11   12\n8   10\n6   7\n9   10\n2   9\n1   8\n1   9\n11   12\n5   13\n10   12\n7   13\n1   2\n4   11\n4   7\n",
   
			"6 3 20\n15\n9\n15\n26\n57\n56\n1 3\n2 4\n1 6\n",
   
			"67   69   43\n104\n77\n132\n62\n145\n76\n79\n83\n29\n65\n118\n79\n38\n29\n4\n2\n63\n115\n47\n15\n56\n136\n129\n24\n53\n99\n90\n100\n3\n148\n159\n15\n119\n90\n113\n20\n11\n55\n24\n47\n82\n119\n120\n18\n59\n128\n77\n73\n30\n11\n124\n129\n133\n22\n25\n84\n107\n96\n87\n108\n124\n142\n115\n54\n135\n104\n32\n2   42\n65   67\n47   63\n64   65\n32   65\n52   58\n61   65\n27   50\n62   67\n11   53\n12   56\n8   65\n60   61\n64   67\n15   29\n23   45\n29   47\n14   23\n59   60\n9   38\n20   53\n33   38\n10   30\n36   64\n2   31\n34   45\n16   50\n4   50\n52   60\n46   66\n10   41\n39   48\n25   39\n52   62\n10   37\n18   54\n47   57\n64   66\n27   67\n35   66\n10   35\n31   42\n3   40\n33   45\n22   35\n58   65\n9   59\n22   25\n51   56\n6   45\n15   67\n35   51\n30   45\n59   65\n8   51\n39   45\n8   30\n12   27\n62   63\n62   63\n57   59\n49   66\n15   47\n62   64\n45   61\n62   67\n45   55\n46   67\n56   62\n",
   
			"24   25   53\n98\n103\n50\n60\n62\n16\n135\n94\n130\n26\n62\n41\n101\n86\n71\n44\n139\n78\n9\n130\n8\n34\n12\n45\n22   23\n16   18\n3   4\n4   6\n13   16\n13   18\n19   23\n5   9\n16   24\n17   18\n22   24\n17   23\n10   18\n11   19\n3   4\n11   21\n22   24\n3   6\n21   24\n22   23\n1   4\n10   23\n12   22\n8   24\n2   10\n",

			"31   51   80\n47\n95\n55\n89\n78\n82\n54\n53\n119\n26\n153\n128\n28\n86\n136\n67\n133\n92\n33\n123\n111\n62\n70\n87\n31\n46\n4\n140\n151\n64\n93\n20   24\n10   28\n20   24\n6   22\n4   11\n29   30\n2   14\n4   13\n19   30\n13   14\n12   13\n11   27\n21   31\n13   14\n28   29\n4   23\n3   27\n26   30\n7   22\n27   31\n11   21\n16   17\n12   30\n20   21\n18   19\n21   23\n9   17\n12   24\n28   30\n1   4\n7   30\n6   14\n2   26\n23   25\n22   29\n7   15\n29   31\n14   23\n28   31\n11   18\n21   31\n7   13\n23   31\n7   11\n21   27\n16   19\n26   27\n12   25\n22   25\n28   30\n24   31\n"
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p3OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("1120");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("590");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("1095");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("4522570");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("505");
		casesOut.add(new ArrayList<>());
		casesOut.get(5).add("805");
		casesOut.add(new ArrayList<>());
		casesOut.get(6).add("950");
		casesOut.add(new ArrayList<>());
		casesOut.get(7).add("96");
		casesOut.add(new ArrayList<>());
		casesOut.get(8).add("855");
		casesOut.add(new ArrayList<>());
		casesOut.get(9).add("555");
		casesOut.add(new ArrayList<>());
		casesOut.get(10).add("655");

        return casesOut;
    }


	//gwcc2p4
	public static String[] gwcc2p4CASES(){
        String[] cases = {
			"6 15\n1\n2\n3\n4\n5\n6\n2 1\n3 1\n4 1\n5 1\n6 1\n3 2\n4 2\n5 2\n6 2\n4 3\n5 3\n6 3\n5 4\n6 4\n5 6\n",

			"58 58\nA\nB\nC\nD\nE\nF\nG\nH\nI\nJ\nK\nL\nM\nN\nO\nP\nQ\nR\nS\nT\nU\nV\nW\nX\nY\nZ\n1\n2\n3\n4\n5\n6\na\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\nA B\nB C\nC D\nD E\nE F\nF G\nG H\nH I\nI J\nJ K\nK L\nL M\nM N\nN O\nO P\nP Q\nQ R\nR S\nS T\nT V\nU V\nT U\nV W\nW X\nX Y\nY Z\nZ 1\n1 2\n2 3\n3 4\n4 5\n5 6\n6 a\na b\nb c\nc d\nd e\ne f\nf g\ng h\nh i\ni j\nj k\nk l\nl m\nm n\nn o\no p\np q\nq s\ns r\nr t\nt u\nu v\nv w\nw x\nx y\ny z\n",
   
			"5 5\n1\n2\n3\n4\n5\n1 2\n1 3\n2 4\n3 2\n4 5\n",
   
			"14 19\nMath\nHistory\nScience\nPhysics\nChemistry\nBiology\nFunctions\nCalculus\nData\nMusic\nArt\nTechnologies\nGeography\nGym\nMath History\nMath Chemistry\nChemistry Biology\nHistory Science\nHistory Physics\nChemistry History\nBiology History\nFunctions Math\nData Science\nData History\nBiology Data\nMusic Science\nPhysics Music\nScience Art\nArt Technologies\nGeography Technologies\nGeography Art\nTechnologies Gym\nGym Calculus\n",
   
			"5 4\nHistory\nMath\nFrench\nBusiness\nGeography\nHistory Math\nMath French\nFrench Business\nBusiness Geography\n"
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p4OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("5 6 4 3 2 1 ");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 1 2 3 4 5 6 a b c d e f g h i j k l m n o p q s r t u v w x y z ");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("1 3 2 4 5 ");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("Functions Math Chemistry Biology Data History Physics Music Science Geography Art Technologies Gym Calculus ");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("History Math French Business Geography ");

        return casesOut;
    }


	//gwcc2p5
	public static String[] gwcc2p5CASES(){
		StringBuilder str = new StringBuilder();
		str.append(Integer.toString(1000000) + " " + Integer.toString(5000000) + "\n");

		str.append(Integer.toString(1) + " " + Integer.toString(50) + "\n");
		str.append(Integer.toString(2) + " " + Integer.toString(52) + "\n");
		str.append(Integer.toString(3) + " " + Integer.toString(1) + "\n");
		str.append(Integer.toString(3) + " " + Integer.toString(1) + "\n");
		for(int j = 5; j <= 1000000; j++) {
			str.append(Integer.toString(j) + " " + Integer.toString(j+3) + "\n");
		}
		String bigcase = str.toString();

        String[] cases = {
			"4 10\n1 1\n2 1\n4 1\n10 5\n",

			"1 1\n1 1\n",

			"9 5\n4 1\n2 1\n2 1\n2 1\n3 5\n2 4\n4 4\n4 2\n2 3\n",

			"15 14\n5 1\n12 5\n11 3\n4 2\n10 2\n1 3\n12 5\n7 2\n7 1\n5 1\n3 1\n4 4\n9 1\n14 4\n10 1\n",

			"19 10\n9 3\n2 4\n8 3\n2 2\n5 1\n5 4\n10 3\n8 1\n4 5\n3 5\n10 4\n1 4\n9 5\n8 1\n4 1\n1 3\n6 2\n6 3\n7 3\n",

			"41 18\n11 4\n14 5\n5 4\n3 3\n9 4\n17 3\n7 3\n9 3\n10 1\n1 2\n13 1\n9 5\n2 3\n10 1\n12 1\n15 5\n1 3\n15 2\n9 1\n8 4\n2 5\n11 3\n10 2\n2 1\n1 2\n9 4\n6 5\n7 3\n14 3\n3 4\n12 2\n10 1\n5 5\n18 5\n8 1\n4 1\n2 2\n15 4\n12 3\n17 3\n13 5\n",

			"15 3\n2 1\n1 5\n1 3\n2 2\n2 3\n1 1\n1 1\n1 5\n2 3\n1 5\n2 3\n2 1\n1 1\n1 1\n2 4\n",

			"22 46\n9 2\n20 4\n25 2\n37 5\n35 4\n20 5\n43 1\n40 1\n46 2\n13 2\n2 2\n17 2\n45 5\n20 1\n25 1\n11 1\n30 4\n42 1\n22 2\n17 1\n21 1\n15 1\n",

			bigcase
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p5OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("2");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("1");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("2");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("7");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("6");
		casesOut.add(new ArrayList<>());
		casesOut.get(5).add("9");
		casesOut.add(new ArrayList<>());
		casesOut.get(6).add("1");
		casesOut.add(new ArrayList<>());
		casesOut.get(7).add("20");
		casesOut.add(new ArrayList<>());
		casesOut.get(8).add("3");


        return casesOut;
    }


	//gwcc2p6
	public static String[] gwcc2p6CASES(){
        String[] cases = {
			"2 12\n14\n2\n3\n15\n7\n8\n6\n11\n13\n3\n4\n9\n",

			"1 9\n62\n11\n83\n39\n75\n64\n35\n60\n22\n35\n5\n67\n",
   
			"5 7\n14\n60\n71\n47\n31\n13\n7\n30\n41\n11\n24\n57\n",
   
			"9 2\n7627\n8382\n1063\n544\n4233\n3372\n1452\n781\n3176\n743\n4248\n1971\n",
   
			"5 9\n9723263155\n960466836\n5614852373\n7037737546\n896191477\n2642212923\n9768829534\n9628953924\n2869497156\n806809641\n7537938798\n6895060817\n",
   
			"8 8\n0\n0\n0\n0\n0\n0\n0\n0\n1\n0\n0\n0\n",
   
			"1 5\n525\n902\n183\n1\n670\n202\n254\n1\n914\n29\n686\n774\n",
   
			"6 8\n381\n26\n68\n3478280\n941\n515\n504\n545\n876\n447\n23\n98\n"
			};
        return cases;
    }

    public static ArrayList<ArrayList<String>> gwcc2p6OUT(){
        ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("2");
		casesOut.get(0).add("3");
		casesOut.get(0).add("10");
		casesOut.get(0).add("11");
		casesOut.get(0).add("12");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("1");
		casesOut.get(1).add("9");
		casesOut.add(new ArrayList<>());
		casesOut.get(2).add("5");
		casesOut.get(2).add("4");
		casesOut.get(2).add("7");
		casesOut.add(new ArrayList<>());
		casesOut.get(3).add("9");
		casesOut.get(3).add("10");
		casesOut.get(3).add("3");
		casesOut.get(3).add("2");
		casesOut.add(new ArrayList<>());
		casesOut.get(4).add("5");
		casesOut.get(4).add("4");
		casesOut.get(4).add("6");
		casesOut.get(4).add("10");
		casesOut.get(4).add("9");
		casesOut.add(new ArrayList<>());
		casesOut.get(5).add("8");
		casesOut.add(new ArrayList<>());
		casesOut.get(6).add("1");
		casesOut.get(6).add("8");
		casesOut.get(6).add("4");
		casesOut.get(6).add("5");
		casesOut.add(new ArrayList<>());
		casesOut.get(7).add("6");
		casesOut.get(7).add("10");
		casesOut.get(7).add("11");
		casesOut.get(7).add("8");

        return casesOut;
    }
}
