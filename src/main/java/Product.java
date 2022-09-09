public class Product {
     double price;
     double discountAmount;
     double decimal;
     double moneyOff;
     double finalAmount;

    public String discountCalculator(double price, double discountAmount){

        this.price = price;
        this.discountAmount = discountAmount;

        this.decimal = discountAmount/100;
        this.moneyOff = this.decimal * price;
        this.finalAmount = price - this.moneyOff;

        return "Orignal Price: " + "$"+ price + "  |  " + "Discount: - " + "$" + moneyOff + "  |  " + "Final Price: " + "$" + finalAmount;
    }
}