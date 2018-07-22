package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Article;
import com.example.metier.ArticleMetier;

@RestController
@CrossOrigin("*")
public class ArticleServices {
	
	
	@Autowired
private ArticleMetier articleMetier;

	@RequestMapping(value="/Article",method=RequestMethod.GET)
	public List<Article> getAllArticles() {
		return articleMetier.getAllArticles();
	} 
	
	@RequestMapping(value="/Article/{id}",method=RequestMethod.GET)
	public Optional<Article> getArticleById(@PathVariable long id) {
		return articleMetier.getArticleById(id);
	}
	
	@RequestMapping(value="/Article",method=RequestMethod.POST)
	public Article saveArticle(@RequestBody Article Article) {
		return articleMetier.saveArticle(Article);
	}

	@RequestMapping(value="/Article/{id}",method=RequestMethod.PUT)
	public Article updateArticle(@PathVariable Long id, @RequestBody Article Article) {
		
		return articleMetier.updateArticle(id, Article);
	}

	
	@RequestMapping(value="/Article/{id}",method=RequestMethod.DELETE)
	public void deleteArticle(@PathVariable long id) {
		articleMetier.deleteArticle(id);
	}

}
