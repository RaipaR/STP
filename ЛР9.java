import java.util.Scanner;

public class ProverkaYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        try {
            int year = scanner.nextInt();

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - не високосный год");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при вводе данных!");
        }
    }
}
