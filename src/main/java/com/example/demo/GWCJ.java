package com.example.demo;

import java.util.*;
import java.io.*;

public class GWCJ {
    //java judge
    public static ArrayList<String> javaJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.java"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            writer.newLine();
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
            
            new Thread(() -> {
                try {
                    Thread.sleep(3000); // ms for all cases combined
                } catch (InterruptedException e) {}
                formDataOutput.add("TLE [>3s overall]");
                process.destroy();
                System.exit(0);
            }).start();
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);
            
            out.println(cases[i]);
            out.flush();
            
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
            
            if(AC) formDataOutput.add("AC");
            else{
                formDataOutput.add("WA");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
            }
            formDataOutput.add("--------------------------------------------");
            
            if(i == cases.length-1) return formDataOutput;
        }

        return formDataOutput;
    }



    // cpp judge  aaaaaaaaajdsftjdsrks
    public static ArrayList<String> cppJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.cpp"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            writer.newLine();
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();


        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            formDataOutput.add("CASE " + caseNum + ":");

            Process process = Runtime.getRuntime().exec("./Code");
            int counter = 0;
            
            new Thread(() -> {
                try {
                    Thread.sleep(3000); // ms for all cases combined
                } catch (InterruptedException e) {}
                formDataOutput.add("TLE [>3s overall]");
                process.destroy();
                System.exit(0);
            }).start();
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);
            
            out.println(cases[i]);
            out.flush();
            
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
            
            if(AC) formDataOutput.add("AC");
            else{
                formDataOutput.add("WA");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
            }
            formDataOutput.add("--------------------------------------------");
            
            if(i == cases.length-1) return formDataOutput;
        }

        return formDataOutput;
    }




    //python judge
    public static ArrayList<String> pythonJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Code.py"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            writer.newLine();
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
            
            new Thread(() -> {
                try {
                    Thread.sleep(3000); // ms for all cases combined
                } catch (InterruptedException e) {}
                formDataOutput.add("TLE [>3s overall]");
                process.destroy();
                System.exit(0);
            }).start();
    
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);
            
            out.println(cases[i]);
            out.flush();
            
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
            
            if(AC) formDataOutput.add("AC");
            else{
                formDataOutput.add("WA");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    formDataOutput.add(output.get(i).get(j));
                }
            }
            formDataOutput.add("--------------------------------------------");
            
            if(i == cases.length-1) return formDataOutput;
        }

        return formDataOutput;
    }
}
