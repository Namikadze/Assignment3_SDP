package assignment2_RemoteControl;

public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD is ON");
    }
    @Override
    public void powerOff() {
        System.out.println("DVD is OFF");
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("DVD channel: " + channel);
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("DVD volume: " + volume);
    }
}
