package com.commons.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commons.app.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
