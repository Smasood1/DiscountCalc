public class Product {
     double price; //price
     double discountAmount; //%Discount
     double decimal; //converting from % to a decimal
     double moneyOff; //Multiply that decimal by the price^^^^
     double finalAmount; //Final amount is price subtracting moneyOff which gives Final amount to be paid


    public String discountCalculator(double price, double discountAmount){


        this.price = price;
        this.discountAmount = discountAmount;

        this.decimal = discountAmount/100;
        this.moneyOff = this.decimal * price;
        this.finalAmount = price - this.moneyOff;


        return "Orignal Price: " + "$"+ price + "  |  " + "Discount: - " + "$" + moneyOff + "  |  " + "Final Price: " + "$" + finalAmount;





    }










}
