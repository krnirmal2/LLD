package org.example.SOLID_PRINCIPLE.SINGLE_RESPONSIBILITY_PRINCIPLE;

public class BirdVersionZero {

    // Desin a bird
    // version 1

     String birdType ;
     String color;
     double weight;

    public BirdVersionZero(String birdType, String color, double weight) {
        this.birdType = birdType;
        this.color = color;
        this.weight = weight;
    }

         // characteristics
     private void fly(){};
     private void makeSound(){
         if(birdType.equals("sparrow")){
             System.out.println("chi chi");
         }if(birdType.equals("pigeon")){
             System.out.println("gutur gu");
         }if(birdType.equals("crow")){
             System.out.println("kaw kaw");
         }
     };
     private void eat(){};

    public static void main(String[] args) {
        BirdVersionZero b1 = new BirdVersionZero("sparrow", "grey",0.1);
        b1.makeSound();
        b1.fly();
        b1.eat();
    }



    /*
    * problem with above solution or desing
    *
    * NOT MAINTAIN THE SINGLE RESPOINSIBLITY AS NOT WORK HERE DIFFERENT METHOD
    * Readability -- lot of if else
    * Testable -- due to lot of if else write multiple
    * Parrel development -- lot of issue for changing in a same code by different coder
    *
    *
    * */
}
