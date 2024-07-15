package COM.HLCODING.OOPS.Constructor;

//import COM.HLCODING.OOPS.Inheritance.*;
//never use * to import a package it will generate error at the time of same class in different package class

//so we will use package.classname
import COM.HLCODING.OOPS.Inheritance.TEST1; //this is called internal package
//this is good practice

import COM.HLCODING.OOPS.Encapsulation.Demo1;

//supose 2 package have 2 same name classes

import COM.HLCODING.OOPS.Encapsulation.Main;
//import COM.HLCODING.OOPS.Inheritance.Main;
//error because two package have two name same class


//to resolve it we create an temporary  package object

public class CheckPackageAvailability {
    Demo1 d1 = new Demo1("123"); // we can acces it using import package
    TEST1 t1= new TEST1(); // we can also acces it using import package

    //Two ways to access same class name in diff packages
    Main m1 = new Main();  //first way
    COM.HLCODING.OOPS.Inheritance.Main m2 = new COM.HLCODING.OOPS.Inheritance.Main();//second way
// this is called inline package
// this two way two create  and acces same class name with diff package
}
