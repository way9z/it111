import javax.swing. *;    // This is JFrame assignment
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variable

        JLabel myLabel1, myLabel2;
        JTextField windowTextField1, windowTextField2;

        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 550;


        // Create a window
        JFrame window = new JFrame();

        //set the title
        window.setTitle("Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // set the window centered
        window.setLocationRelativeTo(null);

        // set the background color for red
        window.getContentPane(). setBackground(Color.red);

        // close the window and exit the program
        window. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display the window, it will not display!
        //  window.setVisible(true);


        myLabel1 = new JLabel("My First Big Label!!!");

        myLabel1.setBounds(20,30,300,90);
        myLabel1.setFont(new Font("Serif", Font.PLAIN,20));

        windowTextField1 = new JTextField(15);
        windowTextField1.setBounds(20,100,300,50);

        myLabel2 = new JLabel("My Second Big Label!");

        myLabel2.setBounds(20,150,300,30);
        myLabel2.setFont(new Font("Serif", Font.BOLD,20));

        windowTextField2 = new JTextField(15);
        windowTextField2.setBounds(20,200,300,50);



        window.add(myLabel1);
        window.add(windowTextField1);

        window.add(myLabel2);
        window.add(windowTextField2);




        window.setLayout(null);
     //   display the window
        window.setVisible(true);


    }

}

