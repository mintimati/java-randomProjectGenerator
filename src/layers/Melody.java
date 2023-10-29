package layers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Melody {
     protected Random rc = new Random();
     public StringBuilder result = new StringBuilder();
     private ArrayList<String> texture = new ArrayList<>();
     private String shape;

     private ArrayList<String> shapes =
             new ArrayList(List.of(
                     "Arpeggiated",
                     "Long note", "Staccato",
                     "Polyphonic", "Monophonic",
                     "Anthem", "Alien",
                     "Happy", "Sad",
                     "Microtonal", "Nostalgic"
             ));
     private ArrayList<String> textures =
             new ArrayList<>(List.of(
                     "Detuned", "Reverberated",
                     "Delayed", "Crystallic",
                     "FM", "Growling",
                     "Soft/filtered", "Distorted",
                     "Acid/Resonance", "Hollow",
                     "Chorus/Flanger"
             ));
     //the above are possible flavours

     //constructor
     public Melody() {


          for(int i = 0; i < 2; i++) {
               int pick = rc.nextInt(0, textures.size());
               this.texture.add(this.textures.get(pick));
               this.textures.remove(pick);
          }
          //the above picks two textures at random
          this.shape = this.shapes.get(rc.nextInt(0, shapes.size()));
          //the above picks a random shape
          this.result.append(String.format("Shape: %s\nTextures: %s, %s", shape, this.texture.get(0), this.texture.get(1)));
     }

     public StringBuilder getResult() {
          return this.result;
     }
}
