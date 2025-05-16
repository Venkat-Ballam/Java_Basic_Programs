//Automatic_number
class Main
{
  public static void main(String[] args)
  {
    Main pc=new Main();
   int num=762;
   int squared_number = pc.square_number(num);
		
		int count = pc.no_of_digits(num);
		
		int power = (int)(Math.pow(10,count));
		
		System.out.println(num+" is "+pc.isAutomatic_Number(num,squared_number,power));
   }
    int square_number(int number)
	{
		int squared_number = number * number;
		return squared_number;
	}
	int no_of_digits(int num)
	{
		int count = 0;
		while(num != 0)
		{
			count++;
			num = num / 10;
		}
		    return count;
	}
	String isAutomatic_Number(int num,int squared_number,int power)
	{
		  if(num == squared_number%power)
		  {
			  return "Automatic_Number";
		  }
		      return "Not A Automatic_Number";
	}
}
  

		
