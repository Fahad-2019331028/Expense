package com.example.courseproject.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "`user`")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

}
