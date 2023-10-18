package br.com.my.taskmanager.models.task;

import br.com.my.taskmanager.exceptions.EmptyException;
import br.com.my.taskmanager.models.list.TaskList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewTasks {
    public static void showTask(TaskList taskList, TableView<Task> tableView) {
        try {
            if (taskList != null) {
                ObservableList<Task> observableList = FXCollections.observableArrayList(taskList.showTaskList());
                tableView.setItems(observableList);

                TableColumn<Task, String> name = new TableColumn<>("name");
                TableColumn<Task, String> type = new TableColumn<>("type");
                TableColumn<Task, String> time = new TableColumn<>("time");
                TableColumn<Task, String> days = new TableColumn<>("days");
                TableColumn<Task, String> concluded = new TableColumn<>("concluded");

                name.setCellValueFactory(new PropertyValueFactory<>("name"));
                type.setCellValueFactory(new PropertyValueFactory<>("type"));
                time.setCellValueFactory(new PropertyValueFactory<>("time"));
                days.setCellValueFactory(new PropertyValueFactory<>("days"));
                concluded.setCellValueFactory(new PropertyValueFactory<>("concluded"));

                if (tableView.getColumns().isEmpty()) {
                    tableView.getColumns().addAll(name, type, time, days, concluded);
                }
            } else {
                throw new EmptyException("Nothing here");
            }
        } catch (EmptyException | ArrayIndexOutOfBoundsException e) {
        }
    }
}
