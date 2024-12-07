package HomeWork25;

public interface Repairable {
    void diagnose();
    void repair();
    double getRepairCost();
    int estimateRepairTime();
}
