
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
//...............................................................................


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
}/* */




//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
/*// Parent class (SuperClass)
class Animal {
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
      System.out.println("in A show");
  
    }
  }
  class B extends A {
  public void show(){
    System.out.println("in C show");
  }}
  class C extends A {
    public void show(){
      System.out.println("in B show");
    }
    
  }
  public class Demo {
    public static void main(String[] args) {
  A obj = new A();
  obj.show();
obj= new B();
  obj.show();
  obj= new C();
  obj.show();
    }}//DYNAMIC METHOD (run time)/* */
  //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''



    // final-variable,method,class
 /*class Calc{
    public  void show(){
System.out.println("in Calc show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
   }
   class AdClac extends Calc{
    public void show(){
        System.out.println("BY Anu");
            }
            
   }
    public class Demo {
        public static void main(String[] args) {
           
            Calc obj1= new Calc();
            obj1.show();
            System.out.println("hi");}}
/* */

//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
            //obj class
           /*  class Laptop{
String model;
 int price;

 public String toString(){
  return model+":"+price;
 }
 public boolean equals(Laptop that){
    return this.model.equals(that.model)&&this.price == that.price;
  
 
 }
            }
            public class Demo {
              public static void main(String[] args) {
Laptop obj1= new Laptop();
obj1.model="HP";
obj1.price=1000;

Laptop obj2= new Laptop();
obj2.model="lanavo";
obj2.price=1080;
boolean result= obj1.equals(obj2);

System.out.println(obj1.toString());

              }}/* */
//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
/* 
              public class Demo {
                public static void main(String[] args) {
                  double d =4.3;
                  int i=(int)d;
                  System.out.println(i);}}/* */
//"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
               /*    class A{
                    public void show1(){
System.out.println("in A show");
                    }}
                    class B extends A{
                      public void show2(){
System.out.println("in B show");
                      }
                    }
                  
                  public class Demo {
                    public static void main(String[] args) {
A obj= new B();
obj.show1();
B obj1= (B) obj;
obj1.show2();}}/* */


                    
                    //.......................................................................................

              /*      abstract class Car{
                    public abstract void drive();
                    public abstract void fly();
                    
                    
                    public void playMusic()
                    {
                      System.out.println("play music");
                                          }
                  }

                 abstract class Magonr extends Car{
                    public void drive(){
                    
                      System.out.println("Driving..........");
                                          }
                   
                  }

                  class UpdatedMagonr extends Magonr{
                    public void fly(){
                    
                      System.out.println("flying..........");
                                          }
                  }
                    public class Demo {
                      public static void main(String[] args) {
                        Car obj=new UpdatedMagonr();
                        obj.drive();
                        obj.playMusic();
                        obj.fly();
                      }}

                      /* */
//..........................................................................................................
                      ///inner class
/*class A{
  int age;
  public void show(){

  }
  static class B{
    public void config(){
      System.out.println("IN A show");
    }
  }
}
                      public class Demo {
                        public static void main(String[] args) {
                          A obj= new A();
                          obj.show();
                      A.B obj1= new A.B();
                      obj1.config();    
                        }}/* */

                        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
                        //Anonymous inner class
                       /*  class A {
                          public void show() {
                              System.out.println("IN A show");
                          }
                      }
                      
                      public class Demo {
                          public static void main(String[] args) {
                              A obj = new A() {
                                  
                                  public void show() {
                                      System.out.println("IN new show");
                                  }/////////////inner class
                              };
                              obj.show();
                          }
                      }
                      /* */

