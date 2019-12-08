# practice_oops_problems
Please un-comment the main methods for the Testing Code.
And If this is helpfull , do follow me on Github.


Answer To The Practise Viva Questions:

Question-1 : What is OOPs?

Solution : Object Oriented Programming is a programming concept that works on the principle that objects are the most important part of your program. It allows users create the objects that they want and then create methods to handle those objects. Manipulating these objects to get results is the goal of Object Oriented Programming.

Question-2 : What are the advantages of OOPS concepts?

Solution : The advantages of OOP are mentioned below:

    OOP provides a clear modular structure for programs.
    
    It is good for defining abstract data types.
    
    Implementation details are hidden from other modules and other modules has a clearly defined interface.
    
    It is easy to maintain and modify existing code as new objects can be created with small differences to existing ones.
    objects, methods, instance, message passing, inheritance are some important properties provided by these particular languages
    
    Encapsulation, polymorphism, abstraction are also counts in these fundamentals of programming language.
    
    It implements real life scenario.
    
    In OOP, programmer not only defines data types but also deals with operations applied for data structures.
    
Question-3 : What is the difference between Procedural programming and OOPS?

Solutions :

Procedural Programming:
Procedural Programming can be defined as a programming model which is derived from structured programming, based upon the concept of calling procedure. Procedures, also known as routines, subroutines or functions, simply consist of a series of computational steps to be carried out. During a program’s execution, any given procedure might be called at any point, including by other procedures or itself.

Object Oriented Programming:
Object oriented programming can be defined as a programming model which is based upon the concept of objects. Objects contain data in the form of attributes and code in the form of methods. In object oriented programming, computer programs are designed using the concept of objects that interact with real world. Object oriented programming languages are various but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.

Question-4 : What are the core concepts of OOPS?

Solution : 

Core OOPS concepts are:

    Abstraction
    Encapsulation
    Polymorphism
    Inheritance
    Association
    Aggregation
    Composition
    
Question-5 : What is Abstraction?

Solution : Abstraction is one of the key concepts of object-oriented programming (OOP) languages. Its main goal is to handle complexity by hiding unnecessary details from the user. That enables the user to implement more complex logic on top of the provided abstraction without understanding or even thinking about all the hidden complexity.

Question-6 : What is Encapsulation?

Solution : Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of bundling data and methods that work on that data within one unit, e.g., a class in Java.

Question-7:  What is the difference between Abstraction and Encapsulation?

Solution : Both Abstraction and Encapsulation are two of the four basic OOP concepts which allow you to model real-world things into objects so that you can implement them in your program and code.Abstraction hides complexity by giving you a more abstract picture, a sort of 10,000 feet view, while Encapsulation hides internal working so that you can change it later. In other words, Abstraction hides details at the design level, while Encapsulation hides details at the implementation level.

Question-8 : What is Polymorphism?

Solution : The term polymorphism simply means ‘one function, multiple forms’. Polymorphism is achieved at both compile time and run time. The compile time polymorphism is achieved through “overloading” whereas, the run time polymorphism is achieved through “overriding”.The polymorphism allows the object to decide “which form of the function to be invoked when” at both, compile time and run time.

Question-9 : What is Inheritance?

Solution : Inheritance is one of the crucial features of OOP, which strongly support “reusability”. Reusability could be described as creating a new class by reusing the properties of the existing class. In inheritance, there is a base class, which is inherited by the derived class. When a class inherits any other class, the member(s) of the base class becomes the member(s) of a derived class.In Java, the class inherits the other class by using the keyword “extends”. In Java, the base class is referred as a super class, and derived class is referred as a subclass. A subclass can not access those members of the base class, which are declared as “private”.

Question-10 : What is multiple inheritance?

Solution : Multiple Inheritance is a feature of object oriented concept, where a class can inherit properties of more than one parent class. The problem occurs when there exist methods with same signature in both the super classes and subclass. On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority. 

Question-11 : What is the diamond problem in inheritance?

