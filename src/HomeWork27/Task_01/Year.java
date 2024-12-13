package HomeWork27.Task_01;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру для каждого времени года.
 */
public enum Year {
    AUTUMN("AUTUMN", -3),
    WINTER("WINTER", -10),
    SPRING("SPRING", 10),
    SUMMER("SUMMER", 16);

    private String name;
    private int averageTemperature;

    Year(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Year{" +
                "name='" + name + '\'' +
                ", averageTemperature=" + averageTemperature +
                '}';
    }

}
