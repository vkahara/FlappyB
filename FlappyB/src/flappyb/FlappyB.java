/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappyb;

import javafx.scene.layout.StackPane;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;

public class FlappyB extends Application {

    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//           
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });

        Circle circle = new Circle(10, Color.BLUE);

        circle.relocate(0, 100);

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        //haisevaa nettikoodia
        Bounds bounds = root.getBoundsInLocal();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10),
                new KeyValue(circle.layoutXProperty(), bounds.getMaxX() - circle.getRadius())));
        timeline.setCycleCount(2);
        timeline.play();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

