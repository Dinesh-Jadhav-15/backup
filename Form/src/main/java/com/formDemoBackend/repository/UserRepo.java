package com.formDemoBackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.formDemoBackend.model.User;

public interface UserRepo extends  JpaRepository<User,Integer> {

	
}
