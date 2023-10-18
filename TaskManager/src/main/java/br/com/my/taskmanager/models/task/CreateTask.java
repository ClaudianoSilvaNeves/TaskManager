package br.com.my.taskmanager.models.task;

import br.com.my.taskmanager.models.data.create.AllData;
import br.com.my.taskmanager.models.data.create.Data;
import br.com.my.taskmanager.models.list.TaskList;

public class CreateTask {
    public void create(Data data, TaskList taskList) {
        Task task = new Task(data);
        taskList.addToTaskList(task);
    }

    public void create(AllData allData, TaskList taskList) {
        Task task = new Task(allData);
        taskList.addToTaskList(task);
    }
}
