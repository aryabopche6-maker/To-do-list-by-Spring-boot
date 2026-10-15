package com.app.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.todoapp.models.Task;


 //task=entity name, long=primary key name
public interface TaskRepository  extends JpaRepository<Task, Long> {
}
