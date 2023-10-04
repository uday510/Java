import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Dummy {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);

        // Make a call to display method as per question requirements here

        display(new ArrayList());
    }

    // Write the display method as per requirements of question here
    public static void display(Iterable iterable) {

        for (Object i : iterable) {
            System.out.println(i);
        }
    }

}