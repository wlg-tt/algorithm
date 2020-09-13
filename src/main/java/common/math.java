package common;

import book.chapter13.FixedCapacityStackOfStrings;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class math {
    public static void main(String[] arg){
//        test();
        fixedCapacityStackOfStrings();
    }
    public static void test(){
        System.out.println(1.0/0.0);
    }
    public static void fixedCapacityStackOfStrings(){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                StdOut.println(s.sized() + "sssssss");
                s.push(item);
            } else if (!s.isEmpty()){
                StdOut.print(s.pop() + "");
            }
            StdOut.println("("+s.size()+" left on stack)");
        }
    }
    public static void interval2D(){

    }
}
