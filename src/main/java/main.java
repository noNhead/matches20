import engine.SimpleGameEngine;

class Main {
    public static void main(String[] args) {
        SimpleGameEngine simpleGameEngine = new SimpleGameEngine();
        String name = simpleGameEngine.game("ai", "player", 20);
        if (name == null) {
            System.out.println("Похоже что-то пошло не так, game вернуло пустое значение");
        } else {
            System.out.println("Победил " + name);
        }
    }
}