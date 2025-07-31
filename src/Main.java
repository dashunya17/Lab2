import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите верхнее число: ");
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        System.out.println("Введите число х (0 < x <= 2): ");
        Scanner am = new Scanner(System.in);
        double x = am.nextDouble();
        if((x < 0) || (x >= 2))
        {
            System.out.println("Число х не подходит по условию");
            return;
        }

        double sum = 0;
        for(double n =0; n < i; n++)
        {
            double value = (Math.pow(-1, n)*Math.pow(x-1, n+1))/(n+1);
            sum += value;
        }
        System.out.println("Сумма: "+sum);

    }
}
