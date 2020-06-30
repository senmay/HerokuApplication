package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Entity(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name")
    private String title;

    @Column(name = "description")
    private String content;
}