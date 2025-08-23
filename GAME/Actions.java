package GAME;
import java.util.HashMap;
import java.util.Map;
public class Actions {
    static Map<Integer,Integer> teleports = new HashMap<>();
    static{
    teleports.put(4,14);
    teleports.put(17,7);
    teleports.put(9,31);
    teleports.put(1,38);
    teleports.put(62,19);
    teleports.put(21,42);
    teleports.put(28,84);
    teleports.put(87,36);
    teleports.put(54,34);
    teleports.put(64,60);
    teleports.put(51,67);
    teleports.put(72,91);
    teleports.put(93,73);
    teleports.put(94,75);
    teleports.put(98,79);
    teleports.put(80,99);
    }
    static void teleport(Player p)
    {
        if(teleports.containsKey(p.position)){
            p.position = teleports.get(p.position);
            Controller.go(p,p.position);
        }
    }
}
