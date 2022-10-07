package com.College.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.College.Entity.CollegeEntity;

public interface CollegeRepo extends  JpaRepository<CollegeEntity, Integer> {



}
