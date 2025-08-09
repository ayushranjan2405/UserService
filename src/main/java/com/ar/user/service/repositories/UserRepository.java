package com.ar.user.service.repositories;

import com.ar.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    //Implement any custom method/query
}
