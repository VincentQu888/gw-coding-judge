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
			"there would be some cases here\n" +
			"but obviously we dont want to leak them"
		};
		return cases;
	}

	public static ArrayList<ArrayList<String>> basicskillstest1OUT(){
		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("answer to case 0");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("answer to case 1");

        return casesOut;
	}



    }
}
