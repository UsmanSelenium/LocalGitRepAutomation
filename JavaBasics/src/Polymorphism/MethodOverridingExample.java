package Polymorphism;

class Parent {
    void show() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    // Overriding the show() method
    @Override
    void show() {
        System.out.println("Hello from Child class");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Child obj = new Child(); // Creating object of Child class
        obj.show(); // Calls the overridden method in Child class
    }
}

