package com.CRUD.CRUD.Operation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.CRUD.Operation.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
