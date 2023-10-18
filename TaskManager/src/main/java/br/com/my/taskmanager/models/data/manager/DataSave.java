package br.com.my.taskmanager.models.data.manager;

import br.com.my.taskmanager.models.list.TaskList;
import br.com.my.taskmanager.models.task.Task;

import java.io.FileWriter;
import java.io.IOException;

public class DataSave {
    public void Save(TaskList taskList) throws IOException {
        FileWriter fileWriter = new FileWriter("Data_files.txt");
        for(Task task : taskList.showTaskList()) {
            fileWriter.write("Name: " + task.getName() + "\n" +
                                 "Type: " + task.getType() + "\n" +
                                 "Days: " + task.getDays() + "\n" +
                                 "Time: " + task.getTime() + "\n" +
                                 "Concluded: " + task.isConcluded() + "\n\n"
                            );
        }
        fileWriter.close();
    }
}
