package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

import java.util.*;
import java.io.*;

@Controller
public class JudgeController {
    
    //2022gwcc1j1
    @PostMapping("/2022gwcc1j1JAVA")
    public String gwcc1j1JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j1OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		output.add(new ArrayList<>());

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j1CPP")
    public String gwcc1j1CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j1OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		output.add(new ArrayList<>());

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j1PYTHON")
    public String gwcc1j1PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j1OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   
}
