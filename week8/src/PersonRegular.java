public class PersonRegular {

    public static void main(String[] args) {

        //to create our variables
        String firstPersonName = "Cathy";
        String secondPersonName = "kendall";

        char firstPersonGender = 'F';
        char secondPersonGender = 'M';

        int firstPersonAge = 33;
        int secondPersonAge = 22;

        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";

        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;

        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        double monthlyRate1;
        double monthlyRate2;

        double adjustRate1;
        double adjustRate2;


        // logic in the car insurance industry - if  you have traffic tickets, DUIs, other
        // violations, you will be paying more for your insurance also, if you have a
        // poor credit, you will pay more money

     if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
      monthlyRate1 = 500;

     } else  {
      monthlyRate1 = 100;
     }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;

        } else  {
            monthlyRate2 = 100;
        }
// will gender and age make a difference???

        if(firstPersonAge <= 25 && firstPersonGender == 'F') {
            adjustRate1 = 100;

        } else {
            adjustRate1 = 0;
        }


        if(secondPersonAge <= 25 && secondPersonGender == 'M') {
            adjustRate2 = 100;

        } else {
            adjustRate2 = 0;
        }

        double total1 = monthlyRate1 + adjustRate1;
        double total2 = monthlyRate2 + adjustRate2;

        System.out.println("First Person Name: " +firstPersonName);
        System.out.println("First Person Gender: " +firstPersonGender);
        System.out.println("First Person Age: " +firstPersonAge);
        System.out.println("First Person Car: " +firstPersonCar);
        System.out.println("First Person Violations: " +firstPersonViolations);
        System.out.println("First Person Credit Score: " +firstPersonCreditScore);
        System.out.println("First Person preliminary rate: " +monthlyRate1);
        System.out.println("First Person Final Monthly rate(including gender and age): " +total1);

        System.out.println();

        System.out.println("Second Person Name: " +secondPersonName);
        System.out.println("Second Person Gender: " +secondPersonGender);
        System.out.println("Second Person Age: " +secondPersonAge);
        System.out.println("Second Person Car: " +secondPersonCar);
        System.out.println("Second Person Violations: " +secondPersonViolations);
        System.out.println("Second Person Credit Score: " +secondPersonCreditScore);
        System.out.println("Second Person Monthly rate: " +monthlyRate2);
        System.out.println("second Person Final Monthly rate(including gender and age): " +total2);
    }


}
