## references:
1. Design Patterns, Elements of Reusable Object-Oriented Software.pdf
2. https://gpcoder.com/4665-huong-dan-java-design-pattern-chain-of-responsibility/
3. https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java

## Definition
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along with the chain until an object handles it.

## Javascript example: 
https://www.dofactory.com/javascript/chain-of-responsibility-design-pattern

## Benefit
Loose coupling
Increase flexibility
Distribute responsibilities for objects

## When
Want to send a request to one of several objects but do not specify which specific object will handle the request.
When you need to execute word processors in a certain order