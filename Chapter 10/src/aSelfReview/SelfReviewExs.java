/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aSelfReview;

/**
 *
 * @author User
 */
public class SelfReviewExs {
    
    /*
    
10.1)
    a)  
        abstract class  
        
    b)
        concrete classes
    
    c)
        Polymorphism
    
    d)
        abstract
    
    e)
        downcasting
    
    
10.2)
    a)
        False - only one method in a class needs to be declared
                abstract for the class to be declared abstract.
    
    b)
        False - Trying to invoke a subclass-only method with 
                a superclass variable is not allowed.
    
    c)
        False - Only a concrete subclass must implement the 
                method.
    
    d)  True
        
    
    
10.3)
    
    
    
10.4)
    Abstract methods do not provide implementations. Abstract 
    methods are methods which are in abstract classes. An 
    abstract class usually contains one or more abstract methods.
    Abstract methods do not provide impplementations. Each concrete 
    subclass of an abstract superclass also must provide conrete 
    implementations of each of the superclass’s abstract methods.
    Constructors and static methods cannot be declared abstract. 
    Constructors are not inherited, so an abstract constructor 
    could never be implemented. Though non-private static methods 
    are inherited, they cannot be overridden. Since abstract 
    methods are meant to be overridden so that they can process 
    objects based on their types, it would not make sense to 
    declare a static method as abstract.
    
    Abstract methods would be appropriate when different methods
    have a lot of the same information. Its wasted code and
    effort and is unprofessional , also it wastes time. Whereas
    if the code is written in a superclass , that code can be 
    used by all the sub classes so it saves effort and time and 
    also makes the program more efficient. Also if a lot of the 
    code is repeated changes if needed have to be made to each
    different section of code which is completely inefficient
    and time wasting when it could be written so much more clever
    and efficient. So if abstract methods are used the code only 
    needs to be changed in one method so these changes can be 
    implented to each subclass methods that use the same code.
    Making one change is so much more important, effiecient and
    clever than having to make many changes of the same code in
    numorous different subclasses and methods.
    
10.5)
    Polymorphism (p. 395) enables us to write programs that 
    process objects that share the same superclass as if 
    they’re all objects of the superclass; this can simplify 
    programming. With polymorphism, we can design and implement
    systems that are easily extensible. The only parts of a 
    program that must be altered to accommodate new classes are 
    those that require direct knowledge of the new classes that 
    you add to the hierarchy.
    
****************************************************************    
    
10.7)
    Comparisons:
    Abstract classes promote code reduction. They stop code 
    duplication where the same code is repeated. Instead abstract
    classes inable code to only need to be written once in the
    superclass( abstract class) and then that code can be shared
    in all the subclasses. 
    All methods declared in an interface are implicitly public 
    abstract methods.
    **********
    
    
    Contrasts:  *******************************************
    When all the interface's methods , that class must be 
    declared abstract. So there is a difference in the number
    of methods declared in each. This allows objects of 
    unrelated classes to be processed polymorphically— That 
    is a major difference. Interfaces allow unrelated classes 
    need to share common methods whilst Abstract methods use 
    the share of related methods.
    
        (mixed up interfaces and abstract methods)
    **********^^^^^^^^^^^^^^^^^^^^^^^^^^^^*****************
    
    
    
    
    
    */
    
}
