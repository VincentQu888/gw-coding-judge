package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

import java.util.*;
import java.io.*;

public class TestData {
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
}
