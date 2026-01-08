public class bill
{
    public static void main(String[] args)
    {
        int Item_A = 2;
        int Item_B = 1;
        int Item_C = 3;

        double price_A = 200;
        double price_B = 75;
        double price_C = 500;
        
        double Total_price = (Item_A*price_A)+(Item_B*price_B)+(Item_C*price_C);
        double Discount = Total_price*0.1;
        double Discount_price = Total_price-Discount;
        double Tax = Discount_price*0.05;
        double Final_amount = Total_price - Discount +Tax;
    
        System.out.println("The total price of the products is:" +Total_price);
        System.out.println("The discount on the bought products is:" +Discount);
        System.out.println("The price after the discount is:" +Discount_price);
        System.out.println("The tax on the bought  products is:" +Tax);
        System.out.println("The final price of the brought products is:" +Final_amount);
        
    }
}