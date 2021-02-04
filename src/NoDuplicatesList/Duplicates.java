package NoDuplicatesList;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("black");colors.add("black");colors.add("black");colors.add("black");
        colors.add("blue");
        colors.add("red");colors.add("red");colors.add("red");
        colors.add("grey");colors.add("grey");
        colors.add("orange");colors.add("orange");colors.add("orange");colors.add("orange");colors.add("orange");
        colors.add("violet");
        colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");colors.add("lightblue");        
        colors.add("brown");colors.add("brown");
        colors.add("yellow");
        
        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < colors.size()-1; j++) {
                if (colors.get(j).equals(colors.get(j+1))) {
                    colors.remove(j);
                }
            }
        }
        System.out.println("colors: " + colors);
    }

}
