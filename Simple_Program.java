class Simple_Program
{
    public static void main(String args[])
    {
        int num = 1234;
        int reaming_digits = num/10;
        int last_digit = num%10;
        
        int total_value = reaming_digits + last_digit;
        
        System.out.println("Total Value : "+total_value);
    }
}