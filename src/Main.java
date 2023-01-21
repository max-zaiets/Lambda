import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((int) ((Math.random() * (10 - 1)) + 1));
            System.out.println(list.get(i));
        }

       int sum =  list.stream().map(x -> x*x).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