Solution : The "diamond problem" (sometimes referred to as the "Deadly Diamond of Death") is an ambiguity that arises when two classes B and C inherit from A, and class D inherits from both B and C. If there is a method in A that B and C have overridden, and D does not override it, then which version of the method does D inherit: that of B, or that of C? 
![Example : ](https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Diamond_inheritance.svg/220px-Diamond_inheritance.svg.png)


Question-12 : Why Java does not support multiple inheritance?

Solution : Java does not supports multiple inheritance because it creates a diamond problem.And it is described above.


Question-13 : What is Static Binding and Dynamic Binding?
 
Solution : 
Static Binding: The binding which can be resolved at compile time by compiler is known as static or early binding. Binding of all the static, private and final methods is done at compile-time .Static binding is better performance wise (no extra overhead is required). Compiler knows that all such methods cannot be overridden and will always be accessed by object of local class. Hence compiler doesn’t have any difficulty to determine object of class (local class for sure).

Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called. Overriding is a perfect example of dynamic binding. In overriding both parent and child classes have same method.


Question-14 : What is the meaning of “IS-A” and “HAS-A” relationship?

Solution : 

Is-A :

In Java, an Is-A relationship depends on inheritance. Further inheritance is of two types, class inheritance and interface inheritance. It is used for code reusability in Java. For example, a Potato is a vegetable, a Bus is a vehicle, a Bulb is an electronic device and so on. One of the properties of inheritance is that inheritance is unidirectional in nature. Like we can say that a house is a building. But not all buildings are houses. We can easily determine an Is-A relationship in Java. When there is an extends or implement keyword in the class declaration in Java, then the specific class is said to be following the Is-A relationship.

HAS-A :

In Java, a Has-A relationship is also known as composition. It is also used for code reusability in Java. In Java, a Has-A relationship simply means that an instance of one class has a reference to an instance of another class or an other instance of the same class. For example, a car has an engine, a dog has a tail and so on. In Java, there is no such keyword that implements a Has-A relationship. But we mostly use new keywords to implement a Has-A relationship in Java.

Question-15 : What is Association?

Solution : Association in Java is a connection or relation between two separate classes that are set up through their objects. Association relationship indicates how objects know each other and how they are using each other’s functionality. It can be one-to-one, one-to-many, many-to-one and many-to-many.


Question-16 : What is Aggregation?

Solution : Aggregation in Java is a relationship between two classes that is best described as a "has-a" and "whole/part" relationship. It is a more specialized version of the association relationship. The aggregate class contains a reference to another class and is said to have ownership of that class. Each class referenced is considered to be part-of the aggregate class.


Question-17 : What is Composition?

Solution : Composition is one of the fundamental concepts in object-oriented programming. It describes a class that references one or more objects of other classes in instance variables. This allows you to model a has-a association between objects.


Question-18 : What is Dependency?

Solution : A dependency is a relationship between two or more objects in which an object depends on the other object or objects for its implementation. If one of these objects change, the other object(s) can be impacted. The dependency relationship between two or more objects is depicted in UML using dashed arrows. In other words, when a dependency relationship exists between two or more objects, the object needs to know about the other object(s) which it depends on.


Question-19 :  What is the difference between Association and Dependency?

Solution : Association is reference based relationship between two classes. Here a class A holds a class level reference to class B. Association can be represented by a line between these classes with an arrow indicating the navigation direction. In case arrow is on the both sides, association has bidirectional navigation.
![Example : ](https://nirajrules.files.wordpress.com/2011/07/association.png)

Dependency is often confused as Association. Dependency is normally created when you receive a reference to a class as part of a particular operation / method. Dependency indicates that you may invoke one of the APIs of the received class reference and any modification to that class may break your class as well. Dependency is represented by a dashed arrow starting from the dependent class to its dependency. Multiplicity normally doesn’t make sense on a Dependency.
![Example : ](https://nirajrules.files.wordpress.com/2011/07/dependency.png)


Question-20 :  What is a class?

Solution : A class is an entity that determines how an object will behave and what the object will contain. In other words, it is a blueprint or a set of instruction to build a specific type of object. 


Question-21 :  What is an Object?

Solution : An object is nothing but a self-contained component which consists of methods and properties to make a particular type of data useful. Object determines the behavior of the class. When you send a message to an object, you are asking the object to invoke or execute one of its methods. 

