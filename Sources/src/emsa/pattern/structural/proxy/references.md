## references:
1. Design Patterns, Elements of Reusable Object-Oriented Software.pdf
2. https://gpcoder.com/4644-huong-dan-java-design-pattern-proxy/
3. https://www.journaldev.com/1572/proxy-design-pattern
4. https://en.wikipedia.org/wiki/Proxy_pattern#Java

#Definition
Provide a surrogate or placeholder for another object to control access to it.

## Type: 
Virtual Proxy
Protection Proxy
Remote Proxy
Monitor Proxy
Firewall Proxy
Cache Proxy
...

## Javascript example: 
https://www.dofactory.com/javascript/proxy-design-pattern

## Benefits
- Performance improvements through lazy loading, only loading resources when they are required
- It provides protection for real objects from the outside world.
- Reduce costs when there is more access to the object

# When
When you want to protect access to methods of real objects
When you need some additional operations
When there is more access to the object
When the original object exists in the remote environment

## Compare Proxy Pattern with Pattern Decorator
Same diagram: Wrap a real object inside it.
Diff: using purpose
