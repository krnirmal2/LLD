package org.example.DESIGN_PATTERN.CREATIONAL_DP.SINGLETON;

import org.example.DESIGN_PATTERN.CREATIONAL_DP.SINGLETON.SingleTon;
import org.example.Main;

public class SingleTonClientMethod {

/*
    // version 1
    public static void main(String[] args) {
        // so we can create as many as object using default constructors
        SingleTon default1 = new SingleTon();
        SingleTon default2 = new SingleTon();

    }*/

  /*
   // v2
   public static void main(String[] args) {
        // the private constructor can not be call from the other file ==> we can't create constructor
        //'SingleTon()' has private access in 'org.example.DESIGN_PATTERN.CREATIONAL_DP.SINGLETON.SingleTon'
        SingleTon v2 = new SingleTon();

    }
*/


 /*
  // v3
    public static void main(String[] args) {
        // the private constructor can not be call from the other file ==> we can't create constructor
//        'SingleTon()' has private access in 'org.example.DESIGN_PATTERN.CREATIONAL_DP.SINGLETON.SingleTon'
        SingleTon inst = new SingleTon();
        inst.getInstance();
    }
*/


/*
    // v4
    public static void main(String[] args) {
        // the private constructor can not be call from the other file ==> we can't create constructor
        // so here obj1 and obj2 both refer to same memory address  so if we change in onec
        // then both the objects value will change , which we don't want
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 =SingleTon.getInstance();
    }

 */


/*
    // v5
    public static void main(String[] args) {
        // using publlic getInstance method we get the address of inst
        // so here we are able to create multiple object hence the Singleton is failed
        // as both the reference will fetch the class variable
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
    }

*/

/*
    // v6
    public static void main(String[] args) {
        // using publlic getInstance method we get the address of inst
        // we are able to create one refrence for both the object hence no new object create
        // as the second time the instance is already point to the class address using object
        // and second object not newly created in the heap and hence
        //so this first singleton object we get for single thread  but  multithread can create  multiple object haveing
        // different refrence or address.
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
    }

 */

    // v7
    public static void main(String[] args) {
        // using publlic getInstance method we get the address of inst
        // we are able to create one refrence for both the object hence no new object create
        // as the second time the instance is already point to the class address using object
        // and second object not newly created in the heap and hence
        //so this first singleton object we get for single thread  but  multithread can create  multiple object haveing
        // different refrence or address.
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();


        Main.Tread1 tone = new Main.Tread1();
//        create two thread
        Thread t1 = new Thread((Runnable) tone);


            Main.Thread2 tTwo = new Main.Thread2();
//        create two thread
        Thread t2 = new Thread((Runnable) tone);


    }




}
