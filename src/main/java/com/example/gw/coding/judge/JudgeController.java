package com.example.gw.coding.judge;

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
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j1CPP")
    public String gwcc1j1CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j1CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j1OUT2022();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
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

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   



    //2022gwcc1j2
    @PostMapping("/2022gwcc1j2JAVA")
    public String gwcc1j2JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j2CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j2OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j2CPP")
    public String gwcc1j2CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j2CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j2OUT2022();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j2PYTHON")
    public String gwcc1j2PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j2CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j2OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   




    //2022gwcc1j3
    @PostMapping("/2022gwcc1j3JAVA")
    public String gwcc1j3JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j3CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j3OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j3CPP")
    public String gwcc1j3CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j3CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j3OUT2022();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/2022gwcc1j3PYTHON")
    public String gwcc1j3PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.gwcc1j3CASES2022();
		ArrayList<ArrayList<String>> casesOut = TestData.gwcc1j3OUT2022();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   



     //2022gwcc1s1
     @PostMapping("/2022gwcc1s1JAVA")
     public String gwcc1s1JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s1CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s1OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   
 
 
     @PostMapping("/2022gwcc1s1CPP")
     public String gwcc1s1CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s1CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s1OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   
 
 
     @PostMapping("/2022gwcc1s1PYTHON")
     public String gwcc1s1PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s1CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s1OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000    );
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   



     //2022gwcc1s2
     @PostMapping("/2022gwcc1s2JAVA")
     public String gwcc1s2JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s2CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s2OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 80);
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   
 
 
     @PostMapping("/2022gwcc1s2CPP")
     public String gwcc1s2CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s2CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s2OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 80);
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   
 
 
     @PostMapping("/2022gwcc1s2PYTHON")
     public String gwcc1s2PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
         String formData = request.getParameter("input-textarea");
         
         String[] cases = TestData.gwcc1s2CASES2022();
         ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s2OUT2022();
         ArrayList<ArrayList<String>> output = new ArrayList<>();
         for(int i = 0; i < casesOut.size(); i++){
             output.add(new ArrayList<>());
         }
 
         ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 80    );
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   



      //2022gwcc1s2
      @PostMapping("/2022gwcc1s3JAVA")
      public String gwcc1s3JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
          String formData = request.getParameter("input-textarea");
          
          String[] cases = TestData.gwcc1s3CASES2022();
          ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s3OUT2022();
          ArrayList<ArrayList<String>> output = new ArrayList<>();
          for(int i = 0; i < casesOut.size(); i++){
              output.add(new ArrayList<>());
          }
  
          ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 80);
          model.addAttribute("formDataList", formDataOutput);
          return "formResult";
      }   
  
  
      @PostMapping("/2022gwcc1s3CPP")
      public String gwcc1s3CPP2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
          String formData = request.getParameter("input-textarea");
          
          String[] cases = TestData.gwcc1s3CASES2022();
          ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s3OUT2022();
          ArrayList<ArrayList<String>> output = new ArrayList<>();
          for(int i = 0; i < casesOut.size(); i++){
              output.add(new ArrayList<>());
          }
  
          ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 80);
          model.addAttribute("formDataList", formDataOutput);
          return "formResult";
      }   
  
  
      @PostMapping("/2022gwcc1s3PYTHON")
      public String gwcc1s3PYTHON2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
          String formData = request.getParameter("input-textarea");
          
          String[] cases = TestData.gwcc1s3CASES2022();
          ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s3OUT2022();
          ArrayList<ArrayList<String>> output = new ArrayList<>();
          for(int i = 0; i < casesOut.size(); i++){
              output.add(new ArrayList<>());
          }
  
          ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 80    );
          model.addAttribute("formDataList", formDataOutput);
          return "formResult";
      }   
}
