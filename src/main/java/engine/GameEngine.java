package engine;

public interface GameEngine {

    /** Делает ход
     *
     * @param name
     * @param matches
     * @return возвращает тру если ход сделан
     */
    boolean step(String name, int matches);

    /**игра
     *
     * @param firstPlayer
     * @param secondPlayer
     * @param matchesOf
     * @return возвращает победителя
     */
    String game(String firstPlayer, String secondPlayer, int matchesOf);
}

