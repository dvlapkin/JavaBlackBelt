package collection;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        String u = new String("123");
        String u1 = new String("\\");
        String u2 = "\"";

        String u3 = u.concat(u1);
        u3 = u3.concat(u2);
        System.out.println(u3);


        Stack<Integer> ints = new Stack<Integer>();
        for(int j=0;j<10;j++){
        ints.add(new Integer(j));
        }
        System.out.println(ints.peek());
        System.out.println(ints.pop());
        System.out.println(ints.peek());
        System.out.println(ints.push(10));
        System.out.println(ints.remove(5));
        System.out.println(ints);

}
}
