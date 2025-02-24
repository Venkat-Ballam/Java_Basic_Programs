// Converting Dollers To Rupees
class DollersToRupees {
    public static void main(String[] args) {
        
	System.out.println("----------------------------------");

        System.out.println("Converting Dollers to Rupees : ");
        
        double one_doller = 86.63;
        int doller = 499;
        
        float dollers_to_rupees = (float)(doller * one_doller);
        
        System.out.println("Dollers = "+doller+"$");
        System.out.println(doller+"$ = "+dollers_to_rupees+" Rupees");
    }
}