

package GAME;
import java.util.Random;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.Group;
public class Ai_player extends Player {
    Ai_player(String Name , String color)
    {
        this.name = Name ;
        this.cr = new Circle(30) ;
        this.piece = new Group();
        this.cr.setFill(Color.RED);
        Text text = new Text("AI");
        text.setFill(Color.WHITE);
        text.setX(cr.getCenterX() - 10);
        text.setY(cr.getCenterY() + 5);
        this.piece.getChildren().add(cr);
        this.piece.getChildren().add(text);
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

