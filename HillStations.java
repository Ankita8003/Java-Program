package ajp_java;

//Superclass
class HillStations {
 // Method to be overridden
 void location() {
     System.out.println("The hill station's location is not specified.");
 }

 void famousFor() {
     System.out.println("The hill station is famous for something.");
 }
}

//Subclass Manali
class Manali extends HillStations {
 @Override
 void location() {
     System.out.println("Manali is located in Himachal Pradesh.");
 }

 @Override
 void famousFor() {
     System.out.println("Manali is famous for adventure sports.");
 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations {
 @Override
 void location() {
     System.out.println("Mussoorie is located in Uttarakhand.");
 }

 @Override
 void famousFor() {
     System.out.println("Mussoorie is famous for its scenic beauty.");
 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations {
 @Override
 void location() {
     System.out.println("Gulmarg is located in Jammu and Kashmir.");
 }

 @Override
 void famousFor() {
     System.out.println("Gulmarg is famous for skiing.");
 }
 
}

