package br.com.my.taskmanager.main;

import br.com.my.taskmanager.initialize.LoadCss;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TaskManager extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, NullPointerException{
        FXMLLoader fxmlLoader = new FXMLLoader(TaskManager.class.getResource("interface-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Task Manager");
        stage.show();
        String css = new LoadCss().getCss(scene);
        scene.getStylesheets().add(css);
    }
}
