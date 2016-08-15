package oop3;

/**
 * Created by albert on 11.08.16.
 */
public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;

        for (int i = 0; i < 3; i++) {
            myBooks[i] = new Books();
        }

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор: ");
            System.out.println(myBooks[x].author);
            x += 1;
        }

    }

}
