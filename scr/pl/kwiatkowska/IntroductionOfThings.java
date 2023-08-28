class LivingBeing {
    public String name;
    public int age;

    public LivingBeing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("I am " + name + " and I am " + age + " years old.");
    }
}

class Animal extends LivingBeing {
    public Animal(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void feedMilk() {
        System.out.println(name + " feeds its babies with milk.");
    }
}

class Human extends Mammal {
    public Human(String name, int age) {
        super(name, age);
    }

    public void speech() {
        System.out.println(name + " can communicate by speech.");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + " flies in the sky.");
    }
}

class NonLivingThing {
    protected String name;

    public NonLivingThing(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " is a non-living thing.");
    }
}

class Thing extends NonLivingThing {
    public Thing(String name) {
        super(name);
    }
}

public class IntroductionOfThings {
    public static void main(String[] args) {
        Mammal cat = new Mammal("Cat", 3);
        Human Mary = new Human ("Mary", 28);
        Bird sparrow = new Bird("Sparrow", 1);
        Thing book = new Thing("Book");

        cat.makeSound();
        cat.introduce();
        cat.feedMilk();

        Mary.makeSound();
        Mary.introduce();
        Mary.feedMilk();
        Mary.speech();

        sparrow.makeSound();
        sparrow.introduce();
        sparrow.fly();

        book.describe();
    }
}
