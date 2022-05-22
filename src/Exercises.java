import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		
		//Step 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};                    
		
		System.out.println("First element - last element (original array)  = " + subtractValue(ages));       
	
		int [] newAgesArray = Arrays.copyOf(ages, ages.length + 1);        
		newAgesArray[ages.length] = 50;                                     
		System.out.println("First element - last element (new array) = " + subtractValue(newAgesArray));               
			        
		System.out.println("Average age of array: " + averageAges(newAgesArray));   
		
		
		//Step 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		System.out.println("Average number of letters per name: " + averageLetters(names));
		
		System.out.println(stringConcatenation(names));
		
		//Step 3 - How do you access the last element of any array
		//Since you don't always know the length of the array, you access the last element of any array by using the array length minus 1. 
		System.out.println("The last element of the array names is: " + names[names.length - 1]);
		
		//Step 4 - How do you access the first element of any array?
		//Since the index of the first element of any array is always 0, you reference index 0. 
		System.out.println("The first element of the array names is: " + names[0]);
		
		//Step 5 
		int[] nameLengths = new int[names.length]; 
		
		for(int i = 0; i < names.length; i++) {
			int nameSum = names[i].length(); 
			nameLengths[i] += nameSum;			
		} 
		System.out.println("Values of nameLengths array: " + Arrays.toString(nameLengths));
		
		//Step 6
		int sumElements = 0; 
		for(int length : nameLengths) {
			sumElements += length;
		}
		System.out.println("The sum of all elements in nameLengths array: "+ sumElements);
		
		//Step 7		
		String word = "Hello";
		int n = 3;         
	    System.out.println(wordMultiplier(word, n));
		
		//Step 8
		String firstName = "Mickey";
		String space = " "; 
		String lastName = "Mouse"; 
		String fullName = firstName.concat(space).concat(lastName); 
		System.out.println(fullName);	
		
		//Step 9
		int[] numbers = {97, 31, 1, 5, 2, 8, 15, 4}; 
		System.out.println(moreThan100(numbers)); 
		
		//Step 10
		double[] doubleNums= {25.7, 44.4, 97.1, 4.3, 22.2};
		System.out.println("Average of the doubles elements: " + averageDouble(doubleNums));
		
		//Step 11
		double[] doubles1 = {25.7, 44.4, 97.1, 4.3, 22.2};
		double[] doubles2 = {25.7, 4.4, 97.1, 4.3, 2.2};
		System.out.println(isDoubles1Greater(doubles1, doubles2));
		
		//Step 12
		Boolean isHotOutside = true; 
		double moneyInPocket = 5.25; 
		System.out.println(willBuyDrink(moneyInPocket, isHotOutside));
		
		//Step 13
		//method will prompt for user's daily glucose readings for the week. 
		//It will calculate the average of the readings and display a message indicating if the readings
		//are within the recommended range. 
		
		int reading; 		
		Scanner sc = new Scanner(System.in);			
			
		System.out.print("Please enter you blood glucose readings for the past week: ");
		System.out.println("Monday: ");
		int mon = sc.nextInt(); 
		System.out.println("Tuesday: ");
		int tues = sc.nextInt(); 
		System.out.println("Wednesday ");
		int weds = sc.nextInt(); 
		System.out.println("Thursday: ");
		int thurs = sc.nextInt();
		System.out.println("Friday: ");
		int fri = sc.nextInt(); 		
		
		System.out.println("The average of your glucose readings is: " + average(mon, tues, weds, thurs, fri));		
		
		if(average(mon, tues, weds, thurs, fri) >= 80 && average(mon, tues, weds, thurs, fri) <= 140) {
			System.out.println("Your average is within the normal range.");
		} else {
			System.out.println("Your average is outside of the normal range. Plese consult your doctor.");
		}		
	}

	
	private static int average(int mon, int tues, int weds, int thurs, int fri) {
		int readingAverage;
		readingAverage = (mon + tues + weds + thurs + fri) / 5;
		return readingAverage; 				
	}
	
	private static Boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {
		Boolean getDrink = null; 		
		if(isHotOutside = true && moneyInPocket > 10.50) {
			getDrink = true; 
		} else {
			getDrink = false; 
		}
		return getDrink; 
	}

	private static Boolean isDoubles1Greater(double[] doubles1, double[] doubles2) {
		double doubleSum1 = 0; 
		double doubleSum2 = 0;
		double dAverage1 = 0; 
		double dAverage2 = 0; 
		Boolean isGreater = null; 
		for(double number1 : doubles1) {
			for(double number2 : doubles2) {
				doubleSum2 += number2;
				dAverage2 = doubleSum2 / doubles2.length; 				
				doubleSum1 += number1; 
				dAverage1 = doubleSum1 / doubles1.length;
			}
			if(dAverage1 > dAverage2) {
				isGreater = true; 
			} else {
				isGreater = false;
			}			
		}return isGreater; 		
	}


	public static double averageDouble(double[] doubleNums) {
		double doubleSum = 0;                           
		for(double number : doubleNums) {
			doubleSum += number;					
		}
		return doubleSum / doubleNums.length; 		
	}	
	
	public static Boolean moreThan100(int[] numbers) {
		int numbersSum = 0; 
		Boolean isTrue;
		
		for(int number : numbers) {
			numbersSum += number;			
		}		
		if (numbersSum > 100) {
			isTrue = true; 
		} else {
			isTrue = false; 		
		}
		return isTrue;
	} 
	
	public static String wordMultiplier(String word, int n) {
		 String longWord = ""; 
		 if(word != null && n > 0) {	
			 for (int i = 0; i<n; i++) {
				longWord += word;  
			 }			 
	     } else {
	    	 System.out.println("Please enter a number greater than zero");
	     }
		return longWord;		
	}
	
	public static String stringConcatenation(String[] names) {
		String namesConcatenation = "";
		for(String name : names) {
			namesConcatenation += name + " "; 			
		} 
		return namesConcatenation; 		
	}
	
	public static double averageLetters(String[] names) {
		double lettersSum = 0;
		for(String name : names) {
			lettersSum += name.length();			
		}
		return lettersSum / names.length;		
	}
	
	public static double averageAges(int[] ages) {	  
		double agesSum = 0;                           
		for(double number : ages) {
			agesSum += number;					
		}
		return agesSum / ages.length; 		
	}
	
	public static int subtractValue(int[] ages) {       
		int firstMinusLast = ages[ages.length-1] - ages[0];
		return firstMinusLast; 		
	}
	
}

