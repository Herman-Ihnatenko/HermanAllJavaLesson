package lesson23.transport;

public abstract class Vehicle {

    private Engine engine;

    public void startEngine() {

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}