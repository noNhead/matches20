package engine;

import java.util.Scanner;

public class SimplePlayer implements Player{

    @Override
    public int step(int matches) {
        int numberOfMatches = 0;
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Сколько спичек забрать (1-3)?");
        while (!flag) {
            numberOfMatches = in.nextInt();
            if (numberOfMatches > 0 && numberOfMatches < 4) {
                flag = true;
            } else {
                System.out.println("Нужно выбрать одну, две или три спички");
            }
        }
        return numberOfMatches;
    }
}