package com.coder.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.coder.spring.entity.Users;

public interface UserRepository extends CrudRepository<Users, String> {

}
