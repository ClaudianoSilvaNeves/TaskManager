package br.com.my.taskmanager.models.list;

import br.com.my.taskmanager.models.task.Task;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> showTaskList() {
        if (!taskList.isEmpty()) {
            return this.taskList;
        } else {
            throw new ArrayIndexOutOfBoundsException("Empty array");
        }
    }

    public void addToTaskList(Task task) {
        this.taskList.add(task);
    }

    public void removeFromList(int remove) {
        if (taskList.size() <= remove) {
            this.taskList.remove(remove - 1);
        } else {
            throw new ArrayIndexOutOfBoundsException("Out of bounds");
        }
    }
}
