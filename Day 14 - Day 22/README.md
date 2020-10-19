# Primer to OOP with Java

#### Different Data types available in Java

* Primitive Datatypes: These are the data types which form the basic building blocks of the programming language. Here, it is Java.
  * Boolean
  * Byte
  * Short
  * Integer
  * Long
  * Float
  * Double
  * Char
* Non-primitive Datatypes: These are the data types that are constructed/formed using the basic data types and also contain a memory address of variable value
  * String
  * Class
  * Object
  * Interface
  * Array



**What is a Class? **

A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include the following components:

* **Modifiers **: A class can be public or has default access. 
* **Class name:** The name should begin with an initial letter (capitalized by convention). 
* **Superclass(if any):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent. 
* **Interfaces(if any):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
*  **Body:** The class body surrounded by braces, { }.

```java
public class TwoWheeler {
	private String modelNumber;
	private String chasisNumber;

	public void movement() {
	}
	
	public void engineBehavior() {
	}
}
```



**What is an Object? **

It is a basic unit of Object-Oriented Programming and represents the real-life entities. A typical Java program creates many objects, which interact by invoking the methods. An object is made up of the following:

* **State:** It is represented by attributes of an object. It also reflects the properties of an object.
* **Behavior:** It is represented by methods of an object. It also reflects the response of an object with other objects.
* **Identity:** It gives a unique name to an object and enables one object to interact with other objects.

```java
Vehicle veh = new Vehicle();
```



**What is an Interface?**

Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, nobody). Following are the properties of the interface:

