package generalAssignments;
//WAP in java to find aeiou from string selenium. Take 2 variables as vowels and constants. 
//if there is aeiou then increment the value of vowels else increment the value of constants
//and print the values of variables

public class VowelsAndConsonants {
	public static void main(String args[])
	{
		String input = "Automation Testing";
//Take 2 Variables for producing output
		int vowels = 0;
		int consonants = 0;
//Convert the string to a character array for the for-each loop
		char [] newInput = input.toCharArray();
				
		for(char value:newInput)
		{
		//	System.out.println(value);
			if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u')
			{
				vowels++;
			}
			else if (value >='a' && value <='z')
			{
				consonants++;
					
			}
		}
		System.out.println("No of charaters are: "+ " "+newInput.length);
		System.out.println("Sum of Vowels are :"+" "+vowels);
		System.out.println("Sum of consonants are :"+" "+consonants);
		
		
	}

}
