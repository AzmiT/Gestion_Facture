package com.example.metier;

import java.util.List;
import java.util.Optional;

import com.example.entities.Article;

public interface ArticleMetier {

	Optional<Article> getArticleById(Long id);

	Article saveArticle(Article article);

	Article updateArticle(long id, Article article);

	void deleteArticle(long id);

	List<Article> getAllArticles();

   

}
