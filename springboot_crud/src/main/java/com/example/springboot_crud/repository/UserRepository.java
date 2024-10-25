package com.example.springboot_crud.repository;

import com.example.springboot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}