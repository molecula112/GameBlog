package com.ybondarenko.blog.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Lob
    @Column
    private String content;
    @Column
    private String createdOn;
    @Column
    private String updatedOn;
    @Column
    private String fromWho;
}
