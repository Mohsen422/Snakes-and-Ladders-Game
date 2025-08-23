
package GAME;
import java.util.Random;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ai_player extends Player {
    Ai_player(String Name , String color)
    {
        this.name = Name ;
        this.piece = new Circle(30) ;
        this.piece.setFill(Color.RED);
    }
    public void act()
    {
        Random rand = new Random() ;
        position = position + rand.nextInt(6)+1;
        Controller.go(this,position);
        System.out.println(this.name + position);
        Controller.turn =  Controller.turn + 1 ;
    }

}
