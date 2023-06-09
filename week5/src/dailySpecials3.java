import java.util.Scanner;

public class dailySpecials3 {


    public static void main(String[] args) {

        String specials = null;
        int order;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();
        String coffee = null;
        double price = 0;


        boolean weekendDay = true;
        while (weekendDay) {

            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");
            specials = input.next();


            switch (specials) {

                case "Monday" -> {
                    weekendDay = false;
                    coffee = " Latte";
                    price = 4.95;

                    System.out.println(specials + "'s coffee of the day is a" + coffee + "and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like order?");
                    order = input.nextInt();



                }
                case "Tuesday" -> {
                    weekendDay = false;
                    coffee = "Frapp";
                    price = 5.95;


                }
                case "Wednesday" -> {
                    weekendDay = false;
                    coffee = " Cappucino";
                    price = 4.35;


                }

                case "Thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;

                }
                case "Friday" -> {
                    weekendDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;


                    if (order == 0) {
                        System.out.println("Looks like you don't like" + coffee + " s!" + "So sad!!!");

                    } else if (order == 1) {
                        System.out.println(" Look like you will be ordering only 1" + coffee + " today totalling $" + price + " dollars");

                    } else if (order > 1 && order < 5) {
                        System.out.print(order + coffee + "s have been ordered totalling ");
                        System.out.printf("$%.2f", (order * price));

                    } else if (order >= 5 && order < 10) {
                        System.out.print(order + coffee + "s have been ordered totalling ");
                        System.out.printf("$%.2f", (order * price) * 0.9);

                    } else if (order >= 10) {
                        System.out.print("A bigger group discount! Your regular price is ");
                        System.out.printf("$%.2f", order * price);
                        System.out.println();
                        System.out.print("You have ordered " + order + coffee + "s but will be only charged $");
                        System.out.printf("$%.2f", (order * price) * 0.8);
                        System.out.println(" dollars!");


                    }


                }
            }
        }

