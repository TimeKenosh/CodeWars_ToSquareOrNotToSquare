import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator =  new Communicator();
        Calculator calculator = new Calculator();
        List<Integer> list = communicator.getListOfNumbers("Enter list of numbers: ");
        List<Integer> result = calculator.getResult(list);
        communicator.resultOut("Result: ", result);
        communicator.close();
    }
}
