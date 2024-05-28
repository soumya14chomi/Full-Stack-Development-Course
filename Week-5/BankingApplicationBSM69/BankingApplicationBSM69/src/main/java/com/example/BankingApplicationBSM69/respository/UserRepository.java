package com.example.BankingApplicationBSM69.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApplicationBSM69.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

	User findByEmail(String email);

	List<User> findByMobile(String mobile);

	List<User> findByGender(String gender);

	List<User> findByAge(Integer age);

	List<User> findByNationality(String nationality);

}
