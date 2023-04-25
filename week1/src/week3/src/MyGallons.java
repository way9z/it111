public class MyGallons {

    public static void main(String[] args) {
        double liter;
        double gallon;
        int counter = 0;

        for (gallon = 1; gallon <= 100; gallon = gallon + 4) {

            liter = gallon * 3.79;
            //System.out.printf("%.2f", liter);
            if (gallon == 1) {
                System.out.printf("%.2f", liter);
                System.out.println( "liters = " + gallon + "Gallon");
            } else {
                System.out.printf("%.2f", liter);
                System.out.println( "liters = " + gallon + "Gallons");

            }
            counter += 1;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println("We are done!!!");
    }
}




