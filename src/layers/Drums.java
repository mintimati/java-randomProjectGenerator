package layers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class Drums extends ArrayList {

        protected Random rc = new Random();


        private ArrayList<String> drums() {
        ArrayList<String> space = new ArrayList<>(List.of(
                "Vacuum", "Room", "Large", "Space"));
        ArrayList<String> texture = new ArrayList<>(List.of(
                "Deep", "Regular", "Dull"));
        Integer amount = rc.nextInt(1, 5);
        Integer seed = rc.nextInt(1, 20);

        ArrayList<String> restrictions = new ArrayList<>
                (List.of("Just metals", "No four-on-floor kick",
                        "Strictly house/techno",
                        "Breakdown required", "Drop required",
                        "LoFi"));

            /* the above code is a list of various characteristics
             * that can be assigned to the drums - seed rolls a d20, if 15
             * is rolled, a restriction will be added to the final object
             */

        ArrayList<String> returnedDrums = new ArrayList<>(List.of(
                amount.toString(),
                space.get(rc.nextInt(0, space.size())),
                texture.get(rc.nextInt(0, texture.size()))));

        if(seed > 17) {
            returnedDrums.add(restrictions.get(rc.nextInt(0, restrictions.size())));
        }

            /* the above code adds a randomised set of characteristics to a
             * string arraylist, and returns it below.
             */
        return returnedDrums;
    }

}





