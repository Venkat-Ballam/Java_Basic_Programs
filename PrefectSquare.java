// Prefect square
class PrefectSquare {
    public static void main(String[] args) 
{
        System.out.println("Prefect Square Program:");
    
         double number = 23;
         double square = Math.sqrt(number);
         if(number%square == 0)
         {
             System.out.println("Prefect Square!");
         }
         else
         {
             System.out.println("Not a Prefect Square!");
         }
    }
}