[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-20-dog-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-20-dog-username)

# Lab 20 - Dog

## Lab Goal
You will make a Dog class that can be used to create and manipulate Dog objects.

## Instructions
* Create a constructor for the Dog class.  Set the default values of `age = 0`, `color = ""`, `breed = ""`, and `name = ""`.
* In the proper locations, complete the following getters and setters for each instance variable:
  - `getAge`
  - `getColor`
  - `getBreed`
  - `getName`
  - `setAge`
  - `setColor`
  - `setBreed`
  - `setName`
* Complete the method `public String speak()` that will allow your dog to speak.
* Complete the standard `toString` method to allow Java to print a Dog object.
* In the `DogRunner` class, add at least one dog in addition to Fluffy and Rex.
* Complete all javadoc comments with the proper tags.

## Sample Output
```
Fluffy is a 5 year old White Poodle
Fluffy says bark
Rex is a 2 year old Brown Boxer
Rex says bark
```

## Reference
* [ThinkJava chapter on Classes](http://greenteapress.com/thinkjava6/html/thinkjava6012.html)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 12 - Constructor
* 12 - Color accessors
* 12 - Breed accessors
* 12 - Name accessors
* 12 - Age accessors
* 10 - `speak()` method
* 10 - `toString()` method
* 10 - Add another Dog in `DogRunner`
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
