
/* erster Schritt */

// public class App {
    
//     public static void main(String[] args) {

//       Cat cat = new Cat();
//       // System.out.println(cat);

//       // output(cat.toString());

//       output("Blick von aussen: " + cat);   // Referenzin
//       cat.tellYourAddress();             // Beide Varianten referenzieren das gleiche, haben den selben wert: Cat@6d.. 
//   //                                         ob von außen des Objekts oder von innen(Cat.java).
                                      
                          
//     }


//     public static void output(String outputStr) {
//       System.out.println(outputStr);  
//     }

// }



/* zweiter Schritt */

// Die schönere Variante:


// public class App {
    
//   public static void main(String[] args) {

//     Cat cat = new Cat();


//     output("Blick von aussen: " + cat);  
//     output("Blick von innen: " + cat.tellYourAddress());                                    
//   }


//   public static void output(String outputStr) {
//     System.out.println(outputStr);  
//   }

// }



/* dritter Schritt*/

// public class App {
    
//   public static void main(String[] args) {

//     Cat cat1 = new Cat();


//     output("Blick von aussen: " + cat1);  
//     output("Blick von innen: " + cat1.tellYourAddress());                                    
  
//     output("-----------------");

//     Cat cat2 = new Cat();
//     output("Blick von aussen: " + cat2);  
//     output("Blick von innen: " + cat2.tellYourAddress());     
//   }

  // public static void output(String outputStr) {
  //   System.out.println(outputStr);  
  // }

// }



/* vierter Schritt */

// public class App {
    
//   public static void main(String[] args) {

//     Cat cat1 = new Cat();
//     // cat1.name = "Grizabella";

//     cat1.changeYourName("Grizabella");
//     output("RAM-Adresse: " + cat1.tellYourAddress());
//     output("Name: " + cat1.tellYourName());

 
//   output("--------------");
    
//   Cat cat2 = new Cat();
//   // cat2.name = "Alonzo";

//   cat2.changeYourName("Alonzo");
//   output("RAM-Adresse: " + cat2.tellYourAddress());
//   output("Name: " + cat2.tellYourName());
//   // output(cat2.name);

//   }
  
  
//   public static void output(String outputStr) {
//     System.out.println(outputStr);  
//   }

// }



/* fünfter Schritt */
/* Variante Eins */

// public class App {
    
//   public static void main(String[] args) {
      
//     Cat cat1  = new Cat("Grizabella", "white", 29);

//     output("RAM-Adresse: " + cat1.tellYourAddress());
//     output("Name: " + cat1.tellYourName());
//     output("Fellfarbe: " + cat1.tellYourFurColor());
//     output("Alter: " + cat1.tellYourAge());

  
//     output("--------------------");

//     Cat cat2  = new Cat("Alonzo", "grey", 35);

//     output("RAM-Adresse: " + cat2.tellYourAddress());
//     output("Name: " + cat2.tellYourName());
//     output("Fellfarbe: " + cat2.tellYourFurColor());
//     output("Alter: " + cat2.tellYourAge()); 

//   }

//   public static void output(String outputStr) {
//     System.out.println(outputStr);  
//   }


// }




/* fünfter Schritt */
/* Variante Zwei */

// public class App {
    
//   public static void main(String[] args) {
      
//     Cat cat1  = new Cat("Grizabella", "white", 29);

//     output("RAM-Adresse: " + cat1.tellYourAddress());
//     output("Name: " + cat1.tellYourName());
//     output("Fellfarbe: " + cat1.tellYourFurColor());
    
//     output("Alter: " + cat1.tellYourAge());

//     output("--------------------");

//     // output(2); // geht nicht weil typ konvertiert werden muss! Außer man gibt unten einen static output mit int an.
//     output("Wert: " + 12); // int ist hier unfreiwillig auch vegetarier geworden
//     output(String.valueOf(11));
//     output(Integer.toString(4));

  
    

//   }

//   public static void output(String outputStr) {
//     System.out.println(outputStr);  
//   }

//   // public static void output(int outputInt) {     // Damit man oben einfach int eingeben kann.
//   //   System.out.println(outputInt);  
//   // }

// }


/* sechster Schritt */


public class App {
    
  public static void main(String[] args) {
      
    Cat cat1  = new Cat("Grizabella", "white", 29);

 

    cat1.setName("Grizabella, why didn't your mom call you Bella?");

    output("RAM-Adresse: " + cat1.tellYourAddress());
    output("Name: " + cat1.getName());
    output("Fellfarbe: " + cat1.getFurColor());
    output("Alter: " + cat1.getAge());

    output("--------------------");

    
    

  }

  public static void output(String outputStr) {
    System.out.println(outputStr);  
  }

}