//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                     // /Anonymous inner class in an abstract
                     /*  abstract class A{
                        
                        public abstract void show();
                        public abstract void config();

                        }

                        
                      public class Demo {
                        public static void main(String[] args) {


                          A obj= new A(){
                            public void show() {
                              System.out.println("IN new show");
                          }

                            @Override
                            public void config() {
                             
                              System.out.println("in config");
                            }
                          };
                          
                          obj.show();
obj.config();

                        }}/* */


                        //''''''''''''''''''''''''''''''''''''''''''''''''''''''
                     /*    interface A{
                          int age = 45;
                          String area= "Haveri";
                          void show();
                          void config();
                          void run();
                        }
                        
            // *  CLass -class->extends
             //* class- interface->implements
             //* interface -interface->extends
                         
                         interface  X {
                        void run();
                          
                        }
                        interface Y extends X{

                        }
                        class B implements A,Y{

                          @Override
                          public void show() {
                          
                            System.out.println("show");
                          }

                          @Override
                          public void config() {
                           
                           System.out.println("config");
                          }
                          public void run() {
                           
                            System.out.println("run");
                           }}
                        public class Demo {
                          public static void main(String[] args) {
A obj= new B();

obj.show();
obj.config();
obj.run();
System.out.println(A.area);
                          }}/* */
  //...........................................................................

//need of interface
/*abstract class computer{
  public abstract void code();
  
}
class laptop extends computer{
  public void code(){
    System.out.println("code,complie,run");
  }
}
class destop extends computer{
  public void code(){
    System.out.println("code,complie,run:faster");
  }
}
class Developer{
public void devApp(computer lap){
 lap.code();
}}

public class Demo {
  public static void main(String[] args) {
computer lap=new laptop();
computer desk = new destop();
Developer navin = new Developer();
navin.devApp(lap);

  }}/* */
////''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


  ///enum enumeration
 /*  enum Status {
    Running,failed,pending,success;
  }
  
  
  public class Demo {
    public static void main(String[] args) {
      int i=5;
      //Status s=Status.Running;
      Status[] ss=Status.values();
      //System.out.println(s.ordinal());
      for(Status s:ss)
{
  System.out.println(s+":"+s.ordinal());
}    }}/* */
///''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
//if else

/*enum Status {
  Running,failed,pending,success;
}


public class Demo {
  public static void main(String[] args) {
    Status s = Status.success;
  if(s==Status.Running)
System.out.println("all good");
else if(s==Status.failed)
System.out.println("try again");
else
System.out.println("done");   }}/* */


//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
/*enum Status {
  Running,failed,pending,success;
}


public class Demo {
  public static void main(String[] args) {
    Status s = Status.success;

    System.out.println(s.getClass().getSuperclass());
    switch (s) {
      case Running:
      System.out.println("all good");
      break;
      case failed:
      System.out.println("try again");
break;
default:
System.out.println("done");  
break; }}
    
    }/* */

    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    /**
     * InnerDemo
     */
   /*  enum Laptop {
      Mackbook(233), XPS(65677), Surface(76887), Thinkpad(7377);
  
      private int price;
  
      // Constructor to set the price for each laptop model.
      private Laptop(int price) {
          this.price = price;
      }
  
      // Getter method for price.
      public int getPrice() {
          return price;
      }
  }
  
  public class Demo {
      public static void main(String[] args) {
          // Accessing a specific laptop model and printing its price.
         // //Laptop lap = Laptop.Mackbook;
          ///System.out.println(lap + ": " + lap.getPrice());
          for(Laptop lap :Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
          }
      }
  }/* */
  

///''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


  
 /*  class A {
    public void showTheDatawhichBelongsToThisclass() {
        System.out.println("IN A show");}}
           
       class  B extends A {
        //@override:compile
public void showTheDatawhichBelongsToThisclass(){
  System.out.println("in B show");
}        
          
        }
  public class Demo {
  
    public static void main(String[] args) {
      B obj= new B();
      obj.showTheDatawhichBelongsToThisclass();
    }
  }/* */
 ///////////////////''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 /*  interface A {
    void show(int i);
}

public class Demo {
    public static void main(String[] args) {
      //  A obj = new A() {
           // public void show(int i) {
           //     System.out.println("in show: " + i);
          //  }
       // };

        //obj.show(5);  // Correctly calling show() with an integer argument

        A obj = i ->System.out.println("in show:"+i);
        obj.show(5);
    }
} /* */

//'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

/*interface A {
  int add(int i,int j);
}

public class Demo {
  public static void main(String[] args) {
     A obj = (int i ,int j) ->i+j;
      
     int result = obj.add(5,8);
     System.out.println(result);
  }
}/* */

///types  of interface----normal
//functional SAM(SIngle abstract method)
//marker (no method)
////////////''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

//exception:compile,runtime,logical

