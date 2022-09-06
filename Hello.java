public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Bye World");
  }
}

class Number {
  public static void main(String[] args) {
    System.out.println(2+2);
    int x = 10;
    int y = 15;
    System.out.println(x + y);
  }
}

class Strings {
  public static void main(String[] args) {
    String name = "John";
    int price = 20;
    char currency = '$';
    System.out.println(name + " payed " + price + currency);

    String firstName = "Bob";
    String lastname = "Stanley";
    System.out.println(firstName + " " + lastname);
  }
}

class Convert {
  public static void main(String[] args) {
    float numb = 67.78452424f;
    System.out.println(numb);
    int numbInt = (int) numb;
    System.out.println(numbInt);
    double doubleNum = (double) numb;
    System.out.println(doubleNum);
  }
}

class StrinPhrases {
  public static void main(String[] args) {
    String charNumber = "Hassan";
    System.out.println(charNumber.length());
    System.out.println(charNumber.toLowerCase());
    System.out.println(charNumber.toUpperCase());
    System.out.println(charNumber.indexOf("s"));

    String sentence = "It's Hassan's car";
    System.out.println(sentence);
  }
}

class Maths {
  public static void main(String[] args) {
    System.out.println("Minimum: " +  Math.min(2,9));
    System.out.println("Maximum: " +  Math.max(2,9));
    System.out.println("Random: " +  Math.random() * 100);
    System.out.println("Floor: " +  Math.floor(3.231));
    System.out.println("Ceil: " +  Math.ceil(3.231));
    System.out.println("Absolute: " + Math.abs(-4.05));
    System.out.println("Square Root: " + Math.sqrt(64));
    System.out.println("Square Root: " + Math.sqrt(64));
  }
}

class ifElse {
  public static void main(String[] args) {
    int x = 20;
    if (x > 35) {
      System.out.println("statement is true");
    }
    else {
      System.out.println("statement is false");
    }

    String result = (x < 35) ? ("statement is true") :  ("statement is false");
    System.out.println(result);
    }
  }

class SwitchLoop {
  public static void main(String[] args) {
    int target = 15;
    switch (target) {
      case 5:
      System.out.println(5);
      break;
      case 10:
      System.out.println(10);
      break;
      case 15:
      System.out.println(15);
      break;
      case 20:
      System.out.println(20);
      break;
    }
  }
}

class WhileLoop{
  public static void main(String[] args) {  // keeps doing the prcoess until the while is not met
    int i = 0;
    while (i <= 15){
      System.out.println(i);
      i++;
    }
  }
}

class ForEachLoop {
  public static void main(String[] args){
    String[] cars={"Ford", "Nissan", "BMW", "Toyota"};
    for (String i : cars){
      System.out.println(i);
  }
  System.out.println(cars[2]);
  System.out.println(cars.length);
  
  }
}

class BreakContinue {
  public static void main(String[] arg){
    for (int i =0; i < 10; i++){
      if (i == 4){
        break;
      }
    }

    for (int i =0; i < 10; i++){
      if (i == 4){
        continue;
      }
    }

    int j = 0;
    while (j < 10){
      System.out.println("Count " + j);

     if(j == 4){
      break;
     }
     j++;
    }

    int n = 0;
    while (n < 10){
      

     if(n == 4){
      n++;
      continue;
     }
     System.out.println("Count " + n);
     n++;
    }

  }
}

 class MultiArray {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11,12,13,14} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println("Your number is: " + myNumbers[i][j]);
      }
    }
  }
}

 class Method {
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  static void secondMethod() {
    System.out.println("Second test!");
  }

  public static void main(String[] args) {
    myMethod();
    secondMethod();
  }
}

 class MethodProps {
  static void myProps(String fname, String lname){
    System.out.println(fname + " " + lname);
  }
  public static void main(String[] args){
    myProps("Hassan" , "Zahra");
  }
}

class NoVoid {
  static int myPropsAdd(int x, int y){
    return x + y;
  }
  public static void main(String[] args){
    System.out.println("The function sum is: " + myPropsAdd(3, 5));
    int z = myPropsAdd(3, 5);
    System.out.println("The total sum is: " + z);
  }
}

class OverLoad {
  static int intAddNumbers(int num1, int num2){
    return num1 + num2;
  }
  static double floataddNumber(double num1, double num2){
    return num1 + num2;
  }
  public static void main(String[] args){
    int integer = intAddNumbers(10, 10);
    double doubleNumber = floataddNumber(20.2235, 20.2125);
    System.out.println("The int sum is: " + integer);
    System.out.println("The float sum is: " + doubleNumber);
  }
}

 class Recursion {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {  // 10 + 9 + 8 +7 + 6 + 5 + ... + 0
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

 class Recursion2 {
  public static void main(String[] args) {
    int result = sum(5, 10);  // 10 + 9 + 8 + 7 + 6 +5 = 45
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}

class NewMain{
  int x = 5;
  String[] y = {
      "Ford",
      "Nissan",
      "Ferrari",
  };

  public void funct(String test){
    System.out.println("Test Function " + test);
  }

  public static void main(String[] arg){
    NewMain myObj1 = new NewMain();
    System.out.println(myObj1.x);
    System.out.println(myObj1.y[0] + ' ' + myObj1.y[1]);
    myObj1.funct("Hassaan");
    NewMain myObj2 = new NewMain();
    myObj2.x = 10;
    System.out.println(myObj2.x);
  }
}

 class Constructor {
  int modelYear;
  String modelName;

  public Constructor(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Constructor myCar = new Constructor(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}


class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}


class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class AnimalVoices {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

