import java.util.Scanner;
public class iloscLiczb {
    public static void main(String[] args) {
        System.out.println("Wprowadź ilość liczb jaką chcesz ze sobą zsumować");
        Scanner sc = new Scanner(System.in);
        int numbers =sc.nextInt();

        System.out.println("Podaj liczby które chcesz ze sobą zsumować");

        int suma =0;

        for (int i=0; i < numbers; i++ ){
            System.out.println("Podaj kolejną liczbe: ");
            suma = suma + sc.nextInt();
        }
        System.out.println("Suma wszystkich wpisanych liczb to: " +suma);
        sc.close();
    }
}