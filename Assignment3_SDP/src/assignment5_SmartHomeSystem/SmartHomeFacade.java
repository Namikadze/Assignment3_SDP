package assignment5_SmartHomeSystem;

public class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem security;
    private EntertainmentSystem entertainment;

    public SmartHomeFacade(Lights lights, Thermostat thermostat, SecuritySystem security, EntertainmentSystem entertainment) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.security = security;
        this.entertainment = entertainment;
    }

    public void leaveHome() {
        lights.turnOff();
        thermostat.setTemperature(20);
        security.activate();
        System.out.println("Leaving home...");
    }

    public void arriveHome() {
        lights.turnOn();
        thermostat.setTemperature(22);
        security.deactivate();
        System.out.println("Arriving home...");
    }

    public void movieMode() {
        lights.turnOff();
        entertainment.playMovie();
        System.out.println("Movie mode activated.");
    }

    public void nightMode() {
        lights.turnOff();
        thermostat.setTemperature(18);
        security.activate();
        System.out.println("Night mode activated.");
    }
}

