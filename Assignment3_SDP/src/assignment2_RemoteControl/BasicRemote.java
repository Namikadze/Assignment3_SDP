package assignment2_RemoteControl;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Basic remote: Power button ON.");
        device.powerOn();
        System.out.println("Basic remote: Power button OFF");
        device.powerOff();
    }

    @Override
    public void volumeButton(int volume) {
        System.out.println("Basic remote: Setting volume.");
        device.setVolume(volume);
    }

    @Override
    public void channelButton(int channel) {
        System.out.println("Basic remote: Setting channel.");
        device.setChannel(channel);
    }
}
