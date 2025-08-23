package GAME;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static Player p1 = new Ai_player("a","RED");
    public static Player p2 = new H_player("b","BLUE");
    public static void main(String[] args) {
        
        launch(args);
        
        
    }
    public void start(Stage stage)
    {
        View.show(stage);
        List<Player> players = new ArrayList<>();
        players.add(p2);
        players.add(p1);
        Controller c = new Controller(players);
        c.run();
    }
}
