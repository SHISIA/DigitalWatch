package watch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    private  double xOffset=0;
    private double yOffset=0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/Time.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setResizable(false);
        primaryStage.setTitle("ClockJ");
        primaryStage.getIcons().add(new Image("images/clock2.png"));
        primaryStage.centerOnScreen();
        primaryStage.setOnCloseRequest(e-> System.exit(0));
        scene.setOnMousePressed(MouseEvent->{
            xOffset=MouseEvent.getSceneX();
            yOffset=MouseEvent.getSceneY();
        });
        scene.setOnMouseDragged(MouseEvent->{
            primaryStage.setX(MouseEvent.getScreenX()-xOffset);
            primaryStage.setY(MouseEvent.getScreenY()-yOffset);
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