* Interfaces specify what a class must do and not how. It is the blueprint of the class.
* An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
* If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
* A Java library example is [Comparator Interface](https://www.geeksforgeeks.org/comparator-interface-java/). If a class implements this interface, then it can be used to sort a collection.

```java

public interface Vehicle {
	public void movement();
	public final int numOfWheels = 2;
}

public class TwoWheeler implements Vehicle {
	private String modelNumber;
	private String chasisNumber;

	public void movement() {
	}
	
	public void engineBehavior() {
	}
}

```



#### Operators 

Java provides a rich set of operators to play around with the different variables. We can broadly classify the operators as following:

* Arithmetic Operators. Eg: +,-,*,/ś
* Relational Operators. Eg: >,<,==,!=
* Bitwise Operators. Eg: |, &,  ^, ~, >>, <<
* Logical Operators. Eg: ||, &&, !
* Assignment Operators. Eg: =, +=, -=, *=, /=
* Miscellaneous Operators. Eg: (?:), instanceof



#### Conditionals

Every programming language needs some programming constructs that helps in writing code for decision making. Likewise, Java provides the following conditional programming constructs.

* If
* If-Else
* Nested-If
* If-Else-If
* Switch case
* Jump Statements like break, continue, return.

```java
if(boolean conditon)
{
    // Just if
    // Some operation
}
//if-else
else
{
    // if-else-if
    if(boolean condition)
    {
        // Nested if
        if(boolean condition)
        {
           // Some operation
        }
    }
}
```



#### Loops

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.

Java provides three way for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

* **while loop**: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.

  ```java
  while(boolean condition)
  {
      //some operation
  }
  ```

* **for loop**: for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

  ```java
  for (initialization condition; testing condition; increment/decrement)
  {
      // Some operation
  }
  
  ```

* **Enhanced for loop**: Java also includes another version of for loop introduced in java 5. Enhanced for loop provides a simpler way to iterate through the elements of a collection or array. It is inflexible and should be used only when there is a need to iterate through the elements in sequential manner without knowing the index of currently processed element.

  ```java
  for (T element:Collection obj.array)
  {
      //Some operation
  }
  ```

* **do while**:  do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.

  ```java
  do
  {
      //Some operation
  }
  while (boolean condition);
  
  ```



#### Objects

It is a basic unit of Object oriented Programming and represents the real life entities. 

* **State:** It is represented by attributes of an object. It also reflects the properties of an object.

* **Behavior:** It is represented by methods of an object. It also reflects the response of an object with other objects.

* **Identity:** It gives a unique name to an object and enables one object to interact with other objects.

  Example of an object: dog 

![img](https://lh3.googleusercontent.com/2GDdz6fU4YKjHXChFpbXcbot3S46QgsWAnvqUWyNM91s_19TOU5hz0hmpFLFpWbbOLExDYOMEeaz61Wov4fHlG6yLqAcKAACnKnGQBZ2wwbYDzst99H9lwTeDGU35jQvqc30pv8Z)

**Declaring Objects (Also called instantiating a class)**

When an object of a class is created, the class is said to be **instantiated**. All the instances share the attributes and the behaviour of the class. But the values of those attributes i.e. the state are unique for each object. A single class may have any number of instances.



**Example:**
![img](https://lh5.googleusercontent.com/FPMNBFCuLtAIT0bj7Ya_09_k0bENWogEcH51LcBN5hntbob1mEY_23jef_bf08xLBhmIC5znrGZY3U7DgosfeOYpdf8x_aAoCNjEpPt_FXOQYGh-tsLJnX8x97s0uKdLnkCAuIDN)

As we declare variables like (type name;). This notifies the compiler that we will use name to refer to data whose type is type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable. So for reference variables, type must be strictly a concrete class name. In general, we **can’t** create objects of an abstract class or an interface.

```java
Dog labordar;
```



#### Classes and Access specifiers

A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include the following components:

* **Modifiers **: A class can be public or has default access. 
* **Class name:** The name should begin with an initial letter (capitalized by convention). 
* **Superclass(if any):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent. 
* **Interfaces(if any):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
*  **Body:** The class body surrounded by braces, { }.

Constructors are used for initializing new objects. Fields are variables that provide the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.
There are various types of classes that are used in real time applications such as nested classes, anonymous classes, lambda expressions.

There are different types of access specifiers in Java that limit the access to variables.

* **Private**: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
* **Default**: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
* **Protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.The protected access modifier can be applied on the data member, method and constructor. It can't be applied to the class. It provides more accessibility than the default modifier.
*  **Public:** The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package. It has the widest scope among all other modifiers.



#### Scopes

**What is scope a variable?**
Scope is an area/piece of code in which the variable is valid to access or work upon i.e outside the scope , you cannot access the variable.
**What is the scope of a class?**
Well we know that class consists of variables and methods

![img](https://lh3.googleusercontent.com/VWnzSNOW9kIuDO5kdNOXJs-YfJ5gWEL_Ht2KddL7KJm8qKsPQptAEHtyMyXbQedlUzleLEMTXirdwlIoWFKGOhzphPd3Up9aTYkkURnk8P2j-iV3DlnItqLfH7E5bheyFlHurzQb)



#### Packages

A *package* is a grouping of related types providing access protection and name space management. 

The types that comprise a package are known as the *package members*.

To use a public package member from outside its package, you must do one of the following:

* Refer to the member by its fully qualified name

  ```java
  vehicle.TVSApache veh = new vehicle.TVSApache();
  ```

* Import the package member

  ```java
  import vehicle.TVSApache;
  
  TVSApache veh = new TVSApache();
  ```

* Import the member's entire package

  ```java
  import vehicle.*;
  
  TVSApache veh1 = new TVSApache();
  BAJAJAvenger220 veh2 = new BAJAJAvenger220();
  ```



#### Inheritance

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of [OOPs](https://www.javatpoint.com/java-oops-concepts) (Object Oriented programming system). 

The idea behind inheritance in Java is that you can create new [classes](https://www.javatpoint.com/object-and-class-in-java) that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the **IS-A relationship** which is also known as a *parent-child* relationship.

**Why use inheritance in java**

* For [Method Overriding](https://www.javatpoint.com/method-overriding-in-java) (so [runtime polymorphism](https://www.javatpoint.com/runtime-polymorphism-in-java) can be achieved).
* For Code Reusability.

**Terms used in Inheritance**

* **Class:** A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
* **Sub Class/Child Class:** Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
* **Super Class/Parent Class:** Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
* **Reusability:** As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

Syntax:

```java
class Subclass-name extends Superclass-name  
{  
//methods and fields  
} 

```



#### Typecasting

The process of converting the a variable from one data type to other data type is called typecasting.

There are two types of typecasting:

* **Automatic or Widening typecasting **: Word automatic means “itself”. It is simple in java, It automatically converts one data type to another data type when passing a smaller size type to a larger size type. It is also known as Implicit type casting.

  ```java
  int a = 100;
  double ex = a;
  ```

* **Narrowing or Explicit typecasting**: By using parentheses in front of the value we manually convert one data type into another type that is known as Narrowing or Explicit Casting. It converting a larger size type to a smaller size type.

  ```java
  double a = 100;
  int ex = (int)a;
  ```



**What is upcasting/downcasting?**

The process of converting the object from sub-class type to super-class type is called upcasting.

Whereas, downcasting is the other way round.

![img](https://lh4.googleusercontent.com/fZoyDVWRGCfdxVINw2sQ1zRiidRKj6wvqGjLDVAKG9ZSYIA0Ic821yLTdIvPDRcK4CeUyHCDSbvbuQ_2oz_ipGhJjdWJiR0M-ccN8okMbQqhCA51vBtfHp2P_5sMtNTnhvfe3aCo)



