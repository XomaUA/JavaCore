package com.company;
interface Animal{
    void voice();
    void feed();
}
class Cat implements Animal {
    public void voice() {
        System.out.println("The cat says 'Meow meow' ");
    }

    public void feed(){
        System.out.println("The cat eats mice");
    }
}
class Dog implements Animal {
    public void voice() {
        System.out.println("The dog says 'Gav gav' ");
    }

    public void feed(){
        System.out.println("The dog eats cats");
    }
}
public class Main {

    public static void main(String[] args) {
        Animal[] arr = new Animal[5];
        arr[0] =new Cat();
        arr[1] =new Cat();
        arr[2] =new Dog();
        arr[3] =new Dog();
        arr[4] =new Dog();
        arr[0].feed();
        arr[0].voice();
        arr[4].feed();
        arr[4].voice();
        arr[2].feed();
        arr[2].voice();
        arr[3].feed();
        arr[3].voice();
        arr[1].feed();
        arr[1].voice();






    }
}
