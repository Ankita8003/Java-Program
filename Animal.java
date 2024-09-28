package ajp_java;

//Superclass
class Animal {
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}



