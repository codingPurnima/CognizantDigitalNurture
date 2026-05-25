class Animal {
    void makeSound(){
        System.out.println("Sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
    public static void main(String[] args) {
        Animal animal= new Animal();
        Dog dog= new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}

