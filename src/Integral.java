import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Integral {
    int n; //количество точек минимум 2
    float a; //начальная точка
    float b; //конечная точка
    int t; //способ выбора точек внутри промежутка: 1-правые, 2-левые, 3-средние, 4-случайные, 0-свое значение
    // double j; параметр, определяющий положение точек внутри элементарных отрезков от 0 до 1

    public Integral(int n, float a, float b, int t) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.t = t;
    }
    public double calculate() {
        if (n < 2) {
            System.out.println("Incorrect input");
            System.exit(1);
        }
        if (t == 1){
            double j = 0;
            double[] arr = new double[n-1];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = Math.pow(Math.E, (a + i * (b-a)/(n-1) + j * (b-a)/(n-1)));
            }
            double sum = DoubleStream.of(arr).sum();
            return sum*(b-a)/(n-1);}
        else if (t == 2) {
            double j = 1;
            double[] arr = new double[n-1];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = Math.pow(Math.E, (a + i * (b-a)/(n-1) + j * (b-a)/(n-1)));
            }
            double sum = DoubleStream.of(arr).sum();
            return sum*(b-a)/(n-1);}
        else if (t == 3){
            double j = 0.5;
            double[] arr = new double[n-1];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = Math.pow(Math.E, (a + i * (b-a)/(n-1) + j * (b-a)/(n-1)));
            }
            double sum = DoubleStream.of(arr).sum();
            return sum*(b-a)/(n-1);}
        else if (t == 4) {
        double j = Math.random();
            double[] arr = new double[n-1];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = Math.pow(Math.E, (a + i * (b-a)/(n-1) + j * (b-a)/(n-1)));
            }
            double sum = DoubleStream.of(arr).sum();
            return sum*(b-a)/(n-1);}
        else if (t == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите своё значение j от 0 до 1");
            double j = scanner.nextDouble();
            if (j < 0 || j > 1) {
                System.out.println("Incorrect input");
                System.exit(1);
                double[] arr = new double[n-1];
                for (int i = 0; i<arr.length; i++) {
                    arr[i] = Math.pow(Math.E, (a + i * (b-a)/(n-1) + j * (b-a)/(n-1)));
                }
                double sum = DoubleStream.of(arr).sum();
                return sum*(b-a)/(n-1);}
        }
        return 0;
    }



}
