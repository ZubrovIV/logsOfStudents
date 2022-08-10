package ru.logs.models;

import java.util.Date;

public class Logs {
    private int logsId;
    private int id;
    private String message;
    private String date;

    public Logs(int logsId, int id, String message, String date) {
        this.logsId = logsId;
        this.id = id;
        this.message = message;
        this.date = date;
    }

    public Logs() {
    }

    public int getLogsId() {
        return logsId;
    }

    public void setLogsId(int logsId) {
        this.logsId = logsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "logsId=" + logsId +
                ", id=" + id +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
