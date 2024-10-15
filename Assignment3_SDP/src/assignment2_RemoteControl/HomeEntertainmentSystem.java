package assignment2_RemoteControl;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();

        RemoteControl remote = new BasicRemote(tv);
        remote.powerButton();
        remote.volumeButton(5);
        remote.channelButton(20);

        remote = new BasicRemote(dvd);
        remote.powerButton();
        remote.volumeButton(1);
        remote.channelButton(15);
    }
}
