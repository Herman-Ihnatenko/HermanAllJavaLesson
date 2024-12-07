package HomeWork25;

public class Laptop extends Gadget{
    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика устройства: "
                + getModel() + "владельца "
                + getOwnerName() + ".");

        System.out.println("Проверка жесткого диска и системы охлаждения...");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт начат.");
        System.out.println("Замена кулера завершена.");
    }

    @Override
    public int estimateRepairTime(){
        return 4;
    }
}
