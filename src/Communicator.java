import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Communicator {
    Scanner scanner =  new Scanner(System.in);
    public List<Integer> getListOfNumbers(String text){
        System.out.println("*Write 0 for end yor list*");
        System.out.println(text);
        List<Integer> list = new ArrayList<>();
        boolean check = true;
        while (check){
            int x = scanner.nextInt();
            if (x == 0){
                break;
            } else{
                list.add(x);
            }
        }
        System.out.println("Your list is: " + list);
        return list;
    }
    public void resultOut(String text, List<Integer> list) {
        System.out.print(text + list);
    }
    public void close(){
        scanner.close();
    }
}
