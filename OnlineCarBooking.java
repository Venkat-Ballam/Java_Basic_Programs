//Online Car Booking
class Car {
    public static void main(String[] args) {
        System.out.println("Online Car Booking");
        System.out.println("-------------------------------");
        
        byte car_id = 123;
        short car_number = 4504;
        String car_brand = "Fortuner";
        String car_colour = "White";
        char car_class = 'S';
        int car_price = 5194000;
        double car_milage = 14.47;
        float car_rating = (float)4.5;
        int normal_discount = 130000;
        double phonepay_discount = 35000.55;
        double googlepay_discount = 34500.147;
        double CashOnDelivery_discount = 30000.15;
        double tax = 28.12;
        boolean car_booked = true;
        
        System.out.println("Car Information:\n");
        
        System.out.println("Car ID                  : "+car_id);
        System.out.println("Car Number              : "+car_number);
        System.out.println("Car Brand               : "+car_brand);
        System.out.println("Car Colour              : "+car_colour);
        System.out.println("Car Class               : "+car_class);
        System.out.println("Car Miliage             : "+car_milage);
        System.out.println("Car Price               : "+car_price);
        System.out.println("Car Rating              : "+car_rating);
        System.out.println("Normal Discount         : "+normal_discount);
        System.out.println("Phone-Pay Discount      : "+phonepay_discount);
        System.out.println("Google-Pay Discount     : "+googlepay_discount);
        System.out.println("CashOnDelivery_Discount : "+CashOnDelivery_discount);
        System.out.println("Tax                     : "+tax);
        System.out.println("Car_Status              : "+car_booked);
        
        System.out.println();
        
        double total_discount1 = normal_discount + phonepay_discount;
        double total_discount2 = normal_discount + googlepay_discount;
        double total_discount3 = normal_discount + CashOnDelivery_discount;
        
        double car_price_include_total_discount_pp = car_price - total_discount1;
        
        double car_price_include_total_discount_gp = car_price - total_discount2;
        
        double car_price_include_total_discount_cod = car_price - total_discount3;
        
        double tax_phone_pay = car_price_include_total_discount_pp * 28.12/100;
        double tax_google_pay = car_price_include_total_discount_gp * 28.12/100;
        double tax_CashOnDelivery = car_price_include_total_discount_cod * 28.12/100;
        
       double total_car_price_phone_pay = car_price_include_total_discount_pp + tax_phone_pay;
       double total_car_price_google_pay = car_price_include_total_discount_gp + tax_google_pay;
       double total_car_price_COD = car_price_include_total_discount_cod + tax_CashOnDelivery;

       System.out.println("--------------------------------");
    
       System.out.println("Car Price Before Discount's and tax : "+car_price);
    
       System.out.println("--------------------------------");
    
       System.out.println("Car Price's After Discount's and tax");
    
       System.out.println("Final Price's Of Car\n");
    
       System.out.println("Car Price Via Phone-Pay     : "+total_car_price_phone_pay);
    
       System.out.println("Car Price Via Google-Pay    : "+total_car_price_google_pay);
    
       System.out.println("Car Price Via COD           : "+total_car_price_COD);
        
   }
}