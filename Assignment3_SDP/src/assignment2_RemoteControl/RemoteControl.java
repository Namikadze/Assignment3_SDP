package assignment2_RemoteControl;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerButton();
    public abstract void volumeButton(int volume);
    public abstract void channelButton(int channel);
}
