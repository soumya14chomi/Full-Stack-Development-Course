package com.example.BankingApplicationBSM69.service;

import java.util.List;

import com.example.BankingApplicationBSM69.model.Employee;

public interface EmployeeService {

	public Employee save(Employee emp);

	public Employee getById(Integer id);

	public List<Employee> getAll();

	public void delete(Integer id);

	public Employee update(Employee emp);
}
