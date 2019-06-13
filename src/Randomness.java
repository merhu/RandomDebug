import java.util.Random;
public class Randomness {
    public static void main(String[] args) {
        //This program should generate
        // 10 random integers from 1 to 6. Fix it so that it works...

        Random rnd = new Random();
        int a;
        a = rnd.nextInt(6) + 1;
        {
            for (int i = 0; i < 6; i--) ;
            System.out.println(" Printing " + a);


        }
    }
}


