package ajp_java;

//Main class
public class Main {
public static void main(String[] args) {
   // Creating objects of each class
   Animal myAnimal = new Animal(); 
   Animal myDog = new Dog();       
   Animal myCat = new Cat();       

   // Display the sound of each animal
   myAnimal.makeSound();
   myDog.makeSound();    
   myCat.makeSound();    
}
}