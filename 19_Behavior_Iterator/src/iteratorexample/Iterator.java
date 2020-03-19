package iteratorexample;

public interface Iterator<T> {

    void reset();   // reset to the first element
    
    T next();   // To get the next element
 
    T currentItem();    // To retrieve the current element
 
    boolean hasNext();  // To check whether there is any next element or not.
}