/*public class Demo {
  public static void main(String[] args) {

    int i= 2;
    int j=0;
   int nums[]=new int[5];
   String str = null;

   
   
    try{
      j=18/i;
      System.out.println(str.length());
      System.out.println(nums[1]);
      System.out.println(nums[5]);
    }
    catch(ArithmeticException e){
      System.out.println("something went wrong"+e);
     }
     catch (ArrayIndexOutOfBoundsException e){
      System.out.println("stay in ur limit");
     }
catch(Exception e){           //handle everything
  System.out.println("something went wrong");
}


    System.out.println(j);
    System.out.println("bye");
  }}/* */

//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  //obj:throwable
  //error:threaddeath,io error
  //exception:runtime,airthmatic ,array,null:unchecked exception,sqlexception:checked error
  /*class NavinException extends RuntimeException{
    public NavinException(String String){
super(String);
    }
  }
  class A {
    public void show(){try{
      Class .forName("Demo");
    }
    catch(ClassNotFoundException e){
      System.out.println("Not able to find a class");
    }}
  }
  public class Demo {
    static {
      System.out.println("class loaded");
    }
    public static void main(String[] args) {
  
      int i= 20;
      int j=0;
     
  A obj= new A();
  obj.show();
     
     
      try{
        j=18/i;
        if(j==0)
        throw new NavinException("i don't want to print zero");
      }
      catch(NavinException e){
        j=18/1;
        System.out.println("default output"+e);
       }
       catch (ArrayIndexOutOfBoundsException e){
        System.out.println("stay in ur limit");
       }
  catch(Exception e){           //handle everything
    System.out.println("something went wrong");
  }
  
  
      System.out.println(j);
      System.out.println("bye");
    }}/* */
  /*import java.io.InputStreamReader;
  import java.io.BufferedReader;
  import java.io.IOException;

  import java.util.Scanner;
    ///input from the user
    public class Demo {
      public static void main(String[] args)throws IOException {
System.out.println("enter a number");
//InputStreamReader in = new InputStreamReader(System.in);
//BufferedReader bf=new BufferedReader(in);

Scanner sc= new Scanner(System.in);
int num= sc.nextInt();

//int num= Integer.parseInt(bf.readLine());
System.out.println(num);
//bf.close();
}}    /* */
///......................................................
/*import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Initialize Scanner outside try block

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();  // Removed duplicate declaration
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("bye");
            sc.close();  // Always close Scanner to prevent resource leaks
        }
    }
}/* */
///.................................................................................


//Threads

/*class A extends Thread{
  public void run(){
    for(int i=0;i<=10;i++){
      System.out.println("hi");
      try{
        Thread.sleep(10);}
        catch (InterruptedException e){e.printStackTrace();
  e.printStackTrace();
        }
    }
  }
}
class B extends Thread{
  public void run(){
    for(int i=0;i<=10;i++){
      System.out.println("hello");
      try{
      Thread.sleep(10);}
      catch (InterruptedException e){e.printStackTrace();
e.printStackTrace();
      }
    }
  }
}
public class Demo {
  public static void main(String[] args) {
A obj1= new A();
B obj2= new B();
//Thread t1= new Thread();
obj1.start();
try{
  Thread.sleep(1);}
  catch (InterruptedException e){e.printStackTrace();
e.printStackTrace();
  }
obj2.start();

  }}/* */



  
  //class A implements Runnable{
    //public void run(){
      //for(int i=0;i<=10;i++){
        //System.out.println("hello");
       // try{
        //Thread.sleep(10);}
 //       catch (InterruptedException e){e.printStackTrace();
  //e.printStackTrace();
    //    }
      //}
    //}
 // }
 ////;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;




 /*class B extends Thread {
  public void run() {
      for (int i = 0; i <= 10; i++) {
          System.out.println("hi from class B");
          try {
              Thread.sleep(10);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class Demo {
  public static void main(String[] args) {
      // Anonymous Runnable
      Runnable obj1 = new Runnable() {
          public void run() {
              for (int i = 0; i <= 10; i++) {
                  System.out.println("hi from Anonymous Runnable");
                  try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
      };

      // Create threads and assign tasks
      Thread t1 = new Thread(obj1);  // Thread with anonymous Runnable
      Thread t2 = new B();           // Thread using class B

      // Start the threads
      t1.start();
      t2.start();
  }
}/* */
////////////'''''''interface runnable'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

