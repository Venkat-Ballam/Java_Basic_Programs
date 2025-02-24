// CapitalToSmall_Ternary
class CapitalToSmall_Ternary {
    public static void main(String[] args) {
        
        int number = 1000;
        char letter = 'v';
        
    char updated_letter = (number<100 ? (char)(letter+32) : (char)(letter-32));
    System.out.println(updated_letter);
    }
}