package com.example.courseproject.expense.repository;

import com.example.courseproject.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository <Category,Long>{
    Category findByName(String name);

}
