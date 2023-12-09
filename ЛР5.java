// Пакет "animals"
package animals;

// Абстрактный класс "Животное"
public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void makeSound();
}

// Конкретный класс "Млекопитающее"
package animals;

public class Mammal extends Animal {
    private int numberOfLegs;

    public Mammal(String name, int age, double weight, int numberOfLegs) {
        super(name, age, weight);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void makeSound() {
        System.out.println("Млекопитающее издает звук");
    }
}

// Конкретный класс "Рептилия"
package animals;

public class Reptile extends Animal {
    private boolean hasScales;

    public Reptile(String name, int age, double weight, boolean hasScales) {
        super(name, age, weight);
        this.hasScales = hasScales;
    }

    public boolean hasScales() {
        return hasScales;
    }

    @Override
    public void makeSound() {
        System.out.println("Рептилия издает звук");
    }
}

// Пакет "enclosures"
package enclosures;

import animals.Animal;

// Интерфейс "Вольер"
public interface Enclosure {
    void addAnimal(Animal animal);
    void removeAnimal(Animal animal);
    void getAnimals();
}

// Конкретный класс "Клетка"
package enclosures;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cage implements Enclosure {
    private List<Animal> animals;

    public Cage() {
        animals = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void getAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}

// Конкретный класс "Аквариум"
package enclosures;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium implements Enclosure {
    private List<Animal> animals;

    public Aquarium() {
        animals = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void getAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}

// Пакет "zoo"
package zoo;

import animals.Animal;
import enclosures.Enclosure;

import java.util.ArrayList;
import java.util.List;

// Класс "Зоопарк"
public class Zoo {
    private List<Enclosure> enclosures;

    public Zoo() {
        enclosures = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

    public void getEnclosures() {
        for (Enclosure enclosure : enclosures) {
            enclosure.getAnimals();
        }
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cage cage = new Cage();
        cage.addAnimal(new Mammal("Лев", 5, 200, 4));
        cage.addAnimal(new Mammal("Тигр", 4, 150, 4));
        zoo.addEnclosure(cage);

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(new Reptile("Крокодил", 10, 500, true));
        aquarium.addAnimal(new Reptile("Ящерица", 2, 0.1, false));
        zoo.addEnclosure(aquarium);

        zoo.getEnclosures();
    }
}
