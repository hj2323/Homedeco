package com.teamproject.teamproject01.repository;

import com.teamproject.teamproject01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
