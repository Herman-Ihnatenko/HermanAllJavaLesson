package HomeWork25;

public abstract class Gadget implements Repairable{
    private String ownerName;
    private String model;
    private double repairCost;

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    @Override
    public int estimateRepairTime(){
        return 1;
    }


}
