public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(122345);
        timsPhone.answer();
    }

}