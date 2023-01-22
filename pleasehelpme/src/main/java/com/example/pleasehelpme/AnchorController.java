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
public class AnchorController {
    
    @GetMapping("/")
    String homePage(Model model){
        return "index";
    }


    @GetMapping("/problems")
    String problemsPage(Model model){
        return "problems";
    }


    @GetMapping("/submission-instructions")
    String submissionPage(Model model){
        return "submission-instructions";
    }

    @GetMapping("/basicskillstest1")
    String basicskillstest1(Model model){
        return "basicskillstest1";
    }

    @GetMapping("/basicskillstest2")
    String basicskillstest2(Model model){
        return "basicskillstest2";
    }

    @GetMapping("/basicskillstest3")
    String basicskillstest3(Model model){
        return "basicskillstest3";
    }

    @GetMapping("/basicskillstest4")
    String basicskillstest4(Model model){
        return "basicskillstest4";
    }


    @GetMapping("/2022gwcc1j1")
    String gwcc1j12022(Model model){
        return "2022gwcc1j1";
    }

    @GetMapping("/2022gwcc1j2")
    String gwcc1j22022(Model model){
        return "2022gwcc1j2";
    }

    @GetMapping("/2022gwcc1j3")
    String gwcc1j32022(Model model){
        return "2022gwcc1j3";
    }

    @GetMapping("/2022gwcc1s1")
    String gwcc1s12022(Model model){
        return "2022gwcc1s1";
    }

    @GetMapping("/2022gwcc1s2")
    String gwcc1s22022(Model model){
        return "2022gwcc1s2";
    }

    @GetMapping("/2022gwcc1s3")
    String gwcc1s32022(Model model){
        return "2022gwcc1s3";
    }

    @GetMapping("/tips")
    String tipsPage(Model model){
        return "tips";
    }

    

}


