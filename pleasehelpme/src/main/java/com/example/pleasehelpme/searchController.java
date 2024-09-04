package com.example.pleasehelpme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import java.util.*;
import java.io.*;

@Controller
public class searchController {
    //problem object
    public class problem{
        String title;
        String code;
        String difficulty;
    
        public problem(String title, String code, String difficulty){
            this.title = title;
            this.code = code;
            this.difficulty = difficulty;
        }

        public String getTitle() {
            return title;
        }

        public String getCode() {
            return code;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

    //search bar 
    @GetMapping("/search")
    public String search(HttpServletRequest request, Model model){
        problem[] problems = {
            new problem("Skills Training 1", "basicskillstest1", "Medium"),
            new problem("Skills Training 2", "basicskillstest2", "Medium"),
            new problem("Skills Training 3", "basicskillstest3", "Medium"),
            new problem("Skills Training 4", "basicskillstest4", "Medium"),
            new problem("2022 G.W. Coding Contest 1 Junior 1", "gwcc1j1", "Easy"),
            new problem("2022 G.W. Coding Contest 1 Junior 2", "gwcc1j2", "Easy"),
            new problem("2022 G.W. Coding Contest 1 Junior 3", "gwcc1j3", "Easy"),
            new problem("2022 G.W. Coding Contest 1 Senior 1", "gwcc1s1", "Easy"),
            new problem("2022 G.W. Coding Contest 1 Senior 2", "gwcc1s2", "Easy"),
            new problem("2022 G.W. Coding Contest 1 Senior 3", "gwcc1s3", "Easy"),
            new problem("G.W. Coding Contest 2 Problem 1", "gwcc2p1", "Easy"),
            new problem("G.W. Coding Contest 2 Problem 2", "gwcc2p2", "Easy"),
            new problem("G.W. Coding Contest 2 Problem 3", "gwcc2p3", "Easy"),
            new problem("G.W. Coding Contest 2 Problem 4", "gwcc2p4", "Medium"),
            new problem("G.W. Coding Contest 2 Problem 5", "gwcc2p5", "Medium"),
            new problem("G.W. Coding Contest 2 Problem 6", "gwcc2p6", "Medium"),
            new problem("G.W. Coding Contest 3 Problem 1", "gwcc3p1", "Easy"),
            new problem("G.W. Coding Contest 3 Problem 2", "gwcc3p2", "Easy"),
            new problem("G.W. Coding Contest 3 Problem 3", "gwcc3p3", "Easy"),
            new problem("G.W. Coding Contest 3 Problem 4", "gwcc3p4", "Easy"),
            new problem("G.W. Coding Contest 3 Problem 5", "gwcc3p5", "Easy"),
            new problem("G.W. Coding Contest 3 Problem 6", "gwcc3p6", "Hard"),
            new problem("G.W. CCC 2024 Prep Problem 1", "ccc2024prep1", "Easy"),
            new problem("G.W. CCC 2024 Prep Problem 2", "ccc2024prep2", "Easy"),
            new problem("G.W. CCC 2024 Prep Problem 3", "ccc2024prep3", "Easy"),
            new problem("G.W. Coding Contest 3 Tiebreaker", "gwcc3tiebreaker", "Easy"),
        };
        

        String query = request.getParameter("search-input");
        ArrayList<problem> matches = new ArrayList<>();

        for(problem next : problems){
            boolean matched = false;
            titleMatching:
            for(int i = 0; i < next.title.length(); ++i){
                int count = 0;

                for(int j = 0; j < Math.min(query.length(), next.title.length()-i); ++j){
                    if(next.title.charAt(i+j) != query.charAt(j)) break;

                    ++count;
                    if(count == query.length()){
                        matches.add(next);
                        matched = true;
                        break titleMatching;  
                    } 
                }
            }

            if(matched) continue;
            codeMatching:
            for(int i = 0; i < next.code.length(); ++i){
                int count = 0;

                for(int j = 0; j < Math.min(query.length(), next.code.length()-i); ++j){
                    if(next.code.charAt(i+j) != query.charAt(j)) break;

                    ++count;
                    if(count == query.length()){
                        matches.add(next);
                        break codeMatching;  
                    } 
                }
            }
        }

        if(matches.isEmpty()) matches.add(new problem("No Problems Found!", "/", "-1"));
        model.addAttribute("matches", matches);
        System.out.println(matches.size());
        return "/search";
    }
}
