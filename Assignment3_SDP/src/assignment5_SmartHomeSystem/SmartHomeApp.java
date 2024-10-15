package assignment5_SmartHomeSystem;

public class SmartHomeApp {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        SecuritySystem security = new SecuritySystem();
        EntertainmentSystem entertainment = new EntertainmentSystem();

        SmartHomeFacade facade = new SmartHomeFacade(lights, thermostat, security, entertainment);

        facade.arriveHome();
        facade.movieMode();
        facade.nightMode();
        facade.leaveHome();
    }
}