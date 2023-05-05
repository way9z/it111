import java.util.Scanner;

public class dailySpecials1 {


    public static void main(String[] args) {

        String specials;
        int order;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();


// in the world to of coffee, I need a name of a beverage and price

        String coffee;
        double price;


        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }


        switch (specials) {

            // my cases will be the day of the week
            case "Monday" -> {
                coffee = " Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println("How many " + coffee + "s would you like order?");
                order = input.nextInt();
               // System.out.println("Looks like you don't like " + coffee + "! So sad!!!");

                if (order == 0) {
                   
                    // System.out.println("Looks like you don't like Lattes! So sad!!!");

                } else if (order == 1) {
                    System.out.println(" Look like you will be ordering only 1" +coffee+ " today!");
                } else if (order > 1) {
                    System.out.println(order + coffee + " have been ordered totalling " + price * order + " dollars ");
                    System.out.printf("%.2f", price);
                }

            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + "and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
               // order = input.nextInt();
                System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");


            }
            case "Wednesday" -> {
                coffee = " Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a" + coffee + "and the price will be $" + price);
               // order = input.nextInt();
                System.out.println("How many " + coffee + " would you like to order?");


            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + "and the price will be $" + price);
                //order = input.nextInt();
                System.out.println("How many " + coffee + " would you like to order?");

            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "and the price will be $" + price);
                //order = input.nextInt();
                System.out.println("How many " + coffee + " would you like to order?");

                System.out.println("Please enter a weekday, not weekend!");


//                System.out.println("Problem!!!");

            }


        }
    }
}

