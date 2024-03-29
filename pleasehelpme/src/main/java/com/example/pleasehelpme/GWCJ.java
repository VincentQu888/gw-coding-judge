package com.example.pleasehelpme;

import java.util.*;

import javax.servlet.http.Part;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import java.io.*;

public class GWCJ {
    public static ArrayList<String> judge(String formData, String lang, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        switch(lang){
            case "Java":
                return javaJudge(formData, cases, casesOut, output, runTime);
            case "Python":
                return pythonJudge(formData, cases, casesOut, output, runTime);
            case "C":
                return cJudge(formData, cases, casesOut, output, runTime);
            default:
                ArrayList<String> temp = new ArrayList<>();
                temp.add("Language not found.");
                return temp;
        }
    }

    //java judge
    public static ArrayList<String> javaJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Main.java"));
        boolean past = false;
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            if(line.toLowerCase().contains("class") && (!line.substring(0, 19).equals("public class Main { ".substring(0, 19)) && !line.substring(0, 18).equals("public class Main{ ".substring(0, 18))) && !past){
                formDataOutput.add("No \"public class Main {\"");
                return formDataOutput;
            }
            if(line.toLowerCase().contains("main")) past = true;
            writer.write(line);
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();
        
        Process compile = Runtime.getRuntime().exec("javac Main.java");
        compile.waitFor();
        
        int exitValue = compile.exitValue();
        if (exitValue != 0) {
            formDataOutput.add("Compilation Error");

            InputStream stderr = compile.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                if(!line.contains("Picked")){
                    formDataOutput.add(line);
                }
            }

            return formDataOutput;
        } 
        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            int counter = 0;
            formDataOutput.add("CASE " + caseNum + ":");

            Process process = Runtime.getRuntime().exec("java -Xmx256m Main");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    if(process.isAlive()) process.destroyForcibly();
                }
            }, (runTime*2+1000)); //arbitrary value but 1000 runs most fine and *2 to be safe

            
            long startTime = System.nanoTime();
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            try{
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
            }catch(IOException e){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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

            if(lineNum != casesOut.get(i).size()) AC = false;
    
            InputStream stderr = process.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                if(!line.contains("Picked")){
                    formDataOutput.add(line);
                    AC = false;
                }
            }
            
            if(elapsedTime > runTime){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
        
        if(formDataList.size() == 0){
            formDataOutput.add("Cannot Run Empty File");
            return formDataOutput;
        }

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
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    if(process.isAlive()) process.destroyForcibly();
                }
            }, (runTime*2+1000)); 
            int counter = 0;
    
            long startTime = System.nanoTime(); 
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            try{
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
            }catch(IOException e){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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





    //c judge 
    public static ArrayList<String> cJudge(String formData, String[] cases, ArrayList<ArrayList<String>> casesOut, ArrayList<ArrayList<String>> output, int runTime)throws IOException, InterruptedException{
        ArrayList<String> formDataList = new ArrayList<>();
        ArrayList<String> formDataOutput = new ArrayList<>();
        String[] lines = formData.split("\n");
        formDataList.addAll(Arrays.asList(lines));
    
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("Main.c"));
        
        String line = formDataList.get(0);
        for(int i = 1; i < formDataList.size(); i++) {
            writer.write(line);
            line = formDataList.get(i);
        }
        writer.write(line);
        writer.close();
        
        Process compile = Runtime.getRuntime().exec("gcc Main.c -o output_program");
        compile.waitFor();
        
        int exitValue = compile.exitValue();
        if (exitValue != 0) {
            formDataOutput.add("Compilation Error");

            InputStream stderr = compile.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                if(!line.contains("Picked")){
                    formDataOutput.add(line);
                }
            }

            return formDataOutput;
        } 
        
        boolean AC = true;
        for(int i = 0; i < cases.length; i++) {
            int caseNum = i+1;
            int counter = 0;
            formDataOutput.add("CASE " + caseNum + ":");

            Process process = Runtime.getRuntime().exec("./output_program");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    if(process.isAlive()) process.destroyForcibly();
                }
            }, (runTime*2+1000)); //arbitrary value but 1000 runs most fine and *2 to be safe

            
            long startTime = System.nanoTime();
            OutputStream stdin = process.getOutputStream();
            PrintWriter out = new PrintWriter(stdin);

            out.println(cases[i]);
            out.flush();

            process.waitFor();
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime)/1000000;
            if(i == 0) elapsedTime = 0;
            
            InputStream stdout = process.getInputStream();
            InputStreamReader stdoutReader = new InputStreamReader(stdout);
            BufferedReader stdoutBuffered = new BufferedReader(stdoutReader);
            int lineNum = 0;
            try{
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
            }catch(IOException e){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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

            if(lineNum != casesOut.get(i).size()) AC = false;
    
            InputStream stderr = process.getErrorStream();
            InputStreamReader stderrReader = new InputStreamReader(stderr);
            BufferedReader stderrBuffered = new BufferedReader(stderrReader);
            while ((line = stderrBuffered.readLine()) != null) {
                if(!line.contains("Picked")){
                    formDataOutput.add(line);
                    AC = false;
                }
            }
            
            if(elapsedTime > runTime){
                formDataOutput.add("TLE [>" + (double)runTime/1000 + "s]");
                formDataOutput.add("YOUR OUTPUT:");
                for(int j = 0; j < output.get(i).size(); j++) {
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
                    if(j < 10){
                        formDataOutput.add(output.get(i).get(j));
                    }else{
                        formDataOutput.add("Clipped");
                        break;
                    }
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
