import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KolodaKart {
    private List<String> koloda; // список для хранения карт

    public KolodaKart() {
        koloda = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            koloda.add(String.valueOf(i)); // добавление карт от 2 до 10
        }
        koloda.add("Ace"); // добавление карты "Туз"
        koloda.add("King"); // добавление карты "Король"
        koloda.add("Queen"); // добавление карты "Дама"
        koloda.add("Jack"); // добавление карты "Валет"
    }

    public void peretasovatKolodu() {
        Collections.shuffle(koloda); // метод shuffle для перетасовки колоды
    }

    public String sdachaKarty() {
        if (koloda.isEmpty()) {
            return null; // если колода пуста, возвращаем null
        }
        String karta = koloda.remove(0); // удаление и возвращение первой карты из колоды
        return karta;
    }

    public void vozvratKarty(String karta) {
        if (!koloda.contains(karta)) {
            koloda.add(karta); // добавление карты в колоду, если она не была ранее возвращена
        }
    }

    public int razmerKolody() {
        return koloda.size(); // возвращение размера колоды
    }

    public static void main(String[] args) {
        KolodaKart kolodaKart = new KolodaKart(); // создание экземпляра класса KolodaKart
        kolodaKart.peretasovatKolodu(); // перетасовка колоды
        System.out.println("Размер колоды: " + kolodaKart.razmerKolody()); // вывод размера колоды

        String karta1 = kolodaKart.sdachaKarty(); // сдача карты
        System.out.println("Сдана карта: " + karta1);
        System.out.println("Размер колоды после сдачи: " + kolodaKart.razmerKolody());

        kolodaKart.vozvratKarty(karta1); // возврат карты в колоду
        System.out.println("Размер колоды после возврата карты: " + kolodaKart.razmerKolody());
    }
}
