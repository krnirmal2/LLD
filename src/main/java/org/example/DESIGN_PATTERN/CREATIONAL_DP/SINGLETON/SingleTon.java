package org.example.DESIGN_PATTERN.CREATIONAL_DP.SINGLETON;

public class SingleTon {
  /*
    // version 1
    int a;
    public static void main(String[] args) {
        // so we can create as many as object using default constructors
        SingleTon default1 = new SingleTon();
        SingleTon default2 = new SingleTon();

    }*/

   /* version 2
    int a;
    private SingleTon(){}

 */

/*

//    version 3
    int a;
    private SingleTon(){}
    // create a public method to call or use private constructor
    public SingleTon getInstance(){
        SingleTon inst  = new SingleTon();
        return  inst;
    }

*/

/*
    // Use Static function for call using class name
    //    version 4
    int a;

    private SingleTon() {
    }

    // create a public method to call or use private constructor
    public static SingleTon getInstance() {
        SingleTon inst = new SingleTon();
        return inst;

    }

 */


/*

    //    version 5
    int a;

    private SingleTon() {
    }

    // solution of v4 use private data member
    private static SingleTon inst;

    // create a public method to call or use private constructor
    public static SingleTon getInstance() {
        inst = new SingleTon();
        return inst;

    }
*/

/*

// v6
    int a;

    private SingleTon() {
    }

    // solution of v4 use private data member
    private static SingleTon inst;

    // create a public method to call or use private constructor
    public static SingleTon getInstance() {
        if(inst == null) {
            inst = new SingleTon();
        }
        return inst;

    }

*/


    // v7
    int a;

    private SingleTon() {
    }

    // solution of v4 use private data member
    private static SingleTon inst;

    // create a public method to call or use private constructor
    public static synchronized SingleTon getInstance() {
        if(inst == null) {
            inst = new SingleTon();
        }
        return inst;

    }


}