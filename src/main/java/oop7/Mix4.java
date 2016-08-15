package oop7;

/**
 * Created by albert on 13.08.16.
 */
public class Mix4 {

    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;

        while (x < 9) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew (int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }

}

/*

21, 41, 61, 81, 101, 111, 121, 131, 141

21, 41, 61, 81, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 201, 211, 221, 231, 241, 251

21, 41, 61, 81, 101, 121, 141

21, 31, 41, 51, 61, 71, 81, 91, 101,111,121,131,141,151,161,171,181,191,201,

 */