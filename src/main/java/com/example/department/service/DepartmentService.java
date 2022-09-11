package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    public DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Integer departmentId) {

        return departmentRepository.findDepartmentById(departmentId);
    }

    public List<Department> list() {
        return departmentRepository.findAll();
    }

    public void delete(Integer id) {
      departmentRepository.deleteById(id);
    }
}
