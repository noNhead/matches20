package engine;

public class SimpleEngineAi implements EngineAi {
    @Override
    public int findSolution(int number) {
        if (number%4 == 0) {
            System.out.println("Комьпютер взял 3 спички");
            return 3;
        }
        if ((number+1)%4 == 0) {
            System.out.println("Комьпютер взял 2 спички");
            return 2;
        }
        System.out.println("Комьпютер взял 1 спичку");
        return 1;
    }
}
