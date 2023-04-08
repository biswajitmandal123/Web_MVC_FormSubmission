package com.biswajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswajit.entity.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity, Integer>{

}
