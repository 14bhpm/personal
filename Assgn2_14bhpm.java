/*Beltan Michel 14bhpm - 10169162
 * This program takes the Logger.csv file as input (Note: the input file must be in the same location as this one)
 * and creates a "LoggerOutput.txt" file with the organised motor information.
 * (The "LoggerOutput.txt" will be located in the same location as both this file and the Logger.csv file)
 */ 

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.text.DecimalFormat;

public class Assgn2_14bhpm{
	//This will be used to format the currents into a readable output.
	static DecimalFormat df = new DecimalFormat("#.000"); 
	
	//This method will read the Logger.csv file.
	//It stores all the values in a double[1000][8] array and returns it.
	public static double[][] fileReading(){
		
		Scanner fileIn = null;
		double[][] dataArray = new double[1000][8];
		String lineRead;
		try
		{
		fileIn = new Scanner(new FileInputStream("Logger.csv"));
		}
		catch (FileNotFoundException e)
		{
		System.out.println("We were not able to find your 'Logger.csv' file.\nPlease make sure it is located in the same directory as this program.");
		System.exit(0);
		}
		//This for loop will tokenize the strings it reads, parseDouble the numbers into actual doubles and store it in the array.
		for(int i=0; i<1000; i++){
			lineRead = fileIn.nextLine();
			StringTokenizer st = new StringTokenizer(lineRead, ", ");
			st.nextToken(); //This ignores the first token which is the number of seconds.
			for (int n=0; n<7; n++){
				dataArray[i][n] = Double.parseDouble(st.nextToken());
			} //end of for n
		} //end of for i
		return dataArray;
	} //end of fileReading{}
	
	//This method 'analyzes' the data stored in the array and writes the corresponding information
	//to the "LoggerOutput.txt" file that is located in the same directory.
	public static void arrayReading(double[][] anArray, PrintWriter writer){
		
		int startingPoint = 0;
		int stoppingPoint = 0;
		int counter = 0;
		double currentAverage = 0;
		boolean motorRan; //This boolean is used to check whether a motor ran at all or not.
		
		//It will loop in the array for each motor ({0, 1, 2, 3, 4, 5,6 })
		for (int n=0; n<7; n++){
			writer.print("Motor" + (n+1) + ":\n");
			motorRan = false;
			//Then for each second ({0, ..., 999})
			for (int i=0; i<1000; i++){
				
				if (anArray[i][n] >= 1){
					motorRan = true;
					if (startingPoint == 0) //This can translate to "if the value before this one was 0"
						startingPoint = i;
					currentAverage += anArray[i][n]; //So far, the 'average' is only the sum of all the current values
					counter++;
				} //end of (anArray[i][n] >= 1)
				
				//The code here only gets executed if it's the first second there is no current after a reading
				else {
					
					if (startingPoint != 0){
						stoppingPoint = (i - 1); //The second before this one is the end point for the reading. 
						currentAverage = currentAverage / counter; //Now it computes the real average of the currents over the period of time
						if (currentAverage > 8)
							writer.print("***Current Exceeded!: ");
						writer.print(df.format(currentAverage) + " amps, starting at " + startingPoint + " seconds, to " + stoppingPoint + " seconds.\n");
						currentAverage = 0; //Resets the average, the counter and the starting point for the next reading.
						counter = 0; 
						startingPoint = 0; 
					} //end of if (startingPoint != 0)
					
				} // end of else
				
			} // end of for i
			if (!motorRan)
				writer.print("Motor " + (n+1) + " did not run during this span of time.\n");
			writer.print("\n");
			
		} // end of for n
		writer.close();
		System.out.println("Finished succesfully. Please check 'LoggerOutput.txt");
		System.out.println("You will find the file in the same location as this one and 'Logger.csv'.");
		System.exit(0);
	} // end of arrayReading{}
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		
		PrintWriter writer = new PrintWriter("LoggerOutput.txt", "UTF-8"); //Creates the writer that will be passed to the arrayReading method.
		writer.print("Motor Use Summary: \n\n");
		double[][] dataArray = fileReading();
		arrayReading(dataArray, writer);
	} //end of main{}
} //end of Assgn2_14bhpm class
