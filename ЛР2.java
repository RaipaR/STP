// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Производный класс, наследующий свойства и методы от базового класса Animal
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    public void wagTail() {
        System.out.println("Tail is wagging");
    }
}

// В этом примере класс Dog наследует от класса Animal, что позволяет ему использовать метод makeSound, определенный в классе Animal. Кроме того, класс Dog также имеет собственный метод wagTail.
// Если нужно создать еще один класс, например Cat, который также наследует от класса Animal и имеет собственный метод, можно сделать это аналогичным образом:


class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Scratching");
    }
}
