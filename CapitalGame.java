

import javax.swing.*;


public class CapitalGame  {
	

	

	public static void main(String[] args){
		
	
    String [] abbr    = {"AL",	"AK",	"AZ",	"AR",	"CA",	"CO",	"CT",	"DE",	"FL",	"GA",	"HI",	"ID",	"IL",	"IN",	
    					"IA",	"KS",	"KY",	"LA",	"ME",	"MD",	"MA",	"MI",	"MN",	"MS",	"MO",	"MT",	"NE",	"NV",
    					"NH",	"NJ",	"NM",	"NY",	"NC",	"ND",	"OH",	"OK",	"OR",	"PA",	"RI",	"SC",	"SD",	"TN",	
    					"TX",	"UT",	"VT",	"VA",	"WA",	"WV",	"WI",	"WY"};
   
    String [] state   = {"Alabama ","Alaska ","Arizona ",	"Arkansas ",	"California ",	"Colorado ",	"Connecticut ",	"Delaware ",	
    					 "Florida ",	"Georgia ",	"Hawaii",	"Idaho",	"Illinois",	"Indiana",	"Iowa",	"Kansas",	"Kentucky",	"Louisiana",
    					 "Maine",	"Maryland",	"Massachusetts",	"Michigan",	"Minnesota",	"Mississippi",	"Missouri",	"Montana",	"Nebraska",	
    					 "Nevada",	"New Hampshire",	"New Jersey",	"New Mexico",	"New York",	"North Carolina",	"North Dakota",	"Ohio",	
    					 "Oklahoma",	"Oregon",	"Pennsylvania",	"Rhode Island",	"South Carolina",	"South Dakota",	"Tennessee",	"Texas",
    					 "Utah",	"Vermont",	"Virginia",	"Washington",	"West Virginia",	"Wisconsin",	"Wyoming",};
    					 
    String [] capitol = {"Montgomery",	"Juneau",	"Phoenix",	"Little Rock",	"Sacramento",	"Denver",	"Hartford",	"Dover",	
    					  "Tallahassee",	"Atlanta",	"Honolulu",	"Boise",	"Springfield",	"Indianapolis",	"Des Moines",	
    					  "Topeka",	"Frankfort",	"Baton Rouge",	"Augusta",	"Annapolis",	"Boston",	"Lansing",	"St. Paul",	
    					  "Jackson",	"Jefferson City",	"Helena",	"Lincoln",	"Carson City",	"Concord",	"Trenton",	"Santa Fe",	
    					  "Albany",	"Raleigh",	"Bismarck",	"Columbus",	"Oklahoma City",	"Salem",	"Harrisburg",	"Providence",	
    					  "Columbia",	"Pierre",	"Nashville",	"Austin",	"Salt Lake City",	"Montpelier",	"Richmond",	"Olympia",
    					  	"Charleston",	"Madison",	"Cheyenne",};
   
    int  play = 0;
    int right = 0;
    int count = 0;	
    JOptionPane.showMessageDialog(null, "Welcome to the State game!\nClick OK to begin.");
    
	
	do {
	count++;
	int index = (int)(Math.random()* 50);
	
	String guess=JOptionPane.showInputDialog("What is the capital of the state with the abbreviation " + abbr[index] + "?" + 
		                                     "\n\nSpelling and capitalization count!");
	
	int correct = guess.compareTo(capitol[index]);
	
	if (correct == 0){
	
	   play = JOptionPane.showConfirmDialog(null, "You are correct, the capitol of " + state[index] + " is " + guess + ".  \n\nWould you like to play again?", "Great Job!", JOptionPane.YES_NO_OPTION );
	   right++;
	}   
	else
	   play = JOptionPane.showConfirmDialog(null, "You are incorrect, the capitol of " + state[index] + " is not " + guess + 
			                                ".\n\nThe capitol of " + state[index] + " is " +capitol[index] + ". \n\nWould you like to play again?", "Oops!",JOptionPane.ERROR_MESSAGE, JOptionPane.YES_NO_OPTION);	   
			
	}while (play == 0);	
	
	JOptionPane.showMessageDialog(null, "Thanks for playing.  You got " + right + " out of " + count + " correct." +
									"\nThat's a score of " + ((double)right/count*100.0) + "%.");	
		
	}
	
}