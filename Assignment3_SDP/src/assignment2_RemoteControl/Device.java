package assignment2_RemoteControl;

public interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
}