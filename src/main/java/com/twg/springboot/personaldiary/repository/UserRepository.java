package com.twg.springboot.personaldiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.personaldiary.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
