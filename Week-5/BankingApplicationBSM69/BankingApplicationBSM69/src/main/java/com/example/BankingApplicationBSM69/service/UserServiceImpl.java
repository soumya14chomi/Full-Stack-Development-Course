package com.example.BankingApplicationBSM69.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankingApplicationBSM69.dto.UserRequest;
import com.example.BankingApplicationBSM69.exceptionHandler.UserNotFoundException;
import com.example.BankingApplicationBSM69.model.User;
import com.example.BankingApplicationBSM69.respository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(UserRequest userRequest) {

//		User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
//				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());

		User user = new User();
		user.setName(userRequest.getName());
		user.setAge(userRequest.getAge());
		user.setEmail(userRequest.getEmail());
		user.setGender(userRequest.getGender());
		user.setMobile(userRequest.getMobile());
		user.setNationality(userRequest.getNationality());

		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub

		return userRepository.findAll();
	}

	@Override
	public User getUser(Integer id) throws UserNotFoundException {

		// TODO Auto-generated method stub
		User user = userRepository.findByUserId(id);

		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("No user found with id:" + id);
		}
	}

	@Override
	public User getUserByEmail(String email) throws UserNotFoundException {
		// TODO Auto-generated method stub

		User user = userRepository.findByEmail(email);
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("No user Exists with email: " + email);
		}
	}

	@Override
	public List<User> getUserByMobile(String mobile) throws UserNotFoundException {

		List<User> users = userRepository.findByMobile(mobile);

		if (users != null && users.size() != 0) {
			return users;
		} else {
			throw new UserNotFoundException("No user with mobile: " + mobile);
		}

	}

	@Override
	public List<User> getUserByGender(String gender) throws UserNotFoundException {

		List<User> users = userRepository.findByGender(gender);

		if (users != null && users.size() != 0) {
			return users;
		} else {
			throw new UserNotFoundException("No user with gender: " + gender);
		}
	}

	@Override
	public List<User> getUserByAge(Integer age) throws UserNotFoundException {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findByAge(age);

		if (users != null && users.size() != 0) {
			return users;
		} else {
			throw new UserNotFoundException("No user with age: " + age);
		}
	}

	@Override
	public List<User> getUserByNationality(String nationality) throws UserNotFoundException {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findByNationality(nationality);

		if (users != null && users.size() != 0) {
			return users;
		} else {
			throw new UserNotFoundException("No user with nationality: " + nationality);
		}
	}

}
