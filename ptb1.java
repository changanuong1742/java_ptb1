import java.util.Scanner;


public class ptb1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.println("Co Nghiem La: " + solution);
        } else if (b == 0) {
            System.out.println("Vo so nghiem");

        } else {
            System.out.println("Vo nghiem");
        }

    }


}
