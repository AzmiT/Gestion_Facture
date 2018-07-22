package com.example.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ArticleRepository;
import com.example.entities.Article;

@Service
public class ArticleMetierImp implements ArticleMetier
{
	@Autowired
    private ArticleRepository articleRepository;

	
	@Override
	public Optional<Article> getArticleById(Long id) {
		  
		return articleRepository.findById(id);
	}

	@Override
	public Article saveArticle(Article article) {
		
        return articleRepository.save(article);
	}

	@Override
	public Article updateArticle(long id , Article article) {
		
		article.setIdArticle(id);
        return articleRepository.save(article);       
	}

	@Override
	public void deleteArticle(long id) {
		
        articleRepository.deleteById(id);
	}

	@Override
	public List<Article> getAllArticles() {
		
	       return articleRepository.findAll();	}
   
   
}
