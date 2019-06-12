package com.example.demoapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jmohanta
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
