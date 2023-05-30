package package_person_homework.PersonDetails;

public class Person {

    // this file does not have a main method
    // I will start typing fields (variable)

    String name;
    int age;
     int car;

     boolean violations;
     double creditScore;

     public void display() {
         System.out.println("Your name: " +name);
         System.out.println("Your Age: " +age);
         System.out.println("Your car: " +car);
         System.out.println("Your violations: " +violations);
         System.out.println("Your credit Score: " +creditScore);


     }
     // logic regarding our credit score and violation
    public double getRate(double monthlyRate) {
         if (violations == true && creditScore <= 700) {
             monthlyRate = 500.00;

         } else {
             monthlyRate = 100.00;
         }
         return monthlyRate;

    }

    public double assumeAge(double adjustedRate) {
         if (age <=23) {
             adjustedRate = 100;

         } else {
             adjustedRate = 0;
         }
         return adjustedRate;
    }

     public double carage(double adjustedRate) {
         if (car >= 2015) {
             adjustedRate = 200;

         } else {
             adjustedRate = 100;

         }
         return  adjustedRate;
     }


}
