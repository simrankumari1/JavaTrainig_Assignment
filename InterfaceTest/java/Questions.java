/*ssgninterface1           interface: shape
                           method:draw, color
                           class: TestShape implements interface

assgninterface2       interface:   interface1
                      interface: interface2
                       class TestInterface implement both interfaces

assgninterface3       interface1:shape method:shapemethod
                      interface2:shape3d extends interface1     method: 3Dshapemethod
                      class TestShapes implements interface2
                      override methods
                      make main method and invoke these two methods
                         
assgninterface4       interface: Drawable 
                      method: draw
                      static method squarearea return and parametrized constructor

                      class Square implements interface
 
                      class TestInterface: main method: create object
                       invoke draw method 
                       invoke squarearea by passing value


// multiple inheritance 
assgninterface5   : Interface1  Student { method: majorSubject() ,netQualified()}
                  : Interface2  Teacher{ method: department() ,salary()}
                  : Class TA implements Interface1 Interface2
                  : main class : invoke the methods of creating object of TA class 

assgninterface6  : interface1  Vehicle { method: type: 4or 2 wheeler}
                 : interface2  Max_speed{method: speed()} extends interface1
                 : class Bike  implement interface2
                 : class main invoke methods by instantiating objects of bike
*/
/*
create main class 
take string variable
use scanner class
try{
take input from user which should be string
print(Integer.parseInt(string variable))
}
catch the exception here

Input: 1
output:1
Input:training
output:exception occured
Somehow try to bring exception
eg1- create a class
try{
create an array
take the input from user
print elements of array
}
use array catch bound exception
catch()
{
   print exception
   print stack trace
}
use most general catch
1.try using finally block in both examples
2. in 2nd example take inner try catch block and get an exception there  by using below part
    String s="abc";
    System.out.println(Integer.parseInt(s));
*/
/*
g of Java throw

make a class TestThrow
method: checkNo which should be  parametrized
condition if No>1
calculate no*no
else
throw arithmetic exception can't calculate
make main method
create objectof this class and pass the value (no)


eg of java throws
make class ThrowsTest
define method division parametrized(int a, int b) declare arithmetic exception
   int divide=a/b;
   return
main method
create object
handle the exception and pass the values

*/