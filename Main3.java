package animal;
abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();

    public abstract void eat();
}interface Pet {
    String getName();

    void setName(String name);

    void play();
}class Spider extends Animal {

    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("Spider eats insects");
    }

    public void walk() {
        System.out.println("Spider walks");
    }
}class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public void walk() {
        System.out.println(name + " walks");
    }

    public void eat() {
        System.out.println(name + " eats");
    }
}class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public void walk() {
        System.out.println("Fish cannot walk");
    }

    public void eat() {
        System.out.println(name + " eats");
    }
}


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   

		        Spider spider = new Spider();

		        Cat cat = new Cat("Kitty");

		        Fish fish = new Fish();
		        fish.setName("Nemo");

		        System.out.println("Spider:");
		        spider.eat();
		        spider.walk();

		        System.out.println("\nCat:");
		        System.out.println("Name: " + cat.getName());
		        cat.eat();
		        cat.walk();
		        cat.play();

		        System.out.println("\nFish:");
		        System.out.println("Name: " + fish.getName());
		        fish.eat();
		        fish.walk();
		        fish.play();
		    }
		}


		



