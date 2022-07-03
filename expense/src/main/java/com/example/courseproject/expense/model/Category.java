package com.example.courseproject.expense.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {
    @Id
    private long id;
    private String name;
    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;
}
