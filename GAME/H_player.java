package GAME;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class H_player extends Player {
    H_player(String Name , String color)
    {
        this.name = Name ;
        this.cr = new Circle(30) ;
        this.piece = new Group();
        this.cr.setFill(Color.BLUE);
        Text text = new Text("YOU");
        text.setFill(Color.WHITE);
        text.setX(cr.getCenterX() - 10);
        text.setY(cr.getCenterY() + 5);
        this.piece.getChildren().add(cr);
        this.piece.getChildren().add(text);
    }
    public void act()
    {
        View.btn.setDisable(false);
        View.btn.setOnAction(e->{
            Random rand = new Random() ;
            position = position + rand.nextInt(6)+1;
            System.out.println(this.name + position);
            Controller.go(this,position);
            View.btn.setDisable(true);
            Controller.turn =  Controller.turn + 1 ;
        });
        
    }
}
