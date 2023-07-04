/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    int modulus;
    Counter thisleft; 
    int digit;
    //Instance variables here
    
    public Counter(int modulus, Counter left) {
        this.modulus = modulus; 
        this.thisleft =  left;
    }
    /**
     * @return the modulus
     */
    public int getModulus() {
        return modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
       
       if (thisleft != null){
           return thisleft;
       }
       else 
           return null;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) { 
        this.digit = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if((thisleft != null) && (digit == modulus-1))
        {
            digit = 0;
            thisleft.increment();
        }
        
        else if(digit == modulus-1)
        {
            digit = 0;
        }
        
        else
        {
            digit = digit + 1;
        }
   
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(thisleft != null){
            return digit + (modulus * thisleft.digit);
        }
        else {
            return digit;
    }
    }
 /** Returns a String representation of the Counter's
     * total count (including its left neighbor).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}