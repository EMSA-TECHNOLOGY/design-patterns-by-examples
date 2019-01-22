package emsa.pattern.behavioral.iterator;

public interface ItemIterator<T> {

  boolean hasNext();

  T next();
}