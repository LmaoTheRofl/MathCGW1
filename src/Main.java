import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек на интервале");
        int n = scanner.nextInt();
        Integral x = new Integral(n, 0, 1, 0);
        System.out.println(x.calculate());
    }
}