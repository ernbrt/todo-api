package com.example.todoapi.service.task;

public class TaskEntityNotFountException extends RuntimeException{

    private long taskId;

    public TaskEntityNotFountException(long taskId) {
        super("TaskEntity (id = " + taskId + ") is not found");
        this.taskId = taskId;
    }
}
