//class Computer
//{
 // public void  playMusic()//not expecting in return
   // {
//System.out.println("music playing");  
  //}
    //public  String getmepen(int cost){ //do something
      //if(cost>=10)
        //return "Pen";
        //else
        //return "Nothing";
    //}
//}
//public class Demo
//{
  //  public static void main(String a[])
    //{
      //  Computer obj = new Computer();
        ////obj of a computer
        //obj.playMusic();
        //String str = obj.getmepen(12);
        //System.out.println(str);

    //}}
  //  ..............................

  
  //method over loading
  //class Calculator
//{
  //public int add(int n1,int n2,int n3)//local variable
//return n1 + n2 + n3;  
//}
  //  public int add(int n1,int n2)
    //{
//return n1 + n2;  
//}
//public double add(double n1,int n2)//parameter does not matter only name and the type matter
  //  {
//return n1 + n2;  
//}
 //}


//public class Demo
//{
  //  public static void main(String a[])
    //{
      //  Calculator obj = new Calculator();
        //int r1 = obj.add(3,4,9);
        //System.out.println(r1);

    //}}

    //...............................................
    
    
    //heap memory
   // class Calculator
//{
  //int num=5;

 //public int add(int n1,int n2){
  //        

//return n1 + n2 ; 
//}}
//public class Demo
//{
    //public static void main(String a[])
    //{
     // int data =10;
     // Calculator obj = new Calculator();
      // Calculator obj1 = new Calculator();//new obj
       // int r1 = obj.add(3,4);
       // obj.num=8;
           //     System.out.println(obj.num);
                        //System.out.println(obj1.num);
//}}
//output:8
//5
//...................................
//one dimentional array
//public class Demo
//{
  //  public static void main(String a[])
    //{
      //int nums[]=new int[4];
      //nums[0]=6;
      //nums[1]=8;
      //nums[2]=0;
      //nums[3]=7;
      //for(int i=0;i<4;i++){
        //System.out.println(nums[1]);

      //}
    //}}
    //...............................

    //multi dimentional array
    //public class Demo
//{
  //  public static void main(String a[])
  ///{
    //int nums[][]=new int[3][4];//6jagged
    //for(int i=0;i<3;i++)
    //{

  //for(int j=0;j<3;j++)
  //{
    //nums[i][j]=(int)(Math.random()*10); 
 //}
//}
//for(int i=0;i<3;i++)
//{
  //for(int j=0;j<3;j++)
//{
  //System.out.println(nums[i][j]+"");
//}
//System.out.println();
//}
//for(int n[]:nums){
  //for(int m:n){
    //System.out.println(m+"");

  //}
  //System.out.println();
//}
  //}
//}
//..........................................
/*public class Demo {
    
  public static void main(String a[]){
  StringBuffer sb = new StringBuffer("Anu");
  System.out.println(sb.length());

}}/* */
//................................................
/*class Mobile{
  String brand;
  int price;
 static String name;

public Mobile(){
  brand =" ";
  price = 200;
  System.out.println("in constructor");
}

static{
  System.out.println("in static block");
}

public void show()
{
  System.out.println(brand+":"+price+":"+name);
}}
public class Demo {
    
  public static void main(String a[]){
    Mobile obj1 = new Mobile ();
    obj1.brand ="Apple";
    obj1.price=1234;
    Mobile.name="smartphone";

    Mobile obj2 = new Mobile ();
    obj2.brand ="realme";
    obj2.price=4534;
    Mobile.name="smartphone";

    obj1.name="phone";
    obj1.show();
    obj2.show();
  }}/* */
//....................................


//encapsulation

/*class Human{
private int age;//instance variable
private String name;
//constructor
public Human(){//default constructor 
  //System.out.println("in constructor");//same name as class name-:constuctor
  age=18;
  name="anu";
}
public Human(int age,String n){   // paramrterized constructor: which takes a value
this.age =age;
name=n;
}
public int  getAge()
{
  return  age;
}
public void setAge(int age){//local variable     (int a){age=a;}
this.age=age;
}
public String getName()
{
  return  name;
}

public void setName(String name,Human obj){
  Human obj1 = obj;

  obj1.name = name;
  }
}

   public class Demo {
    
  public static void main(String a[]){
Human obj = new  Human();
Human obj1 = new  Human(19,"janu");
//obj.setAge(30);
//obj.setName ("Anushree",obj);
System.out.println(obj.getName()+":"+obj.getAge());
System.out.println(obj1.getName()+":"+obj1.getAge());

  }}/* */

