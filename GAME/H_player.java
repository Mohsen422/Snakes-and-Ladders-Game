package GAME;

import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class H_player extends Player {
    H_player(String Name , String color)
    {
        this.name = Name ;
        this.piece = new Circle(30) ;
        this.piece.setFill(Color.BLUE);
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
