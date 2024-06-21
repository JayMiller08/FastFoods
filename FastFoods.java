import java.lang.Math;
import java.util.Scanner;
public class FastFoods{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        final double BURGER = 13.50;
        final double PIZZA = 24.00;
        final double CAKE = 60.30;
        final double TAX = 0.15;

        int iNumBurgers, iNumPizza, iNumCake;
        double rTax, rSubtotal, rTotal, rTotalBurgerPrice, rTotalPizzaPrice, rTotalCakePrice;

        System.out.println("Enter number of Burgers ordered: ");
        iNumBurgers = sc.nextInt();
        System.out.println("Enter number of Pizza ordered: ");
        iNumPizza = sc.nextInt();
        System.out.println("Enter number of Cake/s ordered: ");
        iNumCake = sc.nextInt();
        
        rTotalBurgerPrice = iNumBurgers * BURGER;
        rTotalPizzaPrice = iNumPizza * PIZZA;
        rTotalCakePrice = iNumCake * CAKE;
        rSubtotal = rTotalBurgerPrice + rTotalCakePrice + rTotalPizzaPrice;
        rTax = rSubtotal * TAX;
        rTotal = rSubtotal + rTax;
        rTotalBurgerPrice = Math.round(rTotalBurgerPrice * 100.00)/100.00;
        rTotalPizzaPrice = Math.round(rTotalPizzaPrice * 100.00)/100.00;
        rTotalCakePrice = Math.round(rTotalCakePrice * 100.00)/100.00;
        rSubtotal = Math.round(rSubtotal * 100.00)/100.00;
        rTax = Math.round(rTax * 100.00)/100.00;
        rTotal = Math.round(rTotal * 100.00)/100.00;

        System.out.println("----------ORDER SUMMARY----------");
        System.out.println("Burgers @ $13.50: R"+rTotalBurgerPrice);
        System.out.println("Pizza @$24.00: R"+rTotalPizzaPrice);
        System.out.println("Cake @$60.30: R"+rTotalCakePrice);
        System.out.println("Subtotal: $"+rSubtotal);
        System.out.println("Tax: $"+rTax);
        System.out.println("Total: $"+rTotal);
        System.out.println("----------PLEASE SHOP WITH US AGAIN :-)----------");

    }
}