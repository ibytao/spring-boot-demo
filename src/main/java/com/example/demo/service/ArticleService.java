package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Article;

public interface ArticleService {
    void saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}
