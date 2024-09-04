package com.example.pleasehelpme;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import java.util.*;
import java.io.*;

@Controller
public class JudgeController {
    //basic skills training
    @PostMapping("/basicskillstest1")
    public String basicskillstest1(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.basicskillstest1CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest1OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 500);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest2")
    public String basicskillstest2(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.basicskillstest2CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest2OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest3")
    public String basicskillstest3(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.basicskillstest3CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest3OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest4")
    public String basicskillstest4(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.basicskillstest4CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest4OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   



    @PostMapping("/gwcc1j1")
    public String gwcc1j1(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1j1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j1OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc1j2")
    public String gwcc1j2(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1j2CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j2OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc1j3")
    public String gwcc1j3(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1j3CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j3OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc1s1")
    public String gwcc1s1(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1s1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s1OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   

    
    @PostMapping("/gwcc1s2")
    public String gwcc1s2(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1s2CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s2OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc1s3")
    public String gwcc1s3(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc1s3CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s3OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p1")
    public String gwcc2p1(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p1CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p1OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p2")
    public String gwcc2p2(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p2CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p2OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p3")
    public String gwcc2p3(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p3CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p3OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p4")
    public String gwcc2p4(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p4CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p4OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p5")
    public String gwcc2p5(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p5CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p5OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc2p6")
    public String gwcc2p6(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");
		
		String[] cases = TestData.gwcc2p6CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc2p6OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/gwcc3p1")
    public String gwcc3p1(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p1CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p1OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3p2")
    public String gwcc3p2(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p2CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p2OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3p3")
    public String gwcc3p3(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p3CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p3OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3p4")
    public String gwcc3p4(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p4CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p4OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3p5")
    public String gwcc3p5(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p5CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p5OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 3000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3p6")
    public String gwcc3p6(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3p6CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3p6OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 400);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/gwcc3tiebreaker")
    public String gwcc3tiebreaker(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.gwcc3tiebreakerCASES();
        ArrayList<ArrayList<String>> casesOut = TestData.gwcc3tiebreakerOUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/ccc2024prep1")
    public String ccc2024prep1(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.ccc2024prep1CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.ccc2024prep1OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/ccc2024prep2")
    public String ccc2024prep2(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.ccc2024prep2CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.ccc2024prep2OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }

    @PostMapping("/ccc2024prep3")
    public String ccc2024prep3(HttpServletRequest request, Model model) throws IOException, InterruptedException {
        String formData = request.getParameter("input-textarea");
        String lang = request.getParameter("lang");

        String[] cases = TestData.ccc2024prep3CASES();
        ArrayList<ArrayList<String>> casesOut = TestData.ccc2024prep3OUT();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        for (int i = 0; i < casesOut.size(); i++) {
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.judge(formData, lang, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }
}