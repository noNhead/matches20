package engine;

public interface EngineAi {
    /**поиск нужного хода
     *
     * @param numberOfMatches количество спичек на сейчас
     * @return возвращает количество спичек, которое нужно взять
     */
    int findSolution(int numberOfMatches);

}

