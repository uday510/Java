public class Main extends Object {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        System.out.println("Model is " + porsche.getModel() + ".");
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
    }
}