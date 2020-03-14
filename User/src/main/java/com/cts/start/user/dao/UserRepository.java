package com.cts.start.user.dao;



import com.cts.start.user.pojo.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User,String> {

	Iterable<User> findAll();

	
	User findByUsernameAndPasswordAndConfirmed(String username, String password, String string);

	Optional<User> findByEmail(String emailId);

}
