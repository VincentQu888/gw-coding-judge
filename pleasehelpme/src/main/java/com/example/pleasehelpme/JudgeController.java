package com.example.pleasehelpme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.*;
import java.io.*;

@Controller
public class JudgeController {
    //basic skills training
    @PostMapping("/basicskillstest1JAVA")
    public String basicskillstest1JAVA(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest1CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest1OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 500);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest1CPP")
    public String basicskillstest1CPP(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest1CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest1OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 500);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest1PYTHON")
    public String basicskillstest1PYTHON(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest1CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest1OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 500);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   



    @PostMapping("/basicskillstest2JAVA")
    public String basicskillstest2JAVA(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest2CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest2OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest2CPP")
    public String basicskillstest2CPP(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest2CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest2OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest2PYTHON")
    public String basicskillstest2PYTHON(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest2CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest2OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 200);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   



    @PostMapping("/basicskillstest3JAVA")
    public String basicskillstest3JAVA(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest3CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest3OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest3CPP")
    public String basicskillstest3CPP(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest3CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest3OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest3PYTHON")
    public String basicskillstest3PYTHON(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest3CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest3OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }
    
    
    @PostMapping("/basicskillstest4JAVA")
    public String basicskillstest4JAVA(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest4CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest4OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest4CPP")
    public String basicskillstest4CPP(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest4CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest4OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    @PostMapping("/basicskillstest4PYTHON")
    public String basicskillstest4PYTHON(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
        String formData = request.getParameter("input-textarea");
		
		String[] cases = TestData.basicskillstest4CASES();
		ArrayList<ArrayList<String>> casesOut = TestData.basicskillstest4OUT();
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		for(int i = 0; i < casesOut.size(); i++){
            output.add(new ArrayList<>());
        }

        ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000);
        model.addAttribute("formDataList", formDataOutput);
        return "formResult";
    }   


    
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
 
         ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 30);
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
 
         ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 30);
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
 
         ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 30    );
         model.addAttribute("formDataList", formDataOutput);
         return "formResult";
     }   



      //2022gwcc1s3
      @PostMapping("/2022gwcc1s3JAVA")
      public String gwcc1s3JAVA2022(HttpServletRequest request, Model model)throws IOException, InterruptedException { 
          String formData = request.getParameter("input-textarea");
          
          String[] cases = TestData.gwcc1s3CASES2022();
          ArrayList<ArrayList<String>> casesOut = TestData.gwcc1s3OUT2022();
          ArrayList<ArrayList<String>> output = new ArrayList<>();
          for(int i = 0; i < casesOut.size(); i++){
              output.add(new ArrayList<>());
          }
  
          ArrayList<String> formDataOutput = GWCJ.javaJudge(formData, cases, casesOut, output, 1000);
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
  
          ArrayList<String> formDataOutput = GWCJ.cppJudge(formData, cases, casesOut, output, 1000);
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
  
          ArrayList<String> formDataOutput = GWCJ.pythonJudge(formData, cases, casesOut, output, 1000    );
          model.addAttribute("formDataList", formDataOutput);
          return "formResult";
      }   
}
