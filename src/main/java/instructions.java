
//-Create a method named discountCalculator(double price, int discount)
//-The method should return the final price of a product after discounts

// For example:
// -If i invoke your method in main and pass in two arguments discountCalculator(100.00, 10);
// -Then your method should RETURN the final price after discounts which would be $90


//step 1 create a main method
//step 2 create a new class where we can create a method and invoke it into main
//step 3 create a method discountCalculator which performs a function, compartmentalizes it,
//       and then returns it back to wherever it was called, in this case the Main method
//       we are passing parameters price and discount amount,
//step 4 declare our variables, in this case we use double price and double discountamount
//step 5 we must use this. so java doesnt confuse the set data with the instance variables
//       because they are the same name
//step 6 Now we need to create functions, in order to do this we need to declare more variables and set that
//       equal to the function/equation
//step 7 the next step is figure out how to solve for discount
//       formula for converting percentage to final price.
//       (discountAmount/100) * originalprice
//step 8 divide the discount amount by 100 because PEMDAS
//step 9 take the answer to the above function and multiply that by price
//step 10 next we need to subtract the moneyoff from the orignal price
//step 11 now we need to return the answer to the function finalamount