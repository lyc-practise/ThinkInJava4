package exec.holding;

import java.util.Arrays;

public class ArrayIsNotIterable {
	  static <T> void test(Iterable<T> ib) {
	    for(T t : ib)
	      System.out.print(t + " ");
	  }
	  public static void main(String[] args) {
	    test(Arrays.asList(1, 2, 3));
	    String[] strings = { "A", "B", "C" };
	    for(String s:strings){
	    	System.out.print(s);
	    }
	    // An array works in foreach, but it's not Iterable:
	    //! test(strings);
	    // You must explicitly convert it to an Iterable:
	    test(Arrays.asList(strings));
	  }
	} /* Output:
	1 2 3 A B C
	*///:~
