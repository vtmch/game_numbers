import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        Integer guessp1 = 0;
        Integer guessp2 = 0;
        Integer guessp3 = 0;

        boolean p1isgirht = false;
        boolean p2isgirht = false;
        boolean p3isgirht = false;

        int targerNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю чисто от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать - " + targerNumber + '.');

            p1.guess(list);
            p2.guess(list);
            p3.guess(list);

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это чисто - " + guessp1 + ".");

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это чисто - " + guessp2 + ".");

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это чисто - " + guessp3 + ".");

            if (guessp1 == targerNumber) {
                p1isgirht = true;
            } else {
                list.remove(guessp1);
            }

            if (guessp2 == targerNumber) {
                p2isgirht = true;
            } else {
                list.remove(guessp2);
            }

            if (guessp3 == targerNumber) {
                p3isgirht = true;
            } else {
                list.remove(guessp3);
            }

            if (p1isgirht || p2isgirht || p3isgirht) {
                System.out.println("У нас есть победитель! Выясним, кто же это...");
                System.out.println("Победил первый игрок? Ответ: " + p1isgirht + ".");
                System.out.println("Победил второй игрок? Ответ: " + p2isgirht + ".");
                System.out.println("Победил третий игрок? Ответ: " + p3isgirht + ".");
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать ещё раз.");
            }
        }
    }
}
