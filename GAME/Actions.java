package GAME;
import java.util.HashMap;
import java.util.Map;
public class Actions {
    static Map<Integer,Integer> teleports = new HashMap<>();
    static{
    teleports.put(17,6);
    teleports.put(62,19);
    teleports.put(54,34);
    teleports.put(87,36);
    teleports.put(64,60);
    teleports.put(93,73);
    teleports.put(94,75);
    teleports.put(98,79);
    teleports.put(31,9);
    teleports.put(38,1);
    teleports.put(42,21);
    teleports.put(28,84);
    teleports.put(84,28);
    teleports.put(67,51);
    teleports.put(91,72);
    teleports.put(99,80);

    }
    static void teleport(Player p)
    {
        if(teleports.containsKey(p.position)){
            p.position = teleports.get(p.position);
            Controller.go(p,p.position);
        }
    }
}
