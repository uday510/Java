import java.util.ArrayList;

class IntClass {
    private int myValue;
    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
       String[] strArray = new String[0];
       int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("MAANG");
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(4));
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 11; i++) {
            arr.add(i);
        }
        System.out.println(arr);
     }

}