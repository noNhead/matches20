package engine;

public class SimpleGameEngine implements GameEngine {
    Matches matches = new Matches();
    SimpleEngineAi simpleEngineAi = new SimpleEngineAi();
    SimplePlayer simplePlayer = new SimplePlayer();

    public SimpleGameEngine() {
    }

    public SimpleGameEngine(Matches matches, SimpleEngineAi simpleEngineAi, SimplePlayer simplePlayer) {
        this.matches = matches;
        this.simpleEngineAi = simpleEngineAi;
        this.simplePlayer = simplePlayer;
    }


    @Override
    public boolean step(String name, int matchesOf) {
        if (matchesOf > 0) {
            if (name.equalsIgnoreCase("player")) {
                matches.setMatches(matches.getMatches() - simplePlayer.step(matchesOf));
            }
            if (name.equalsIgnoreCase("ai")) {
                matches.setMatches(matches.getMatches() - simpleEngineAi.findSolution(matchesOf));
            }
            if (name.equalsIgnoreCase("player 1")){
                matches.setMatches(matches.getMatches() - simplePlayer.step(matchesOf));
            }
            if (name.equalsIgnoreCase("player 2")){
                matches.setMatches(matches.getMatches() - simplePlayer.step(matchesOf));
            }
            if (matches.getMatches() >= 5) {
                System.out.println("Осталось " + matches.getMatches() + " спичек");
            }
            else if (matches.getMatches() < 5 && matches.getMatches()> 1) {
                System.out.println("Осталось " + matches.getMatches() + " спички");
            }
            else if (matches.getMatches() == 1) {
                System.out.println("Осталось " + matches.getMatches() + " спичка");
            }
            else if (matches.getMatches() < 1) {
                System.out.println("Cпичек не осталось");
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String game(String firstPlayer, String secondPlayer, int matchesOf) {
        matches.setMatches(matchesOf);
        String name = null;
        if (firstPlayer == null){
            firstPlayer = "Player 1";
        }
        if (secondPlayer == null){
            secondPlayer = "Player 2";
        }
        for (int i = 1; ; i++) {
            if (i%2 == 1) {
                name = firstPlayer;
            } else {
                name = secondPlayer;
            }
            if(!step(name, matches.getMatches())){
                return null;
            }
            if (matches.getMatches() <= 0) {
                break;
            }
        }
        if (name.equalsIgnoreCase(firstPlayer)) {
            name = secondPlayer;
        }
        else {
            name = firstPlayer;
        }
        return name;
    }
}
