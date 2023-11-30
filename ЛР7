import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Вычислить конечное значение на основе начального значения, процента и количества периодов");
        System.out.println("2. Вычислить процент на основе начального и конечного значения и количества периодов");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите начальное значение: ");
            double principal = scanner.nextDouble();

            System.out.print("Введите процент: ");
            double rate = scanner.nextDouble();

            System.out.print("Введите количество периодов: ");
            int periods = scanner.nextInt();

            double result = calculateFinalValue(principal, rate, periods);
            System.out.println("Конечное значение: " + result);
        } else if (choice == 2) {
            System.out.print("Введите начальное значение: ");
            double principal = scanner.nextDouble();

            System.out.print("Введите конечное значение: ");
            double finalValue = scanner.nextDouble();

            System.out.print("Введите количество периодов: ");
            int periods = scanner.nextInt();

            double result = calculateRate(principal, finalValue, periods);
            System.out.println("Процент: " + result);
        } else {
            System.out.println("Некорректный выбор");
        }

        scanner.close();
    }

    // Метод для вычисления конечного значения на основе начального значения, процента и количества периодов
    public static double calculateFinalValue(double principal, double rate, int periods) {
        double result = principal * Math.pow(1 + rate / 100, periods);
        return result;
    }

    // Метод для вычисления процента на основе начального и конечного значения и количества периодов
    public static double calculateRate(double principal, double finalValue, int periods) {
        double result = Math.pow(finalValue / principal, 1.0 / periods) - 1;
        result *= 100;
        return result;
    }
}
