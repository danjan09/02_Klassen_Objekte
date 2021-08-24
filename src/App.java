public class App {
    
    public static void main(String[] args) {

      Cat cat = new Cat();
      // System.out.println(cat);

      // output(cat.toString());

      output("Blick von aussen: " + cat);
      cat.tellYourAddress();             // Beide Varianten referenzieren das gleiche, haben den selben wert: Cat@6d.. 
  //                                         ob von außen des Objekts oder von innen(Cat.java).
                                      
                          
    }


    public static void output(String outputStr) {
      System.out.println(outputStr);  
    }


}
