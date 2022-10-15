package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserLogin;

@Repository
public interface LoginRepo extends JpaRepository<UserLogin,Long>{
	
	@Query(value = "select * from users where name=?1 and password=?2",nativeQuery=true)
	User login(String name, String password);
	
}
