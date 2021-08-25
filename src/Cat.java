/* erster Schritt */

// public class Cat {
    

//     void tellYourAddress(){
//         System.out.println("Blick von innen: " + this);
//     }
// }



/* zweiter Schritt */

// public class Cat {
    

//     Cat tellYourAddress(){
//         return this;
//     }
// }



/* dritter Schritt */

// public class Cat {
    
// Cat tellYourAddress(){
//     return this;
//     }
//  }



 /* vierter Schritt */

// public class Cat {
    
//     // Attribut | Field | Property
//     public String name = "nobody";
 
//     public Cat tellYourAddress(){
//         return this;
//     }

//     public String tellYourName(){
//         return this.name;
//     }

//     public void changeYourName(String name){
//         this.name = name;
//     }

// }



/** fünfter Schritt**/


// public class Cat {
    
//     public String name;
//     public String furColor;
//     public int age;
  

     
//     public Cat(String name, String furColor, int age) {
//         this.name = name;
//         this.furColor = furColor;
//         this.age = age;
//     }               


//     public Cat tellYourAddress(){
//         return this;
//     }

//     public String tellYourName(){
//         return this.name;
//     }
//     public void changeYourName(String name){
//         this.name = name;
//     }

//     public String tellYourFurColor(){
//         return this.furColor;
//     }
//     public void changeYourFurColor(String furColor){
//         this.furColor = furColor;
//     }

//     // public String tellYourAge(){            // Variante Eins
//     //     return String.valueOf(age); 
//     // }

//     public int tellYourAge(){            // Variante Zwei
//         return this.age; 
//     }

// }


/** sechster Schritt**/


public class Cat {
    
    public String name;
    public String furColor;
    public int age;
  

     
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }                // Kann man auch durch "source action" ausführen lassen.
//                      Rechtsklick: "source action -> Generate Constructors"             
    


    public Cat tellYourAddress(){
        return this;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getFurColor() {
        return furColor;
    }
   

    public int getAge() {
        return age;
    }                   // Kann man auch durch "source action" ausführen lassen.
    //                     Rechtsklick: "source action -> Generate getters and setter"             
        



    
}
