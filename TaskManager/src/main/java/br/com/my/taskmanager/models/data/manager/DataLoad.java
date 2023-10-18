package br.com.my.taskmanager.models.data.manager;

import br.com.my.taskmanager.models.data.create.AllData;
import br.com.my.taskmanager.models.list.TaskList;
import br.com.my.taskmanager.models.task.CreateTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoad {
    private String line;
    private String name;
    private String type;
    private String days;
    private int time;
    private boolean concluded = false;

    public void load(TaskList taskList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Data_files.txt"));
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String fieldName = parts[0].trim();
                String fieldValue = parts[1].trim();
                switch (fieldName) {
                    case "Name" -> this.name = fieldValue;
                    case "Type" -> this.type = fieldValue;
                    case "Time" -> this.time = Integer.parseInt(fieldValue);
                    case "Days" -> this.days = fieldValue;
                    case "Concluded" -> this.concluded = Boolean.parseBoolean(fieldValue);
                }
            } else if (line.isEmpty()) {
                AllData allData = new AllData(name, type, days, time, concluded);
                CreateTask createTask = new CreateTask();
                createTask.create(allData, taskList);
            }
        }
        bufferedReader.close();
    }
}
