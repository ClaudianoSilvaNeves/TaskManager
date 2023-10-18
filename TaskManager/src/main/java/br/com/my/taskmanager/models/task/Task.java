package br.com.my.taskmanager.models.task;

import br.com.my.taskmanager.models.data.create.AllData;
import br.com.my.taskmanager.models.data.create.Data;

public class Task {
    private String name;
    private String type;
    private String days;
    private int time;
    private boolean concluded;

    public Task(Data data) {
        this.name = data.getName();
        this.type = data.getType();
        this.days = data.getDays();
        this.time = data.getTime();
        this.concluded = data.getConcluded();
    }

    public Task(AllData allData) {
        this.name = allData.name();
        this.type = allData.type();
        this.days = allData.days();
        this.time = allData.time();
        this.concluded = allData.concluded();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", days='" + days + '\'' +
                ", time=" + time +
                ", concluded=" + concluded +
                '}';
    }
}
