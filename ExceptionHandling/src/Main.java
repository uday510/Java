import org.w3c.dom.events.EventException;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    }

    public Object findStudentById(int id) {
        if (id < 30) {
            return new Object();
        }
        throw new NullPointerException();
    }

    public static Integer getJustLarger(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just larger than dat


        return treeSet.ceiling(data);

    }

    public static Integer getJustSmaller(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just smaller than data
        return treeSet.floor(data);
    }
}