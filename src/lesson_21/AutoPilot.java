package lesson_21;

public class AutoPilot {

    private String softwareVersion;

    private Autobus2 autobus;

    public AutoPilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "AutoPilot: {" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public Autobus2 getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus2 autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
