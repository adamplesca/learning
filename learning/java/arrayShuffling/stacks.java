import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        
        //LIFI data structure, like a vertical ArrayList
        

        Stack<String> games = new Stack<>();

        games.push("Minecraft"); //3
        games.push("COD4"); //2
        games.push("Mario Kart"); //1
        games.push("Pokemon"); //latest item //0

       //System.out.print(games.empty());

       //System.out.print(games);

       games.pop(); //removes from top so index 0 (pokemon)

       System.out.print(games); 

       System.out.println(games.peek()); //shows top element
       
       System.out.println(games.search("COD4")); //searches index postition of item

       for(int i=0; i < 10; i++){
            games.push("Game "+i);
       }

       System.out.println(games); 
    }
}
