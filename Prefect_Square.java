// Prefect Square
class Prefect_Square {
    public static void main(String[] args) {
        System.out.println("ternary operator:");
        System.out.println("--------------------");
        
        double number = 256;
        double prefect_square = Math.sqrt(number);
        
        String result = (number%prefect_square == 0 ? "Prefect Square" : "Not a Prefect Square");
        
        System.out.println(result);
    }
}