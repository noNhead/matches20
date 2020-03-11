package engine;

public interface Player {
    /**
     * ход игрока
     * @param matches
     * @return возвращает, сколько человек забрал спичек
     */
    int step(int matches);
}