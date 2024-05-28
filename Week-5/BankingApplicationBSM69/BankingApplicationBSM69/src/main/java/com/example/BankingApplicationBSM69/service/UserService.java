package com.example.BankingApplicationBSM69.service;

import java.util.List;

import com.example.BankingApplicationBSM69.dto.UserRequest;
import com.example.BankingApplicationBSM69.exceptionHandler.UserNotFoundException;
import com.example.BankingApplicationBSM69.model.User;

public interface UserService {

	public User saveUser(UserRequest userRequest);

	public List<User> getAllUsers();

	public User getUser(Integer id) throws UserNotFoundException;

	public User getUserByEmail(String email) throws UserNotFoundException;

	public List<User> getUserByMobile(String mobile) throws UserNotFoundException;

	public List<User> getUserByGender(String mobile) throws UserNotFoundException;

	public List<User> getUserByAge(Integer age) throws UserNotFoundException;

	public List<User> getUserByNationality(String nationality) throws UserNotFoundException;

}
