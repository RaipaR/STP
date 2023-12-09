import javax.swing.*;
import java.awt.*;

public class MenedzheriKomponovk {
    private JFrame okno; // главное окно
    private JPanel panel1; // панель 1 с менеджером компоновки FlowLayout
    private JPanel panel2; // панель 2 с менеджером компоновки BorderLayout

    public ПримерМенеджеровКомпоновки() {
        okno = new JFrame("Пример менеджеров компоновки"); // создание главного окна
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(500, 400); // установка размеров окна

        panel1 = new JPanel(); // создание панели 1
        panel1.setLayout(new FlowLayout()); // установка менеджера компоновки FlowLayout
        panel1.add(new JButton("Кнопка 1")); // добавление кнопки на панель 1
        panel1.add(new JButton("Кнопка 2")); // добавление кнопки на панель 1

        panel2 = new JPanel(); // создание панели 2
        panel2.setLayout(new BorderLayout()); // установка менеджера компоновки BorderLayout
        panel2.add(new JButton("Север"), BorderLayout.NORTH); // добавление кнопки в северную область панели 2
        panel2.add(new JButton("Юг"), BorderLayout.SOUTH); // добавление кнопки в южную область панели 2
        panel2.add(new JButton("Запад"), BorderLayout.WEST); // добавление кнопки в западную область панели 2
        panel2.add(new JButton("Восток"), BorderLayout.EAST); // добавление кнопки в восточную область панели 2
        panel2.add(new JButton("Центр"), BorderLayout.CENTER); // добавление кнопки в центральную область панели 2

        okno.getContentPane().setLayout(new BorderLayout()); // установка менеджера компоновки BorderLayout для главного окна
        okno.getContentPane().add(panel1, BorderLayout.NORTH); // добавление панели 1 в северную область главного окна
        okno.getContentPane().add(panel2, BorderLayout.CENTER); // добавление панели 2 в центральную область главного окна

        okno.setVisible(true); // отображение окна
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenedzheriKomponovk(); // создание экземпляра приложения
            }
        });
    }
}
