

public class MyEnum2 {

    enum Wines {CABERNET, MERLOT, SYRAN}


    public static void main(String[] args) {
Wines choose = Wines.MERLOT;

        System.out.println(choose);

switch (choose) {
    case CABERNET:
        System.out.println("Love my Washington Cabernets");
        break;

    case MERLOT:
        System.out.println("The main character in Sideways did not like merlots");
        break;

    case SYRAN:
        System.out.println("I like some Syrahs");
        break;

    default:
        System.out.println("Invalid input");


}
    }
}
