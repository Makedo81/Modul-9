package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToe extends Application  {

    private Image imageBack = new Image("file:plan.jpg");
    private Image card = new Image("file:card.jpg");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {

        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {

//            Group root = new Group();
//            Scene scene = new Scene(root,300,300,Color.DARKGREY);
//            Rectangle r = new Rectangle(25,25,250,250);
//            r.setFill(Color.LIGHTGRAY);
//            root.getChildren().add(r);
        BackgroundSize backgroundSize = new BackgroundSize(100,100,true,true,true,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);

        Background background = new Background(backgroundImage);
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5,12.5,13.5,14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        cards.getChildren().add(img);

        grid.add(cards,0,0,3,1);

        Scene scene = new Scene(grid,1600,900, Color.LIGHTGREY);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}



