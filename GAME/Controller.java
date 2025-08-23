package GAME;
import java.util.List;
import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
public class Controller {
    Player current ;
    boolean isRuning = true ;
    static int turn = 0 ;
    List<Player> players = new ArrayList<>() ;
    Controller(List p){
        players = p;
    }
    void run() {
        
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
            if (turn >= players.size())
            {
                turn = 0 ;
            }
            current = players.get(turn);
            current.act();
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    public static void go(Player p ,int pos)
    {
        if(!p.inGame && pos == 6 )
        {
            p.piece.setLayoutX(30);
            p.piece.setLayoutY(570);
            View.sp.getChildren().add(p.piece);
            p.inGame = true;
            p.position = 1 ;
        }
        else if (!p.inGame && pos != 6)
        {
            p.position = 0 ;
        }
        else{
            System.out.println(pos);
            int i = pos % 10 ;
            int j = pos / 10 ;
            if (i == 0)
            {
                if (j % 2 == 0 )
                {
                    p.piece.setLayoutX(30);
                    p.piece.setLayoutY((10-j)*60+30);
                }
                else{
                    p.piece.setLayoutX(570);
                    p.piece.setLayoutY((10-j)*60+30);
                }
            }
           else if(j % 2 == 0)
           {
                    p.piece.setLayoutX((i-1)*60+30);
                    p.piece.setLayoutY((9-j)*60+30);
           }
           else if(j % 2 != 0){
            p.piece.setLayoutX(600-(i-1)*60-30);
            p.piece.setLayoutY((9-j)*60+30);
           }
           
        }
        Actions.teleport(p);
    }
}