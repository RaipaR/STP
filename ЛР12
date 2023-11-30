import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StandartniyKalkulyator {
    private JFrame okno; // главное окно
    private JTextField poleVvoda; // текстовое поле для ввода и отображения чисел
    private double pervoeChislo; // первое число
    private String operaciya; // текущая операция

    public StandartniyKalkulyator() {
        okno = new JFrame("Калькулятор"); // создание главного окна
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(300, 400); // установка размеров окна

        poleVvoda = new JTextField(); // создание текстового поля
        poleVvoda.setPreferredSize(new Dimension(280, 50)); // установка размеров текстового поля
        okno.getContentPane().add(poleVvoda, BorderLayout.NORTH); // добавление текстового поля в верхнюю часть окна

        JPanel panel = new JPanel(); // создание панели для кнопок
        panel.setLayout(new GridLayout(4, 4)); // установка сетки для панели
        okno.getContentPane().add(panel, BorderLayout.CENTER); // добавление панели в центр окна

        String[] knopki = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"}; // массив кнопок
        for (String knopka : knopki) {
            JButton button = new JButton(knopka); // создание кнопки
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String text = poleVvoda.getText(); // получение текущего текста из текстового поля
                    if (text.equals("Ошибка")) {
                        poleVvoda.setText(""); // если в поле отображается ошибка, очищаем его
                    }
                    poleVvoda.setText(text + button.getText()); // добавление текста кнопки в поле
                }
            });
            panel.add(button); // добавление кнопки на панель
        }

        JButton ravno = new JButton("="); // кнопка для выполнения операции
        ravno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = poleVvoda.getText(); // получение текущего текста из текстового поля
                try {
                    double vtoroeChislo = Double.parseDouble(text); // преобразование текста в число
                    double result;
                    switch (operaciya) {
                        case "+":
                            result = pervoeChislo + vtoroeChislo;
                            poleVvoda.setText(String.valueOf(result)); // вывод результата в поле
                            break;
                        case "-":
                            result = pervoeChislo - vtoroeChislo;
                            poleVvoda.setText(String.valueOf(result)); // вывод результата в поле
                            break;
                        case "*":
                            result = pervoeChislo * vtoroeChislo;
                            poleVvoda.setText(String.valueOf(result)); // вывод результата в поле
                            break;
                        case "/":
                            if (vtoroeChislo == 0) {
                                poleVvoda.setText("Ошибка"); // если делитель равен нулю, выводим ошибку
                            } else {
                                result = pervoeChislo / vtoroeChislo;
                                poleVvoda.setText(String.valueOf(result)); // вывод результата в поле
                            }
                            break;
                    }
                } catch (NumberFormatException ex) {
                    poleVvoda.setText("Ошибка"); // если текст нельзя преобразовать в число, выводим ошибку
                }
            }
        });
        panel.add(ravno); // добавление кнопки на панель

                okno.setVisible(true); // отображение окна
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StandartniyKalkulyator(); // создание экземпляра калькулятора
            }
        });
    }
}
