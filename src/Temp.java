import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Lutfen Hava Sicakligini Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayaga Gidebilirsiniz ! ");
        } else if (heat < 15) {
            System.out.print("Sinemaya Gidebilirsiniz ! ");
        } else if (heat < 25) {
            System.out.print("Piknige Gidebilirsiniz ! ");
        } else {
            System.out.print("Yuzmeye Gidebilirsiniz ! ");
        }
    }
}

