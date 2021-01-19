package myPackage;

public class Animal {
    class Dog{
        private void hello() {
            System.out.println("Xin chao");
        }
    }

    public class Husky extends Dog{

    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal.Dog dog = animal.new Dog(); // tao doi tuong moi qua bien tham chieu;
    }
}
// chi ke thua trong cung 1 class;

// class khac van truy xuat duoc nhung ko ke thua duoc neu khai bao public bien instance class;
