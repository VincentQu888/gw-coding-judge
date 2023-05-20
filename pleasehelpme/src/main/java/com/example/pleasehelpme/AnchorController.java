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

    @GetMapping("/gwcc2p1")
    String gwcc2p1(Model model){
        return "gwcc2p1";
    }

    @GetMapping("/gwcc2p2")
    String gwcc2p2(Model model){
        return "gwcc2p2";
    }

    @GetMapping("/gwcc2p3")
    String gwcc2p3(Model model){
        return "gwcc2p3";
    }

    @GetMapping("/gwcc2p4")
    String gwcc2p4(Model model){
        return "gwcc2p4";
    }

    @GetMapping("/gwcc2p5")
    String gwcc2p5(Model model){
        return "gwcc2p5";
    }

    @GetMapping("/gwcc2p6")
    String gwcc2p6(Model model){
        return "gwcc2p6";
    }

    @GetMapping("/2022gwcc1contestpage")
    String gwcc1contestpage(Model model){
        return "2022gwcc1contestpage";
    }

    @GetMapping("/gwcc2contestpage")
    String gwcc2contestpage(Model model){
        return "gwcc2contestpage";
    }

    @GetMapping("/tips")
    String tipsPage(Model model){
        return "tips";
    }

    @GetMapping("/error")
    String error(Model model){
        return "error";
    }


}


