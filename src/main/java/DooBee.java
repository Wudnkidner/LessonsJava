/**
 * Created by albert on 02.08.16.
 */
//Result: DooBeeDooBeeDo

public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x += 1;
        }

        if (x == 3) {
            System.out.print("Do");
        }
    }
}
