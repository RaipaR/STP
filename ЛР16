import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TekstovyRedaktor {
    private JFrame okno;
    private JTextArea tekstovoePole;
    private Thread potokAvtazameny;

    public TekstovyRedaktor() {
        okno = new JFrame("Текстовый редактор");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(500, 400);

        tekstovoePole = new JTextArea();
        tekstovoePole.setFont(new Font("Arial", Font.PLAIN, 12));
        tekstovoePole.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Ничего не делаем при нажатии клавиши
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Ничего не делаем при удерживании клавиши
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    zapustitPotokAvtazameny();
                }
            }
        });

        okno.getContentPane().add(new JScrollPane(tekstovoePole));

        okno.setVisible(true);
    }

    private void zapustitPotokAvtazameny() {
        if (potokAvtazameny != null && potokAvtazameny.isAlive()) {
            potokAvtazameny.interrupt();
        }

        potokAvtazameny = new Thread(new Runnable() {
            @Override
            public void run() {
                avtozamenyaSlov();
            }
        });

        potokAvtazameny.start();
    }

    private void avtozamenyaSlov() {
        String tekst = tekstovoePole.getText();
        String[] slova = tekst.split("\\s+");

        for (int i = 0; i < slova.length; i++) {
            String slovo = slova[i];
            String ispravlennoeSlovo = ispravitSlovo(slovo);

            if (!slovo.equals(ispravlennoeSlovo)) {
                tekst = tekst.replace(slovo, ispravlennoeSlovo);
            }
        }

        tekstovoePole.setText(tekst);
    }

    private String ispravitSlovo(String slovo) {
        // Здесь можно реализовать логику автозамены слова
        // Например, можно использовать словарь или базу данных для поиска и замены слов

        // В данном примере просто заменим слово "привет" на "hello"
        if (slovo.equals("привет")) {
            return "hello";
        }

        return slovo;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TekstovyRedaktor();
            }
        });
    }
}
