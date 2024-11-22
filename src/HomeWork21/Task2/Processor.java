package HomeWork21.Task2;

public class Processor extends Component{

    public Processor(String brand, String model) {
        super(brand, model);
    }

    public String toString(){
        return "Processor: "+super.toString();
    }
}
