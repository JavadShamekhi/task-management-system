package com.example.taskmanagementsystemdemo.repository;

import com.example.taskmanagementsystemdemo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
