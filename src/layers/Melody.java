package layers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Melody {
     protected Random rc = new Random();
     String shape;
     ArrayList<String> shapes =
             new ArrayList(List.of(
                     "Arpeggiated",
                     "Long note", "Staccato",
                     "Polyphonic", "Monophonic",
                     "Anthem", "Alien",
                     "Happy", "Sad",
                     "Microtonal", "Nostalgic"
             ));

     String[] texture = new String[1];
     ArrayList<String> textures =
             new ArrayList<>(List.of(
                     "Detuned", "Reverberated",
                     "Delayed", "Crystallic",
                     "FM", "Growling",
                     "Soft/filtered", "Distorted",
                     "Acid/Resonance", "Hollow"
             ));
     //the above are possible flavours

     //constructor
     StringBuilder Melody() {
          for(int i = 0; i < 1; i++) {
               int pick = rc.nextInt(0, textures.size());
               this.texture[i] = textures.get(pick);
               textures.remove(pick);
          }
          //the above picks two textures at random
          this.shape = shapes.get(rc.nextInt(0, shapes.size()));
          //the above picks a random shape
          return new StringBuilder(
                 String.format("Shape: %s\nTextures: %s, %s", shape, texture[0], texture[1]));
     }
}
