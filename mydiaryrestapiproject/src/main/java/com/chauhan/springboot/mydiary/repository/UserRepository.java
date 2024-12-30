package com.chauhan.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhan.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