/*class A extends Object
 {
  public A()
  {
    super();
    System.out.println("IN A");
}
public A(int n){
  super();
    System.out.println("IN A int");}
 }
class B extends A{//sub class


public B(){
  super(5);
  System.out.println("IN B");
}
public B(int n){
  this();
  System.out.println("in B int ");
}
}
  public class Demo {
    
  public static void main(String a[]){
  
  B obj = new B(5);

  }
}/* */

//..................................................................
// camel casing
//class and interface-Cals,Runable
//variable and method-marks,show()
// constants -PIE ,BRAND
//constructor- Human()
// showMyMarks()
//MyData



//...........................
/*class A
 {
  public A()
  {
    
    System.out.println("obj created");
}
public void show(){
  System.out.println("in A show");
}
}
public class Demo {
    
  public static void main(String a[]){
  int marks;
  marks=99;
  //A obj = new A();
  //obj.show();
  new A().show();      // anonymous obj:- don't have a name
}}/* */
//...................................................


//Inheritance:is ,has
//parent- child
//super  -sub
//base  - de/**

/*class Calculator {
  // Base class with some potential common methods
}

class AdvCalc extends Calculator {
  public int add(int n1, int n2) {
      return n1 + n2;
  }

  public int sub(int n1, int n2) {
      return n1 - n2;
  }
}
class VeryAdvCalc extends AdvCalc {
  public double power(double base, double exponent) {
      return Math.pow(base, exponent);  // Using built-in power function
  }
}
public class Demo {
    
  public static void main(String a[]){
    VeryAdvCalc obj = new VeryAdvCalc();  // Correct class name
    int r1 = obj.add(4, 5);
    int r2 = obj.sub(4, 5);
    double r5 = obj.power(5, 7);
    System.out.println(r1 + " : " + r2 + " : " + r5);
}
}




//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
// Parent class (SuperClass)
/*class Animal {
  // Common method for all animals
  public void eat() {
      System.out.println("This animal eats food.");
  }
}

// Child class (SubClass) inheriting from Animal
class Dog extends Animal {
  // Dog class has its own specific method
  public void bark() {
      System.out.println("The dog barks.");
  }
}

// Another SubClass inheriting from Animal
class Cat extends Animal {
  // Cat class has its own specific method
  public void meow() {
      System.out.println("The cat meows.");
  }
}

public class Demo {
  public static void main(String[] args) {
      // Creating an instance of Dog
      Dog myDog = new Dog();
      myDog.eat();  // Inherited method from Animal
      myDog.bark(); // Dog-specific method

      // Creating an instance of Cat
      Cat myCat = new Cat();
      myCat.eat();  // Inherited method from Animal
      myCat.meow(); // Cat-specific method
  }
}
/* */

/*class A{
public void show(){
  System.out.println("in A show");
}
public void config(){
  System.out.println("in A config");
}
}
class B extends A{
  public void show1(){
    System.out.println("in B show");
  }
}
public class Demo {
  public static void main(String[] args) {
    B obj = new B();
    obj.show();
    obj.config();
  }}/* */
//java does not support muliple inheritance

/*package tools;
import tools.AdvCalc;
import tools.Calculator;
import tools.AdvCalc;
import java.util.ArrayList;
import tools.*;
//                    private   protected     public          default
//class                     y      y           y            y
// same pack sub claa        n      y          y              y
//same pac non subcall       n      y        y              y
//diff pack subclass         n      y        y               n
//diff pak non sub claass    n       n      y              n

public class Demo {
  public static void main(String[] args) {
    A obj = new A();
System.out.println(obj.marks);
    }}/* */


    ///::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    //polymorphism    poly :many morphism: behaviour
    // compile time:behaviour(overloading)     run time:(overriding)
/*class A{
  public void show(){
    System.out.println("in a show");

  }
}
class B extends A {

}
public class Demo {
  public static void main(String[] args) {
A obj = new B();
obj.show();
  }}/* */

  //7:10/