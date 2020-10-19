# Day 14 - Day 22



### Primer to OOP with Java

**Different Data types available in Java**

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



**What is an Object? **

It is a basic unit of Object-Oriented Programming and represents the real-life entities. A typical Java program creates many objects, which interact by invoking the methods. An object is made up of the following:

* **State:** It is represented by attributes of an object. It also reflects the properties of an object.
* **Behavior:** It is represented by methods of an object. It also reflects the response of an object with other objects.
* **Identity:** It gives a unique name to an object and enables one object to interact with other objects.



**What is an Interface?**

Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, nobody). Following are the properties of the interface:

* Interfaces specify what a class must do and not how. It is the blueprint of the class.
* An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
* If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
* A Java library example is [Comparator Interface](https://www.geeksforgeeks.org/comparator-interface-java/). If a class implements this interface, then it can be used to sort a collection.



**Operators **

Java provides a rich set of operators to play around with the different variables. We can broadly classify the operators as following:

* Arithmetic Operators. Eg: +,-,*,/
* Relational Operators. Eg: >,<,==,!=
* Bitwise Operators. Eg: |, &,  ^, ~, >>, <<
* Logical Operators. Eg: ||, &&, !
* Assignment Operators. Eg: =, +=, -=, *=, /=
* Miscellaneous Operators. Eg: (?:), instanceof





