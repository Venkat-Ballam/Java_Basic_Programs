// Profit Loss Program

class Profit_Loss {
    public static void main(String[] args) {
        System.out.println("Profit and Loss Predication:");
        
        int product_cost = 650;
        int selling_price = 520;
        
        int profit = selling_price - product_cost;
        int loss = product_cost - selling_price;
        
        if(product_cost < selling_price)
        {
            System.out.println("The Seller Incurred Profit Of : "+profit);
        }
        else
        {
            System.out.println("The Seller Incurred Loss Of : "+loss);
        }
         
    }
}