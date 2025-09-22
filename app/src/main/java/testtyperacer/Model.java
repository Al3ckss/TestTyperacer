package testtyperacer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Model {
    private final long time = 20_000;
    private int remainingTime = 20_000;
    private final long delay = 50;
    private String currentWord = getRandom();

    private final List<String> words = Arrays.asList(
    "auto", "casa", "sole", "luna", "mare", "vento", "pioggia", "neve", "montagna", "fiume",
    "strada", "cielo", "tempo", "notte", "giorno", "amico", "amore", "cuore", "libro", "scuola",
    "computer", "telefono", "tastiera", "schermo", "mouse", "sedia", "tavolo", "porta", "finestra", "letto",
    "sogno", "vita", "gioia", "paura", "forza", "luce", "ombra", "risata", "pianto", "gioco",
    "corsa", "volo", "salto", "cammino", "scrivo", "leggo", "corro", "penso", "creo", "disegno",
    "gatto", "cane", "uccello", "pesce", "tigre", "lupo", "orso", "volpe", "rana", "ape",
    "rosso", "blu", "verde", "giallo", "nero", "bianco", "grigio", "marrone", "chiaro", "scuro",
    "veloce", "lento", "alto", "basso", "forte", "debole", "caldo", "freddo", "facile", "difficile",
    "oggi", "domani", "ieri", "sempre", "mai", "subito", "dopo", "prima", "spesso", "quasi",
    "andare", "venire", "stare", "vedere", "sapere", "volere", "potere", "dire", "parlare", "ascoltare"
);

public String getRandom(){
    return words.get(new Random().nextInt(words.size()));
}

Timer timer = new Timer();

public void startTimer(){
    timer.scheduleAtFixedRate(new TimerTask() {

        
        @Override
        public void run() {
            
        }
        
    }, delay, remainingTime);
}
}
