import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<Integer> getResult(List<Integer> list){
        List<Integer> resultList = new ArrayList<>();
        for (int i: list) {
            if (i == (int) Math.sqrt(i)*(int)Math.sqrt(i)){
                resultList.add((int)Math.sqrt(i));
            } else {
                resultList.add(i*i);
            }
        }
        return resultList;
    }
}
