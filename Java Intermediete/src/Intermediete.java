
/*  Started on 27-August-2023

    Java Intermediate Topic
Classes and Objects
    24. Object-Oriented Programming
    25. Creating Classes and Objects
    26. Class Attributes
    27. Access Modifires
    27. Getters and Setters
    28. Constructors
    29. Value and Reference Type
    30. The Math Class
    31. Static Keyword
    32. Final Keyword
    33. Packages
    34. Java 2 Module 1 Quiz
More on Classes
    35. Encapsulation
    36. Inheritance
    37. Polymorphism
    38. Overriding and Overloading
    39. Abstruct Classes
    40. Interface
    41. Casting
    42. Downcasting
    43. Anonymouse Classes
    44. Inner Classes
    45. The Equals() Method 
    46. Enums
    47. Using the Java Api
    48. Java 2 Module 2 Quiz
Exceptions, Lists, Threads and Files
    49. Exception Handling
    50. Multiple Exceptions
    51. Theads
    52. Runtime vs Checked Exceptions
    53. ArrayList
    54. LinkedList
    55. Hashmap
    56. Sets
    57. Sorting Lists
    58. Iterators
    59. Working with Files
    60. Reading a Files
    61. Creating and Writing Files
    62. Java 2 Module 3 Quiz

 */

public class Intermediete {

    public static void main(String[] args) {
        System.out.println("Hello Hanif!");

        classesAndObjects();

        moreOnClasses();

        exceptionsListsThreadsFiles();

    }// main

