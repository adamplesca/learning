import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL{

    public static void main(String[] args) {
        
        //learning/revision of arraylists 
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Steak");
        shoppingList.add("Bread");

        //shoppingList.set(0, "Cheese");
        //shoppingList.clear();

        for(int i = 0; i < shoppingList.size(); i++){
            JOptionPane.showMessageDialog(null, shoppingList.get(i));
        }

    }
}