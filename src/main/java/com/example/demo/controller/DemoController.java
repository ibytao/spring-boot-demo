package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.AjaxResponse;
import com.example.demo.model.Article;
import com.example.demo.model.User;
import com.example.demo.service.ArticleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Resource
    ArticleService articleService;

    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = articleService.getArticle(id);
        return AjaxResponse.success(article);
    }

    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
        return AjaxResponse.success();
    }

    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return AjaxResponse.success();
    }

    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
        return AjaxResponse.success();
    }

    @GetMapping("/articles")
    public AjaxResponse getArticles() {
        List<Article> articles = articleService.getAll();
        return AjaxResponse.success(articles);
    }

    @RequestMapping("/")
    public User home() {
        User user = User.builder().name("buck").build();
        return user;
    }
}
