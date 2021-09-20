package com.amdocs.training.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.training.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
}

