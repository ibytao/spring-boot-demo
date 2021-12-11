package com.example.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.model.Article;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleJDBCDAO {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Article article) {
        jdbcTemplate.update("INSERT INTO articles(author, title, content, create_time) VALUES (?, ?, ?, ?)",
                article.getAuthor(), article.getTitle(), article.getContent(), article.getCreateTime());
    }

    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM articles WHERE id = ?", id);
    }

    public void updateById(Article article) {
        jdbcTemplate.update("UPDATE articles SET author = ?, title = ?, content = ?, create_time = ? WHERE id = ?",
                article.getAuthor(), article.getTitle(), article.getContent(), article.getCreateTime(),
                article.getId());
    }

    public Article findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM articles WHERE id=?", new Object[] { id },
                new BeanPropertyRowMapper<>(Article.class));
    }

    public List<Article> findAll() {
        return (List<Article>) jdbcTemplate.query("SELECT * FROM articles", new BeanPropertyRowMapper<>(Article.class));
    }
}
