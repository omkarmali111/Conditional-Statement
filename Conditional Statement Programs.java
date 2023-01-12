Conditional statements in Java
 
 Exampales of Conditional statements
 1 find kaprekar number
 Solution->
 package conditionalstatements;

  public class kaprekarnumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		int sq=num*num;   //sq==squre
		int count=0;
		int on=num;      //on==orignal number
		while(num>0)
		{
			count++;
			num=num/10;
			
		}
		int div=(int)Math.pow(10, count);
		int fp=sq/div;                     //fp==first part
		int sp=sq%div;                     //sp==second part
		if((fp+sp)==on)
			System.out.println("kaprekar number");
		else
			System.out.println("not kaprekar number");

	}

}

Output-> kaprekar number


2 find palindrome number
  Solution->
  package conditionalstatements;

     public class palindromenumber {

	public static void main(String[] args) {
		int num=121;
		int orignalnum=num;
		int reversenum=0;
		while(num>0)
		{
			int lastdigit=num%10;
			reversenum=reversenum*10+lastdigit;
			num=num/10;
			
		}
		if (orignalnum==reversenum) {
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}

	}

}
    Output-> palindrome number
	
	
	3 Calculate factorial number
	Solution->
	package conditionalstatements;

     public class factorial {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;          //given number
		
		int fact=1;           //assume
		for (int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println(fact);

	}

}

    Output ->120
	
	4 Show given num is prime no or not
	 Solution->
	 package conditionalstatements;

     public class primenumber {
	 public static void main(String[] args) {
		int count =0;            //assume
		int num =3;
	for (int i=2; i<num; i++) {
		if (num%i==0)
		
			count++;
	}
		if(count==0)
			System.out.println("prime");
		else 
			System.out.println("not a prime");
		
	}
	} 
	 Output-> prime
	 
	 5  Show given num is perfect squar no or not
	 Solution->
	 package conditionalstatements;

       public class  perfectsquarornot{

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				int num=16;           //given number
			int a=(int)Math.sqrt(num);
				
			if(a*a==num)
				System.out.println("perfect squar");
			else
				System.out.println("not perfect squar");
			}
		}
		Output-> perfect squar
		
		6 find alphabate it is a vowel or a consonant
		Solution->
		 package conditionalstatements;
		
         public class vowelornot {

	     public static void main(String[] args) {
		   char ch = 'a';
		   if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("vowel");
		     else if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		   System.out.println("vowel");
		    else 
			 System.out.println("consonant");
		
	}

}
      Output->vowel
	  
	  7  find given character is lowercase, capital or number
          Solution->
		   package conditionalstatements;

       public class  character{

	    public static void main(String[] args) {
             char ch ='A';                 //given character
		if(ch>='a'&&ch<='z')
			System.out.println("lowercase alphabet");
		else if (ch>='A'&&ch<='Z')
			System.out.println("capital alphabet");
		else if(ch>='0'||ch<='0')
			System.out.println("digit");
		else 
			System.out.println("other");
     
       Output->	 capital alphabet
	   
	   8  find no of digits of given number
	       Solution->
		   package conditionalstatements;

           public class nodigit {

	      public static void main(String[] args) {
		  // TODO Auto-generated method stub
		
		    int num =321;           //given number
		     int count = 0;         //aussme
		    while(num>0)
		{
			num=num/10;
			count++;
		}
		  System.out.println(count);
		  
		  Output-> 3
		  
		  
		  9 find revers number of given number
		     Solution->
			 package conditionalstatements;
             public class reversenumber {

	      public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int num =321;            //given number
		          
		   int reversenumber=0;     //assume
		   while (num>0)
		{
			int lastdigit=num%10;
			reversenumber=reversenumber*10+lastdigit;
			num=num/10;
		}
		    System.out.println(reversenumber);
	}

}
         Output->321
		  
		10 find grosssalary
		   Solution->
		   package conditionalstatements;

        public class grosssalary {

	    public static void main(String[] args) {
		int basesalary=22000;
		double hra=0;
		double da =0;
		
		if (basesalary<=10000){
			hra=basesalary*0.20;
			da=basesalary*0.8;
		}
		else if (basesalary<=10000) {
			hra=basesalary*0.25;
			da=basesalary*0.90;
		}
		else {
			hra=basesalary*0.30;
			da=basesalary*0.95;
		}
		double grosssalary =basesalary+hra+da;
		System.out.println(grosssalary);

	}

}
        Output->49500.0
		
	11  find table of given number
	    Solution->
		package conditionalstatements;

        public class printtable {

	    public static void main(String[] args) {
	
	
		int num=5;            //given number
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(i*num);
		}

	}

}       
    Output->
	5
	10
	15
	20
	25
	30
	35
	40
	45
	50
	
	 

          

        

		     

		

		

		