/*class B extends Thread {
  public void run() {
      for (int i = 0; i <= 10; i++) {
          System.out.println("hi from class B");
          try {
              Thread.sleep(10);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class Demo {
  public static void main(String[] args) {
      // Anonymous Runnable
      Runnable obj1 = () -> {
          for (int i = 0; i <= 10; i++) {
              System.out.println("hello");
              try {
                  Thread.sleep(10);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      };
      Runnable obj2 = () -> {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hi ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

      // Create threads and assign tasks
      Thread t1 = new Thread(obj1);  // Thread with anonymous Runnable
      Thread t2 = new Thread(obj2);           // Thread using class B

      // Start the threads
      t1.start();
      t2.start();
  }
}/* */


/*class Counter{
  int count;
  public synchronized void increment()
  {
    count++;
  }
}
public class Demo {
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();
      // Anonymous Runnable
      Runnable obj1 = () -> {
          for (int i = 0; i <= 1000; i++) {
              c.increment();
          }
      };
      Runnable obj2 = () -> {
        for (int i = 0; i <= 1000; i++) {
          c.increment();
        }
    };

      // Create threads and assign tasks
      Thread t1 = new Thread(obj1);  // Thread with anonymous Runnable
      Thread t2 = new Thread(obj2);           // Thread using class B

      // Start the threads
      t1.start();
      t2.start();
  t1.join();
  t2.join();
  System.out.println(c.count);
    }
}/* */



//'''''''''''''''''''''''''stages of thread'''''''''''''''''''''''''''''''''''''''''''''''''''''
//collection ApI--concept
//Collection- interface
///collections-class
/*import java.util.Collection; 
import java.util.ArrayList;
public class Demo {
  public static void main(String[] args){
Collection<Integer> nums= new ArrayList<Integer>();
nums.add(6);
nums.add(5);
for(int n:nums){
  int num =(Integer)n;
System.out.println(nums);

  }}}/* */

  ///////////////////////////''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  /*import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(); // Use List instead of Collection
        nums.add(6);
        nums.add(5);
        
        // Use indexOf to get the index of the element
        System.out.println(nums.indexOf(5)); // Output: 1
        
        // Use get to retrieve the element at index 1
        System.out.println(nums.get(1)); // Output: 5
    }
}/* */
//............................................
/*import java.util.Collection; 
import java.util.ArrayList;
import java.util.*;
public class Demo {
  public static void main(String[] args){

Set<Integer> nums= new HashSet<Integer>();

nums.add(6);
nums.add(5);
for(int n:nums){
System.out.println(n);

  }}}/* */
//////////////////////////////////////''''''''''''''''''''''''
  /*import java.util.ArrayList;
import java.util.*;
public class Demo {
  public static void main(String[] args){
    Collection<Integer> nums= new TreeSet<Integer>();

    nums.add(6);
    nums.add(5);
Iterator<Integer> values= nums.iterator ();

while (values.hasNext())
System.out.println(values.next());
}}/* */


/////'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
/*import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> students = new Hashtable<>();

        // Adding student names with their corresponding marks
        students.put("anu", 569);
        students.put("janu", 59);
        students.put("manu", 69);
        

        
        // Printing all keys (student names)
        System.out.println(students.keySet());

        // Iterating over the keys to print key-value pairs
        for (String name : students.keySet()) {
            System.out.println(name + ": " + students.get(name));
        }
    }
}/* */


//////'''''''SORTING'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
/*import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(63);
        nums.add(92);
        nums.add(71);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}/* */
/*import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "anu"));
        studs.add(new Student(45, "janu"));
        studs.add(new Student(23, "sanu"));

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else if (s1.age < s2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(studs, com);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}/* */

/*simport java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else if (this.age < that.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "anu"));
        studs.add(new Student(45, "janu"));
        studs.add(new Student(23, "sanu"));

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else if (s1.age < s2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(studs, com); // Use the comparator

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}/* */

//11:52
