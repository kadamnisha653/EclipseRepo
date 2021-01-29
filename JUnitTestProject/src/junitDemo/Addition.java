package junitDemo;

public class Addition 
{
	int num1 = 3;
	int num2 = 4;
	
	public int add()
	{
		int sum = num1 + num2 + 1;
		return sum;
	}	
	
	public int sub()
	{
		int diff = num1 - num2;
		return diff;
	}	
		
		
		
		
		/*
		if(sum == 7)
			System.out.println("Expected Matched");
		else
			System.out.println("Expected Unmatched");
		
		System.out.println("Addition : " + sum);
			
	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		a1.add();
	}*/
}
