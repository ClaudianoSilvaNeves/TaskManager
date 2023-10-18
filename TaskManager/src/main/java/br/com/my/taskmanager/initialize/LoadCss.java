package br.com.my.taskmanager.initialize;

import javafx.scene.Scene;

public class LoadCss {
    public String getCss(Scene scene) throws NullPointerException{
        return getClass().getResource("Style.css").toExternalForm();
    }
}
