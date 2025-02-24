// UpperCaseToLowerCase

class UpperCaseToLowerCase {
    public static void main(String[] args) {
        
        int number = 100;
        char letter1 = 'A';
        char letter2 = 'z';
        
        if(number < 100)
        {
            char updated_letter = (char)(letter1 + 32);
            System.out.println(updated_letter);
        }
        else
        {
            char updated_letter = (char)(letter2 - 32);
            System.out.println(updated_letter);
        }
    }
}