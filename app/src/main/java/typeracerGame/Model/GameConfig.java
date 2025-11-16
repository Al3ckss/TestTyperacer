package typeracerGame.model;

/**
 * Configurazione globale del gioco TypeRacer.
 * Costanti centralizzate per evitare magic numbers sparsi nel codice.
 */
public final class GameConfig {
    private GameConfig() {}

    public static final int INITIAL_TIME_SECONDS = 21;
    public static final int TIMER_DELAY_MS = 1000;
    public static final int FRAME_WIDTH = 700;
    public static final int FRAME_HEIGHT = 500;

    // Font sizes
    public static final int LABEL_FONT_SIZE = 24;
    public static final int INPUT_FONT_SIZE = 20;
}
