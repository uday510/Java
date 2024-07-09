public class Main {
    public static void main(String[] args) {
        TvRemote remote = new TvRemote();
        remote.powerOn();
        remote.changeChannel(10);
        remote.powerOff();
    }
}