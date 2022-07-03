package com.example.courseproject.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="expense")
@Data
public class Expense {
    @Id
    private long id;
    private Instant expensedate;
    private String descript;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;

}
