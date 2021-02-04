package NoDuplicatesList;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("yellow");colors.add("purple");colors.add("brown");
        colors.add("black");colors.add("black");colors.add("black");colors.add("black");
        colors.add("blue");colors.add("brown");
        colors.add("red");colors.add("red");colors.add("red");colors.add("brown");
        colors.add("grey");colors.add("grey");
        colors.add("orange");colors.add("orange");colors.add("brown");colors.add("orange");colors.add("yellow");colors.add("orange");colors.add("orange");
        colors.add("violet");colors.add("black");
        colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("yellow");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");        
        colors.add("brown");colors.add("brown");
        colors.add("yellow");
        colors.add("black");colors.add("black");colors.add("black");
        
        for(int k = 0; k < colors.size(); k++){
            for (int i = 0; i < colors.size(); i++) {
                for (int j = i+1; j < colors.size(); j++) {
                    if (colors.get(i).equals(colors.get(j))) {
                        colors.remove(j);
                    }
                }
            }
        }
        System.out.println("colors: " + colors);
    }

}
