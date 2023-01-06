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


    @GetMapping("/2022gwcc1j1")
    String judge(Model model){
        return "2022gwcc1j1";
    }

}


