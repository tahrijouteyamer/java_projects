// Polymorphism / Inheritance (Method Overriding)
class Animal {
  void sound() {
      System.out.println("Some generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
      System.out.println("Bark!");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
      System.out.println("Meow!");
  }
}

public class Main {
  public static void main(String[] args) {
      Animal myDog = new Dog();
      Animal myCat = new Cat();
    
      myDog.sound();
      myCat.sound();
  }
}
