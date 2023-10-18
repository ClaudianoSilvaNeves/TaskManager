module br.com.my.taskmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    exports br.com.my.taskmanager.main to javafx.graphics;
    opens br.com.my.taskmanager.main to javafx.fxml;

    exports br.com.my.taskmanager.models.task;
    opens br.com.my.taskmanager.models.task;
}