public class A {
    synchronized static void fun1(){
        System.out.println("synchronized fun1()");
    }

    synchronized  void fun2(){
        System.out.println("synchronized  void fun2(");
    }

    void fun3(){
        System.out.println("synchronized fun3(");
    }
}
