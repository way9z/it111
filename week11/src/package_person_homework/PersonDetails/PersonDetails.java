package package_person_homework.PersonDetails;

public class PersonDetails {
// this file will have a main method

    public static void main(String[] args) {

    Person firstPerson;
    Person secondPerson;

//  in the process of creating on object from our person class

     firstPerson = new Person();
     secondPerson = new Person();

//  will be entering the information, assigning volues to our fields

     firstPerson.name = "Cathy Jones";
     firstPerson.age = 33;
     firstPerson.car = 2010;
     firstPerson.violations = false;
     firstPerson.creditScore = 690.0;

        secondPerson.name = "Kendall Black";
        secondPerson.age = 22;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 570.0;

//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();

        System.out.println("Preliminary Rate for" +firstPerson.name+ ":" +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Person age Adjustment:" +firstPerson.assumeAge(adjustedRate) );
        System.out.println("car age Adjustment: " +firstPerson.carage(adjustedRate));
        System.out.println("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeAge(adjustedRate) +firstPerson.getRate(monthlyRate) + firstPerson.carage(adjustedRate));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for" + secondPerson.name+ ":" +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Person age Adjustment:" +secondPerson.assumeAge(adjustedRate) );
        System.out.println("car age Adjustment: " +secondPerson.carage(adjustedRate));
        System.out.println("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeAge(adjustedRate) +secondPerson.getRate(monthlyRate) + secondPerson.carage(adjustedRate));
}

}
