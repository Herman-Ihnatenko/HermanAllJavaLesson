package HomeWork26.Task_02;

public class NumericPair <T extends Number>{
    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum(){
        return first.doubleValue() + second.doubleValue();
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
