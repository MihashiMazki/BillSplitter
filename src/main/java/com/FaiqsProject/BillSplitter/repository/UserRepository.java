package com.FaiqsProject.BillSplitter.repository;

import com.FaiqsProject.BillSplitter.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
