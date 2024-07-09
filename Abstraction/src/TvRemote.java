public class TvRemote extends RemoteControl {
    @Override
    void powerOn() {
        System.out.println("TV is powered on.");
    }

    @Override
    void powerOff() {
        System.out.println("TV is powered off.");
    }

    @Override
    void changeChannel(int channel) {
        System.out.println("Changed to channel " + channel);
    }
}
