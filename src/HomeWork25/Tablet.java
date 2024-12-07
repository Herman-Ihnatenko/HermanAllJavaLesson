package HomeWork25;

public class Tablet extends Gadget{
    public Tablet(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }


    @Override
    public void diagnose() {
        System.out.println("Диагностика устройства: "
                + getModel() + " владельца "
                + getOwnerName() + ".");

        System.out.println("Проверка экрана и батареи...");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат.");
        System.out.println("Замена экрана завершена.");
    }

    @Override
    public int estimateRepairTime(){
        return 3;
    }


}
