package week4;

public class week4 {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		// ages.length - 1 will go to the last integer. ages[0] point to the first index of the Array
		// 93 - 3 = 90
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};
		int result2 = ages2[ages2.length - 1] - ages[0];
		System.out.println(result2);
		// same thing as the first but this one is 45 - 3 = 42
		
		int dynamicResult = ages2[ages2.length - 1] - ages2[1];
		System.out.println(dynamicResult);
		// Showing you can do different stuff to the indexes
		// ages2[1] is the 2nd in the Array 45 - 9 = 36
		
		int sum = 0;
		for (int age : ages) {
			sum += age;
		// using sum as the int
		// all the ages iterate through age
		// sum = sum + age gives me the sum of all ages
		}
		double average = (double) sum / ages.length;
		System.out.println(average);
		// give it a double cause of the average will be in decimal
		// turn sum into double before the division
		// divide sum by the length of the array
		// print out average
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		int totalLetters = 0; 
		for (String name : names) { 
			totalLetters += name.length(); 
			// created the string array
			// iterate names into name
			//totalLetter = totalLetter + name.length()
			//added all the letters together
		} 
		double avgLetters = (double) totalLetters / names.length; 
		System.out.println(avgLetters);
		//made totalLetters a double before dividing
		//divided the number of letters by the length of the array
		//printed out avgLetters for the average
	
		String concatenatedNames = "";
		for (String name : names) {
			concatenatedNames += name + " ";
		}
		System.out.println(concatenatedNames);
			// new string "concatenatedNames" is equal to a blank string
			//iterated names into name
			//concatenatedNames = concatenatedNames + name + " "
		    //concatenatedNames is now all the names concatenated with a space 
		
		
		/* 
		 int lastElement = array[array.length - 1];
		// access the last element on an array
			
		 int firstElement = array[0];
        // access the first element on an array	
		*/
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();	
		}
		// created a new array nameLengths
		// the size of the new int array is the same as the names array
		// next you look at each name on the names list
		//now you save each number of letter for each name into nameLengths
		//[i] on both of them makes it go through the whole array
		
		int nameLengthsSum = 0;
		for (int length : nameLengths) {
			nameLengthsSum += length;
		}
		System.out.println(nameLengthsSum);
	}
	   // created a new int nameLengthsSum
	  // iterated nameLenghts into length
	  // nameLengthsSum = nameLengthsSum + length gives me the sum of all the elements
	 
	public static String repeatWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result +=word;
		}
		return result;
		// wrote a method with a String and an Integer
		//made a empty string to store the result
		//the for loop will repeat the string
		//result = result + word this will add the string as many times as the integer
		//return will print out the result
	}
	
	public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		//this takes 2 Strings a firstName and lastName
		//return will concat the first and last name with a space in between
	}
	
	public static boolean isSumGreaterThan100(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
	    return sum > 100;
	  //made a boolean method to see if the elements in the array are more than 100
	  //made an int that equal 0 to store the number of elements
	  //the for loop will go over each element in the array storing it
	  //the sum and num are now added
	  // the return will tell me true or false if sum is grater than 100  
	    } 
	
	public static double getAverage(double[] arr) {
		double sum = 0; 
		for (double num : arr) {
			sum += num;
		}
		return sum / arr.length;
		//method to get the average of the array elements
		//double to get it as a decimal
		//created a double to store the total
		//for loop to look at the whole array
		//sum = sum + num will add all the doubles to the sum
		// return will return me the average of sum and the length of the array
		
	}
	public static boolean compareAverages(double[] arr1, double[] arr2) { 
		return getAverage(arr1) > getAverage(arr2); 
		}
	// new method to compare the averages of 2 arrays
	// return will tell me if the average of arr1 is greater than arr2
	//i used the method from last question the getAverage method
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      return isHotOutside && moneyInPocket > 10.50;
	}
	//a boolean method that takes a boolean and a double
	//return will print false or true
	//true if isHotOutside is true and if moneyInPocket is greater than 10.50
	
	public static boolean isPositive(int num) { 
		return num > 0; 
	} 
	//an easy boolean method that will tell me if the int is positive or negative
	//return will print true if number greater than 0(positive)
	//false if its less than 0(negative)
	
	
	
	
	
}