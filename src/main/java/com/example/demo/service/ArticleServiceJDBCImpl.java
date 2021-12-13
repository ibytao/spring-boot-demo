package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.dao.ArticleJDBCDAO;
import com.example.demo.model.Article;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleServiceJDBCImpl implements ArticleService {

    @Resource
    private ArticleJDBCDAO articleJDBCDAO;

    @Override
    public void saveArticle(Article article) {
        // TODO Auto-generated method stub
        articleJDBCDAO.save(article);
    }

    @Override
    public void deleteArticle(Long id) {
        // TODO Auto-generated method stub
        articleJDBCDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void updateArticle(Article article) {
        if (article.getId() == null) {
            // TODO
        }
        articleJDBCDAO.deleteById(article.getId());
        articleJDBCDAO.save(article);
        // articleJDBCDAO.updateById(article);

        int a = 10 / 0;
    }

    @Override
    public Article getArticle(Long id) {
        // TODO Auto-generated method stub
        return articleJDBCDAO.findById(id);
    }

    @Override
    public List<Article> getAll() {
        // TODO Auto-generated method stub
        return articleJDBCDAO.findAll();
    }

}
