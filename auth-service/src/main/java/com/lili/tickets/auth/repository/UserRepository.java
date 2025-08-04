package com.lili.tickets.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lili.tickets.auth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
