package ajp_java;

//Main class
public class Main1 {
public static void main(String[] args) {
   // Creating references of the superclass pointing to subclass objects
   HillStations hillstation; 

   // Using the superclass reference to invoke the overridden methods at runtime
   hillstation = new Manali();
   System.out.println("Calling methods using the HillStations reference (Parent class):");
   hillstation.location();
   hillstation.famousFor();

   hillstation = new Mussoorie();
   hillstation.location();
   hillstation.famousFor();

   hillstation = new Gulmarg();
   hillstation.location();
   hillstation.famousFor();

   // Calling methods using subclass objects directly
   System.out.println("\nCalling methods using subclass objects directly:");
   Manali manali = new Manali();
   Mussoorie mussoorie = new Mussoorie();
   Gulmarg gulmarg = new Gulmarg();

   manali.location();
   manali.famousFor();

   mussoorie.location();
   mussoorie.famousFor();

   gulmarg.location();
   gulmarg.famousFor();
}
}
