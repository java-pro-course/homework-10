abstract class Human {
    private String name;
    private String surname;
    private int age;
    private int weight;

    public Human(String name, String surname, int age, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public abstract void relax();

    public void happyBirthday(Human human) {
        human.age += 1;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Man extends Human implements IPrintable, IKoritsa {
    public Man(String name, String surname, int age, int weight) {
        super(name, surname, age, weight);
    }

    @Override
    public void relax() {
        // Например, мужчины любят смотреть телек во время отдыха
        int currentWeight = this.getWeight();
        this.setWeight(currentWeight + 10);
    }

    @Override
    public void getInfo() {
        System.out.println("Man!");
        System.out.println("Weight: " + this.getWeight());
    }
}

class Woman extends Human implements IPrintable {
    public Woman(String name, String surname, int age, int weight) {
        super(name, surname, age, weight);
    }

    @Override
    public void relax() {
        // Например, женщины любят бегать во время отдыха
        int currentWeight = this.getWeight();
        this.setWeight(currentWeight - 10);
    }

    @Override
    public void getInfo() {
        System.out.println("Woman!");
        System.out.println("Weight: " + this.getWeight());
    }
}

interface IPrintable {
    void getInfo();
}

interface IKoritsa {
    // Пустой интерфейс для пример множественной имплементации
}

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Alexander", "Koritskiy", 21, 80);
        Woman woman = new Woman("Masha", "Ivanova", 21, 50);

        System.out.println("BEFORE relax");
        man.getInfo();
        woman.getInfo();

        System.out.println();
        System.out.println("RELAX IN PROGRESS..............");
        man.relax();
        woman.relax();
        System.out.println();

        System.out.println("AFTER relax");
        man.getInfo();
        woman.getInfo();
    }
}