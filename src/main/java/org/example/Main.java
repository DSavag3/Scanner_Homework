package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double price = 0;

        java.util.Scanner cost = new java.util.Scanner(System.in);

        System.out.println("What would you like? \n We have Rice which is $5 a pound, Corn which is $7 a pound and Beans which is $2 a pound");


        String productEntered = cost.nextLine();

        switch (productEntered) {
            case "Rice" -> price = 5;
            case "rice" -> price = 5;
            case "Corn" -> price = 7;
            case "corn" -> price = 7;
            case "Beans" -> price = 2;
            case "beans" -> price = 2;
            default -> {
                System.out.println("We do not have that product");
                System.exit(0);
            }
        }

        System.out.println("How many pounds do you want? (Insert Number)");

        int quantityEntered = cost.nextInt();

        System.out.println("How many miles have you driven? (Insert Number)");

        int milesEntered = cost.nextInt();

        double total = quantityEntered * price;

        if (milesEntered > 0 && milesEntered < 5) {
            total += 2;
        } else if (milesEntered > 5 && milesEntered < 15) {
            total += 5;
        } else if (milesEntered > 15 && milesEntered < 25) {
            total += 10;
        } else if (milesEntered > 25 && milesEntered < 50) {
            total += 15;
        } else if (milesEntered > 50) {
            total += 20;
        }


        System.out.println(" Product" + " Qty" + " Price" + " Miles" + " Total");
        System.out.println(" " + "----" + "   " + "---" + "  " + "-----" + "  " + "-----" + "  " + "-----");
        System.out.println("  " + productEntered + "    " + quantityEntered + "    " + price + "    " + milesEntered + "    " + total);


    }
}