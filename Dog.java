
public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(String name, Breed breed) {
        this(name, 0, breed);
    }

    public Dog() {
        this("", 0, Breed.MIXED);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", 3, Breed.BEAGLE);
        Dog spot = new Dog("Spot", 5,Breed.DALMATIAN);
        Dog wolf = new Dog("Wolf",2, Breed.GERMAN_SHEPHERD);

        snoopy.bark();
        spot.eat();
        wolf.sleep();

        System.out.println("Name: " + snoopy.getName());
        System.out.println("Age: " + snoopy.getAge());
        System.out.println("Breed: " + snoopy.getBreed());
        System.out.println("Name: " + spot.getName());
        System.out.println("Age: " + spot.getAge());
        System.out.println("Breed: " + spot.getBreed());
        System.out.println("Name: " + wolf.getName());
        System.out.println("Age: " + wolf.getAge());
        System.out.println("Breed: " + wolf.getBreed());
    }
}
