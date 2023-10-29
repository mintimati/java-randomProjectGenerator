package main;

import layers.Drums;
import layers.Instruments;
import layers.Melody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandProject {
    protected Random rc = new Random();
    private ArrayList<String> moods = new ArrayList(List.of(
       "Pensive", "Happy", "Energetic", "Angry", "Depressing",
            "Calm", "Anxious", "Content", "Frantic", "Nostalgic"
    ));

    private ArrayList<String> signatures = new ArrayList(List.of(
            "4/4", "3/4", "5/7", "2/4", "6/8", "5/4"
    ));

    private Drums drums;
    private Melody melody;
    private int tempo;
    private int maxTracks;
    private String mood;
    private String timeSignature;
    private Instruments instruments;

    public RandProject() {
        this.drums = new Drums();
        this.melody = new Melody();
        this.instruments = new Instruments();
        this.tempo = rc.nextInt(80, 145);
        this.maxTracks = rc.nextInt(3, 12);
        this.mood = moods.get(rc.nextInt(0, moods.size()));
        this.timeSignature = signatures.get(rc.nextInt(0, signatures.size()));
    }

    public StringBuilder getProjectDetails() {
        var result = new StringBuilder();
        result.append(String.format("//GENERAL DETAILS//\nTempo: %s\nMaximum tracks: %s\n", this.tempo, this.maxTracks));
        result.append(String.format("Mood: %s\nTime signature: %s\n\n", this.mood, this.timeSignature));
        result.append(String.format("//DRUMS//\n%s\n\n//INSTRUMENTS//\n%s\n//MELODY//\n%s\n", this.drums.getResult(), this.instruments.getResult(), this.melody.getResult()));
        return result;
    }

}