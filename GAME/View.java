package GAME;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
public class View {
    public static HBox h = new HBox();
    public static Pane sp = new Pane() ;
    public static Button btn = new Button("MOVE");
    static void show(Stage stage)
    {

        Image img = new Image(View.class.getResource("img.jpg").toExternalForm());//check Beshe
        ImageView imgview = new ImageView(img);
        
        imgview.setFitWidth(600);
        imgview.setFitHeight(600);
        sp.setPrefSize(600, 600);
        Circle c = new Circle (30);
        c.setLayoutX(330);
        c.setLayoutY(570);
        sp.getChildren().addAll(imgview,c) ;
       btn.setDisable(true);
        h.getChildren().addAll(sp,btn);
        Scene sc = new Scene(h,600,600) ;
        stage.setScene(sc);
        stage.show();
    }
}
