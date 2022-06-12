import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
    double kg, boy, end;

    Scanner input = new Scanner(System.in);

    System.out.println("\nHosgeldiniz Vucut Kitle Indexinizi Ogrenmek Icin Istenilen Degerleri Giriniz");
    System.out.println("(Lufen Ondalik Kisimlari NOKTA ile degil VIRGUL ile ayirin !!!)");

    System.out.print("\nBoyunuzun Olcusunu Giriniz (M) : ");
    boy = input.nextDouble();

    System.out.print("\nKilonuzun Olcusunu Giriniz (KG) : " );
    kg = input.nextDouble();

    end = kg/(Math.pow(boy,2));

    System.out.println("\nVucut Kitle Indeksiniz : " + end);
    }
}
