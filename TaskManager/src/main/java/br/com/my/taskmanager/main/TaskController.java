package br.com.my.taskmanager.main;

import br.com.my.taskmanager.exceptions.EmptyException;
import br.com.my.taskmanager.initialize.ApplyCss;
import br.com.my.taskmanager.initialize.InitializeTypeSelect;

import br.com.my.taskmanager.main.controllers.SelectAllDays;
import br.com.my.taskmanager.models.data.create.Data;
import br.com.my.taskmanager.models.data.manager.DataLoad;
import br.com.my.taskmanager.models.data.manager.DataSave;
import br.com.my.taskmanager.models.input.validation.IsLetter;
import br.com.my.taskmanager.models.input.validation.IsNumber;
import br.com.my.taskmanager.models.input.validation.Validation;
import br.com.my.taskmanager.models.list.TaskList;
import br.com.my.taskmanager.models.task.CreateTask;
import br.com.my.taskmanager.models.task.Task;
import br.com.my.taskmanager.models.input.AllInterfaceInput;
import br.com.my.taskmanager.models.data.create.TaskData;
import br.com.my.taskmanager.models.task.ViewTasks;
import br.com.my.taskmanager.models.verifiers.ChainCheck;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;


public class TaskController {
    @FXML
    private Label pleaseSelectADay;
    @FXML
    private Pane addTasksView;
    @FXML
    private TableView<Task> tableViewTasks;
    @FXML
    private TextField taskNameField;
    @FXML
    private ComboBox<String> taskSelectType;
    @FXML
    private TextField taskHoursField;
    @FXML
    private GridPane gridSelectDays;

    private AllInterfaceInput allInterfaceInput;
    private InitializeTypeSelect initializeTypeSelect = new InitializeTypeSelect();
    private TaskList taskList = new TaskList();
    private Validation isLetter = new IsLetter();
    private Validation isNumber = new IsNumber();

    @FXML
    public void initialize() {
        ApplyCss applyCss = new ApplyCss();
        applyCss.Fonts(gridSelectDays);

        initializeTypeSelect.typeSelect(taskSelectType);

        DataLoad dataLoad = new DataLoad();
        try {
            dataLoad.load(taskList);
        } catch (IOException e) {

        }

        allInterfaceInput = new AllInterfaceInput(taskNameField, taskSelectType, taskHoursField, gridSelectDays);

        onKeyTypedNameField();
        onKeyTypedHoursField();
    }

    @FXML
    protected void onKeyTypedNameField() {
        isLetter.verify(taskNameField);
    }

    @FXML
    protected void onKeyTypedHoursField() {
        isNumber.verify(taskHoursField);
    }

    @FXML
    protected void onViewTask() {
        addTasksView.setVisible(false);
        tableViewTasks.setVisible(true);
        ViewTasks.showTask(taskList, tableViewTasks);

    }

    @FXML
    protected void onAddTask() {
        tableViewTasks.setVisible(false);
        addTasksView.setVisible(true);
    }

    @FXML
    protected void onCreateTask() {
        try {
            Data data = new TaskData(allInterfaceInput);
            CreateTask createTask = new CreateTask();
            createTask.create(data, taskList);
            ChainCheck chainCheck = new ChainCheck();
            chainCheck.chainVerify(data);
            DataSave save = new DataSave();
            try {
                save.Save(taskList);
            } catch (IOException e) {
            }
        } catch (EmptyException e) {
        }
    }

    @FXML
    protected void allCheckBox() {
        SelectAllDays.allDays(gridSelectDays);
    }
}
