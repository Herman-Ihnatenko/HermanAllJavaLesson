package HomeWork21;



public class AutoPilot2 {

    private String softwareVersion;

    private Autobus2 autobus2;

    public AutoPilot2(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "AutoPilot: {" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public Autobus2 getAutobus() {
        return autobus2;
    }

    public void setAutobus(Autobus2 autobus) {
        this.autobus2 = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
