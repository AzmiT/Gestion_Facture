package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
