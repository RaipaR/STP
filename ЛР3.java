/*
В этом примере родительский класс Shape содержит абстрактный метод draw(), который должен быть реализован в дочерних классах. Дочерние классы Rectangle и Circle переопределяют этот метод для рисования соответствующих фигур.
В главном классе Main создаются объекты shape1 и shape2, и хотя они имеют разные типы (Rectangle и Circle), они оба ссылаются на объекты, реализующие интерфейс Shape. 
В результате вызова методов draw() на обоих объектах будет выполнена соответствующая реализация метода из дочерних классов.
Это и есть пример полиморфизма, где один интерфейс или базовый класс может иметь несколько разных реализаций, и программа может использовать эти реализации без знания о конкретном классе объекта.
*/

// Родительский класс Shape
public abstract class Shape {
    public abstract void draw();
}

// Дочерний класс Rectangle
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник");
    }
}

// Дочерний класс Circle
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создание объектов разных классов
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        
        // Вызов методов draw() для каждого объекта
        shape1.draw();
        shape2.draw();
    }
}
