import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек на интервале");
        int n = scanner.nextInt();
        System.out.println("Введите способ выбора точек внутри промежутка: 1-правые, 2-левые, 3-средние, 4-случайные, 0-свое значение");
        int t = scanner.nextInt();
        Integral x = new Integral(n, 0, 1, t);
        System.out.println(x.calculate());
    }
}