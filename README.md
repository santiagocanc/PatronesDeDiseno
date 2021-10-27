# Design patterns

>These are techniques for solving common problems in software development and other areas related to interaction or interface design.
>
>A design pattern is a solution to a design problem.

## Creational patterns

### [Factory](./Cafeteria)

Provides an interface to create objects in a superclass, but allows subclasses to alter the type of objects to be created. Provides implicit object instantiation through common interfaces.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/factory-method-diagram.png" width="500" height="400">

### [Abstract Factory](./Videojuego)

In this pattern, an interface creates sets or families of related objects without specifying the class name.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/abstract-factory-diagram.png" width="500" height="400">

### [Builder](./Farmaceutica)

Allows to produce different types and representations of an object using the same construction code. It is used for step-by-step creation of a complex object by combining simple objects. The final creation of objects depends on the stages of the creative process, but is independent of other objects.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/builder-diagram.png" width="500" height="400">

### [Singleton](./Singleton)

This design pattern restricts the creation of instances of a class to a single object. 

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/singleton-diagram.png" width="500" height="400">

### [Prototype](./Proto_type)

Allows you to copy existing objects without making your code dependent on their classes. It is used to restrict memory/database operations by keeping modification to a minimum using object copies.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/prototype-diagram.png" width="500" height="400">

## Structural patterns

### [Facade](./Facade)

It provides a simplified interface to a library, framework or any other complex set of classes.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/facade-diagram.png" width="500" height="400">

### [Composite](./PC)

Used to group objects as a single object. It allows you to compose objects into tree structures and then work with these structures as if they were individual objects.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/composite-diagram.png" width="500" height="400">

### [Decorator](./Smote)

A proxy control access to the original object, allowing you to do something before or after the request reacher the original objects.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/decorator-diagram.png" width="500" height="400">

### [Proxy](./towers)

Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/proxy-diagram.png" width="500" height="400">

## Behavioral patterns

### [Observer](./Red)

Allows to define a subscription mechanism to notify several objects about any event that happens to the object being observed.

<img src="https://reactiveprogramming.io/books/patterns/img/patterns-articles/observer-diagram.png" width="500" height="400">

## credits

* [README design](https://github.com/iluwatar/java-design-patterns)

