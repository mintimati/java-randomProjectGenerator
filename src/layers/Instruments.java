package layers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Instruments {
    private Random rc = new Random();
    private ArrayList<String> chosenInstruments = new ArrayList<>();
    private ArrayList<String> instruments = new ArrayList<>(List.of(
            "Pads", "Lead", "Plucks", "Keys", "Bass (hard)", "Bass (soft)",
            "Noise", "SFX"
    ));

    public Instruments() {
        int number = rc.nextInt(1, 4);
        for(int i = 0; i < number; i++) {
            var currentInstrument = instruments.get(rc.nextInt(0, instruments.size()));
            chosenInstruments.add(currentInstrument);
            this.instruments.remove(currentInstrument);
        }
    }

    public StringBuilder getResult() {
        var result = new StringBuilder();
        chosenInstruments.forEach(e -> result.append(e + "\n"));
        return result;
    }
}
