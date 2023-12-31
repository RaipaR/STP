public class Car {
    private String model;
    private int year;

    // Конструктор для инициализации значений при создании объекта
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
//В данном примере данные  инкапсулированы внутри класса, а доступ к ним осуществляется через геттеры и сеттеры, что обеспечивает контролируемый доступ к состоянию объекта и позволяет реализовать ограничения на значения, которые могут быть установлены.
