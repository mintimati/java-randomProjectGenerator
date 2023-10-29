package layers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Drums {

    private Random rc = new Random();
    private String space;
    private ArrayList<String> spaces = new ArrayList<>(List.of(
            "Vacuum", "Room", "Large", "Space"));
    private String texture;
    private ArrayList<String> textures = new ArrayList<>(List.of(
            "Deep", "Regular", "Dull"));
    private Integer amount;
    private Integer seed;

    private ArrayList<String> restriction = new ArrayList<>();
    private ArrayList<String> restrictions = new ArrayList<>
            (List.of("Just metals", "No four-on-floor kick",
                    "Strictly house/techno",
                    "Breakdown required", "Drop required",
                    "LoFi"));

    /* the above code is a list of various characteristics
     * that can be assigned to the drums - seed rolls a d20, if 15
     * is rolled, a restriction will be added to the final object
     */

    public Drums() {
        this.amount = rc.nextInt(1, 6);
        this.space = spaces.get(rc.nextInt(0, spaces.size()));
        this.texture = textures.get(rc.nextInt(0, textures.size()));
        this.seed = rc.nextInt(0, 20);

        if (this.seed > 8) {
            restriction.add(restrictions.get(rc.nextInt(0, restrictions.size())));
        }
        else if (this.seed > 15) {
            restriction.add(restrictions.get(rc.nextInt(0, restrictions.size())));
        }
        else if (this.seed <= 8) {
            this.restriction = null;
        }
    }

    public StringBuilder getResult() {
        StringBuilder result = new StringBuilder(
            String.format("%o pieces\nSpace: %s\nTexture: %s", this.amount, this.space,
                    this.texture));
        if(this.restriction != null) {
            result.append(String.format("\n%s", this.restriction));
        }

        return result;
    }

}





