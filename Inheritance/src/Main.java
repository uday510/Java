public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; ++i) {
//            LPAStudent s = new LPAStudent("S92300" + i,
//                    switch (i) {
//                    case 1 -> "Mary";
//                    case 2 -> "Carol";
//                    case 3 -> "Time";
//                    case 4 -> "Harry";
//                    case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//
//            System.out.println(s);
//        }
//
//        Student pojoStudent = new Student("S923006", "Ann",
//                "05/11/1985",
//                "Java Masterclass");
//
//        LPAStudent recoredStudent = new LPAStudent("S923007",
//                "Bill", "05/11/1985", "Java Masterclass");
//
////        System.out.println(pojoStudent);
////        System.out.println(recoredStudent);
//
//        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
////        recoredStudent.setClassList(recoredStudent.classList() + ", Java OCP Exam 829");
//
//        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//        System.out.println(recoredStudent.name() + " is taking " + recoredStudent.classList());
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");

//        System.out.println(dog);
        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "slow");
        doAnimalStuff(retriever, "slow");


        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Golfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

    }
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
