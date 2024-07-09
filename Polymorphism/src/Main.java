public class Main {

    /*
    TODO: Polymorphism is a concept by which we can perform a single action in different ways.
          Polymorphism is derived from 2 Greek words: poly and morphs.
          The word "poly" means many and "morphs" means forms.
          So polymorphism means many forms.
     */
    interface Shape {
        void draw();
    }
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }
    static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        circle.draw();;
        square.draw();


    }
}
