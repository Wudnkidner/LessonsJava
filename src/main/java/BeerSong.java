/**
 * Created by albert on 02.08.16.
 */
public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";
        while (beerNum > 0) {
            if (beerNum ==1) {
                word = "бутылка"; // В единственном чысОДНА бутылка
            }
            if (beerNum == 99) {
                System.out.println (beerNum + " " + word + " пива на стене");
            }
            System.out.println(beerNum + " " + word + " пива.");
            System.out.print("Возьми одну, ");
            System.out.println("пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            } // Конец else
        } // Конец цикла wfci:
    } // Конец метода main
} // Коней класса