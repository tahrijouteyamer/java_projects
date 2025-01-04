class Car {
    String brand;
    String color;
    int year;
  
  public void drive() {
    System.out.println(brand + " is driving");
    }
    
  public void stop() {
    System.out.println(brand + " is stopping");
    }
  }
  
  public class Main {
    public static void main (String[] args) {
      Car myCar = new Car();
      myCar.brand = "Volkswagen";
      myCar.color = "Black";
      myCar.year = 2022;
      System.out.println("Brand:" + myCar.brand);
      System.out.println("Color: " + myCar.color);
      System.out.println("Year: " + myCar.year);
      
      myCar.drive();
      myCar.stop();
    }
  }