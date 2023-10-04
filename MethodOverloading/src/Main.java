public class Main {
    public static void main(String[] args) {
        P obj = new C();
//        C cobject = new P();

        System.out.println(obj.d1); // 10
        System.out.println(obj.d); // 100
        obj.fun1(); // p's fun1
        obj.fun(); // c's fun
        obj.sfun(); // p's sfun

    }
}