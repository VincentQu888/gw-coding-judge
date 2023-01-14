package com.example.demo;

import java.util.*;
import java.io.*;

public class GWCJ {
    //java judge
    public static ArrayList<String> javaJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.java"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();
        
        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            formDataOutput.add("CASE " + caseNum + ":");
            Process process = Runtime.getRuntime().exec("java Code.java");
            int counter = 0;
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            long startTime = System.nanoTime(); 
            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            while ((line = stdoutBuffered.readLine()) != null) {
                output.get(i).add(line);
                try {
                    if(!line.equals(casesOut.get(i).get(counter))) AC = false;
                } catch (IndexOutOfBoundsException ioobe) {
                    AC = false;
                }
                counter++;
                lineNum++;
            }

            if(lineNum != casesOut.get(i).size()) AC = false;
    
            InputStream stderr = process.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                formDataOutput.add(line);
                AC = false;
            }
            
            if(elapsedTime > runTime){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous TLE)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            if(AC) formDataOutput.add("AC (" + (double)elapsedTime/1000 + "s)");
            else{
                formDataOutput.add("WA (" + (double)elapsedTime/1000 + "s)");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous WA)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            formDataOutput.add("--------------------------------------------");
        }

        return formDataOutput;
    }



    // cpp judge 
    public static ArrayList<String> cppJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.cpp"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();
        
        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            formDataOutput.add("CASE " + caseNum + ":");
            Process process = Runtime.getRuntime().exec("Code.exe");
            int counter = 0;
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            long startTime = System.nanoTime(); 
            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            while ((line = stdoutBuffered.readLine()) != null) {
                output.get(i).add(line);
                try {
                    if(!line.equals(casesOut.get(i).get(counter))) AC = false;
                } catch (IndexOutOfBoundsException ioobe) {
                    AC = false;
                }
                counter++;
                lineNum++;
            }

            if(lineNum != casesOut.get(i).size()) AC = false;
    
            InputStream stderr = process.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                formDataOutput.add(line);
                AC = false;
            }
            
            if(elapsedTime > runTime){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous TLE)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            if(AC) formDataOutput.add("AC (" + (double)elapsedTime/1000 + "s)");
            else{
                formDataOutput.add("WA (" + (double)elapsedTime/1000 + "s)");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous WA)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            formDataOutput.add("--------------------------------------------");
        }

        return formDataOutput;
    }




    //python judge
    public static ArrayList<String> pythonJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.py"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();
        
        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            formDataOutput.add("CASE " + caseNum + ":");
            Process process = Runtime.getRuntime().exec("python Code.py");
            int counter = 0;
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            long startTime = System.nanoTime(); 
            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            while ((line = stdoutBuffered.readLine()) != null) {
                output.get(i).add(line);
                try {
                    if(!line.equals(casesOut.get(i).get(counter))) AC = false;
                } catch (IndexOutOfBoundsException ioobe) {
                    AC = false;
                }
                counter++;
                lineNum++;
            }

            if(lineNum != casesOut.get(i).size()) AC = false;
    
            InputStream stderr = process.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                formDataOutput.add(line);
                AC = false;
            }
            
            if(elapsedTime > runTime){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous TLE)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            if(AC) formDataOutput.add("AC (" + (double)elapsedTime/1000 + "s)");
            else{
                formDataOutput.add("WA (" + (double)elapsedTime/1000 + "s)");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
                formDataOutput.add("--------------------------------------------");
                for(int j = i+1; j < output.size(); j++){
                    caseNum = j+1;
                    formDataOutput.add("CASE " + caseNum + ":");
                    formDataOutput.add("\" \" (Previous WA)");
                    formDataOutput.add("--------------------------------------------");
                }
                return formDataOutput;
            }
            formDataOutput.add("--------------------------------------------");
        }

        return formDataOutput;
    }
}
