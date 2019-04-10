import java.util.List;

public class Player {
    int number = 0;
    public void guess(List<Integer> list) {
        int index = (int) (Math.random() * list.size());
        number = list.get(index);
        System.out.println("Думаю, это число - " + number + ".");
    }
}

