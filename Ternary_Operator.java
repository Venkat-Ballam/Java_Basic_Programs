// Ternary Operator
class Ternary_Operator {
    public static void main(String[] args) {
        System.out.println("ternary operator:");
        System.out.println("--------------------");
        
        int x = 10, y =20;
        
        System.out.println("Direct Printing:");
        System.out.println("--------------------------------------");
        System.out.println(x<y?true:false);
        System.out.println(x>y?true:false);
        System.out.println();
        System.out.println(x<y?"x is smaller then y":"x is grater then y");
        System.out.println(x>y?"x is smaller then y":"x is grater then y");
        
        System.out.println("--------------------------------------");
        System.out.println("Storing and Printing:");    
        System.out.println("--------------------------------------");
        boolean result1 = (x<y?true:false);
        boolean result2 = (x>y?true:false);
        
        String res1 = (x<y?"x is smaller then y":"x is grater then y");
        String res2 = (x>y?"x is smaller then y":"x is grater then y");
        
        System.out.println("Storing and Printing boolean1 : "+result1);
        System.out.println("Storing and Printing boolean2 : "+result2);
        System.out.println("Storing and Printing String1 : "+res1);
        System.out.println("Storing and Printing String2 : "+res2);
        
    }
}