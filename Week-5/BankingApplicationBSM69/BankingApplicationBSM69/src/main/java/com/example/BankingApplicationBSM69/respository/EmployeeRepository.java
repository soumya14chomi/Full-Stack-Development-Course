package com.example.BankingApplicationBSM69.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankingApplicationBSM69.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
