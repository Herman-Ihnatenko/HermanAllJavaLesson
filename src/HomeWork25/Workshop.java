package HomeWork25;

public class Workshop {
    public void processRepair(Gadget gadget){
        gadget.diagnose();
        gadget.repair();
        System.out.println("Стоимость ремонта: " + gadget.getRepairCost() + " USD");
    }


}
