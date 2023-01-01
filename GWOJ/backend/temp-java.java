import java.util.*;
import java.io.*;

public class GWCJ {
	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new FileWriter("Code.java"));
		
		String[] cases = {"4 5\r\n"
				+ "WWWWW\r\n"
				+ "W.W.W\r\n"
				+ "WWS.W\r\n"
				+ "WWWWW",
				
				"5 7\r\n"
				+ "WWWWWWW\r\n"
				+ "WD.L.RW\r\n"
				+ "W.WCU.W\r\n"
				+ "WWW.S.W\r\n"
				+ "WWWWWWW"};

		ArrayList<ArrayList<String>> casesOut = new ArrayList<>();
		casesOut.add(new ArrayList<>());
		casesOut.get(0).add("-1");
		casesOut.get(0).add("2");
		casesOut.get(0).add("1");
		casesOut.add(new ArrayList<>());
		casesOut.get(1).add("2");
		casesOut.get(1).add("1");
		casesOut.get(1).add("3");
		casesOut.get(1).add("-1");
		casesOut.get(1).add("-1");
		casesOut.get(1).add("1");
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		output.add(new ArrayList<>());
		
		String line = br.readLine();
		while(!line.toLowerCase().equals("end")) {
			writer.write(line);
			writer.newLine();
			line = br.readLine();
		}
		writer.close();
		
		
		boolean AC = true;
		for(int i = 0; i < cases.length; i++) {
			int caseNum = i+1;
			System.out.println("CASE " + caseNum + ":");
			Process process = Runtime.getRuntime().exec("java Code.java");
			int counter = 0;
			
			new Thread(() -> {
			    try {
			        Thread.sleep(3000); // ms for all cases combined
			    } catch (InterruptedException e) {}
			    System.out.println("TLE [>3s overall]");
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
			while ((line = stdoutBuffered.readLine()) != null) {
				output.get(i).add(line);
				if(line == casesOut.get(i).get(counter)) AC = false;
				counter++;
			}

			InputStream stderr = process.getErrorStream();
			InputStreamReader stderrReader = new InputStreamReader(stderr);
			BufferedReader stderrBuffered = new BufferedReader(stderrReader);
			while ((line = stderrBuffered.readLine()) != null) {
			    System.out.println(line);
			    AC = false;
			}
			
			if(AC) System.out.println("AC");
			else System.out.println("WA");
			System.out.println("YOUR OUTPUT:");
			for(int j = 0; j < output.get(i).size(); j++) {
				System.out.println(output.get(i).get(j));
			}
			System.out.println();
			
			if(i == cases.length-1) System.exit(0);
		}
	}
}