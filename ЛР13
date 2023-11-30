import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RedaktorTeksta {
    private JFrame okno; // главное окно
    private JTextArea tekstovoePole; // текстовое поле для ввода и отображения текста

    public RedaktorTeksta() {
        okno = new JFrame("Редактор текста"); // создание главного окна
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(500, 400); // установка размеров окна

        tekstovoePole = new JTextArea(); // создание текстового поля
        okno.getContentPane().add(new JScrollPane(tekstovoePole), BorderLayout.CENTER); // добавление текстового поля в центр окна с возможностью прокрутки

        JMenuBar menuBar = new JMenuBar(); // создание строки меню
        okno.setJMenuBar(menuBar); // установка строки меню в окне

        JMenu menu = new JMenu("Файл"); // создание меню "Файл"
        menuBar.add(menu); // добавление меню в строку меню

        JMenuItem otkryt = new JMenuItem("Открыть"); // создание пункта меню "Открыть"
        otkryt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(); // создание диалогового окна для выбора файла
                int result = fileChooser.showOpenDialog(okno); // отображение диалогового окна
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile(); // получение выбранного файла
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(file)); // чтение файла
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line);
                            sb.append("\n");
                        }
                        reader.close();
                        tekstovoePole.setText(sb.toString()); // отображение текста файла в текстовом поле
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(okno, "Ошибка при открытии файла", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        menu.add(otkryt); // добавление пункта меню "Открыть" в меню "Файл"

        JMenuItem sohranit = new JMenuItem("Сохранить"); // создание пункта меню "Сохранить"
        sohranit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(); // создание диалогового окна для выбора файла
                int result = fileChooser.showSaveDialog(okno); // отображение диалогового окна
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile(); // получение выбранного файла
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // запись в файл
                        writer.write(tekstovoePole.getText()); // запись текста из текстового поля в файл
                        writer.close();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(okno, "Ошибка при сохранении файла", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        menu.add(sohranit); // добавление пункта меню "Сохранить" в меню "Файл"

        okno.setVisible(true); // отображение окна
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RedaktorTeksta(); // создание экземпляра редактора текста
            }
        });
    }
}