    private static void classesAndObjects() {

        /* 24. Object-Oriented Programming
         * 
         * Java uses Object-Oriented Programming (OOP),
         * a programming style that is intended to make thinking about
         * programming closer to thinking about the real world.
         * In OOP, each object is an independent unit with a unique identity,
         * just as objects in the real world are.
         * example :
         * An apple is an object; so is a mug. Each has its unique identity.
         * It's possible to have two mugs that look identical,
         * but they are still separate, unique objects.
         * 
         * Objects also have characteristics, which are used to describe them.
         * For example, a car can be red or blue, a mug can be full or empty, and so on.
         * These characteristics are also called attributes.
         * An attribute describes the current state of an object.
         * In the real world, each object behaves in its own way.
         * The car moves, the phone rings, and so on.
         * The same applies to objects: behavior is specific to the object's type.
         * 
         * In summary, in object oriented programming,
         * each object has three dimensions: identity, attributes, and behavior.
         * Attributes describe the object's current state,
         * and what the object is capable of doing is demonstrated through the object's
         * behavior.
         * 
         * Classes :
         * A class describes what the object will be, but is separate from the object
         * itself.
         * In other words, classes can be described as blueprints, descriptions, or
         * definitions for an object.
         * You can use the same class as a blueprint for creating multiple objects.
         * The first step is to define the class, which then becomes a blueprint for
         * object creation.
         * Each class has a name, and each is used to define attributes and behavior.
         * 
         * In other words, an object is an instance of a class.
         */

        /* 25. Creating Classes and Objects
         * 
         * In order to create your own custom objects, you must first create the
         * corresponding classes.
         * The dot notation is used to access the object's attributes and methods.
         */

        // Bellow
        CreatingClass.createClass();
        CreatingClass.createClasses();
        CreatingClass.num = 90;

        /* 26. Class Attributes
         * 
         * Defining Attributes
         * A class has attributes and methods.
         * The attributes are basically variables within a class.
         * You can define as many attributes and methods as necessary.
         * 
         * Next, we can create multiple objects of our Vehicle class,
         * and use the dot syntax to access their attributes and methods.
         */

        // Object Creation
        CreatingClass testClass = new CreatingClass();

        // Constructor Result
        int m = testClass.num = 80;

        System.out.println(m + " m = testClass.num = 80");

        /* 27. Access Modifires
         * 
         * public is an access modifier, meaning that it is used to set the level of
         * access.
         * You can use access modifiers for classes, attributes, and methods.
         * 
         * For classes, the available modifiers are public or default (left blank), as
         * described below:
         * public: The class is accessible by any other class.
         * default: The class is accessible only by classes in the same package.
         * 
         * The following choices are available for attributes and methods:
         * default: A variable or method declared with no access control modifier
         * is available to any other class in the same package.
         * public: Accessible from any other class.
         * protected: Provides the same access as the default access modifier,
         * with the addition that subclasses can access protected methods and variables
         * of the superclass.
         * private: Accessible only within the declared class itself.
         * 
         * It's a best practice to keep the variables within a class private.
         * The variables are accessible and modified using Getters and Setters.
         * 
         * public, private, protected, default.
         */

        /* 27. Getters and Setters
         * 
         * Getters and Setters are used to effectively protect your data,
         * particularly when creating classes.
         * For each variable, the get method returns its value,
         * while the set method sets the value.
         * 
         * Getters start with get, followed by the variable name,
         * with the first letter of the variable name capitalized.
         * Setters start with set, followed by the variable name,
         * with the first letter of the variable name capitalized.
         * Getters and setters allow us to have control over the values.
         * 
         * 
         */

        testClass.setHanif("Sb Hanif Khan");
        System.out.println(testClass.gethanif());

        /* 28. Constructors

         * In Java, a constructor is a block of codes similar to the method.
         * It is called when an instance of the class is created.
         * At the time of calling constructor, memory for the object is allocated in the
         * memory.
         * It is a special type of method which is used to initialize the object.
         * Every time an object is created using the new() keyword, at least one
         * constructor is called.
         * 
         * It calls a default constructor if there is no constructor available in the
         * class. In such case, Java compiler provides a default constructor by default.
         * There are two types of constructors in Java: no-arg constructor, and
         * parameterized constructor.
         * 
         * Constructor name must be the same as its class name
         * A Constructor must have no explicit return type
         * A Java constructor cannot be abstract, static, final, and synchronized
         * 
         * Note: We can use access modifiers while declaring a constructor. It controls
         * the object creation. In other words, we can have private, protected, public
         * or default constructor in Java.
         * 
         * In Java, a constructor is just like a method but without return type. It can
         * also be overloaded like Java methods.
         */
        parameterizedConstrctor paraConst = new parameterizedConstrctor(10, "Sb Hanif");
        paraConst.display();
        parameterizedConstrctor paraConstrctor = new parameterizedConstrctor(40, "Hanif", 23.3);
        paraConstrctor.Display();

        /* 29. Value and Reference Type

         * Value Types
         * Value types are the basic types, and include byte, short, int, long, float,
         * double, boolean, and char.
         * These data types store the values assigned to them in the corresponding
         * memory locations.
         * So, when you pass them to a method, you basically operate on the variable's
         * value, rather than on the variable itself.
         * 
         * Arrays and Strings are also reference data types.
         */

        /* 30. The Math Class

         * The JDK defines a number of useful classes, one of them being the Math class,
         * which provides predefined methods for mathematical operations.
         * 
         * You do not need to create an object of the Math class to use it. To access
         * it, just type in Math. and the corresponding method.
         */

        // Math.abs() returns the absolute value of its parameter.
        int a = Math.abs(10); // 10
        int b = Math.abs(-20); // 20

        // Math.ceil() rounds a floating point value up to the nearest integer value.
        // The rounded value is returned as a double.
        double c = Math.ceil(7.342); // 8.0

        // Similarly, Math.floor() rounds a floating point value down to the nearest
        // integer value.
        double f = Math.floor(7.343); // 7.0

        // Math.max() returns the largest of its parameters.
        int mmm = Math.max(10, 20); // 20

        // Conversely, Math.min() returns the smallest parameter.
        int mm = Math.min(10, 20); // 10

        // Math.pow() takes two parameters and returns the first parameter raised to the
        // power of the second parameter.
        double p = Math.pow(2, 3); // 8.0

        // There are a number of other methods available in the Math class, including:
        // sqrt() for square root, sin() for sine, cos() for cosine, and others.

        /*
         * 31. Static Keyword
         * 
         * 
         */















        /*
         * 32. Final Keyword
         */
        /*
         * 33. Packages
         */

        /*
         * 34. Java 2 Module 1 Quiz
         */

    }

    private static void moreOnClasses() {
    }

    private static void exceptionsListsThreadsFiles() {
    }

    // Classes and Objects
    public static class CreatingClass {

        int id;
        String name;

        // Default Constructor >>> CreatingClass(){}
        CreatingClass() {
            System.out.println("This is Constructor Creation " + id + " " + name);
        }

        /*
         * The getter method returns the value of the attribute.
         * The setter method takes a parameter and assigns it to the attribute.
         */
        private String hanif;

        // getter
        public String gethanif() {
            return hanif;
        }

        // setter
        public void setHanif(String H) {
            this.hanif = H;
        }

        static int num;

        static void createClass() {
            System.out.println(100 + " Under the method of creatingClass ");

        }

        static void createClasses() {
            System.out.println("This is method two");
        }

    }

    // Classes and Objects
    public static class parameterizedConstrctor {

        int id;
        String name;
        double score;

        parameterizedConstrctor(int i, String nam) {
            id = i;
            name = nam;
        }

        parameterizedConstrctor(int x, String xnam, double xid) {
            id = x;
            name = xnam;
            score = xid;
        }

        void display() {
            System.out.println(id + " Point " + name);
        }

        void Display() {
            System.out.println("Id (" + id + ") Name (" + name + ") Score (" + score);
        }
    }
}


//// test