package typeracerGame.model;

public interface Model {
    void setNewWord();
    String getCurrentWord();

    void incrementPoints();
    int getPoints();

    int getTime();
    void decreaseTime();

    GameState getState();
    void setState(GameState state);

    void gameOver();
}
