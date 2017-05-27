package me.philcali.shopify.data.comment;

import java.util.Date;

public class Comment {
    private Long articleId;
    private String author;
    private Long blogId;
    private String body;
    private String bodyHtml;
    private Date createdAt;
    private String email;
    private Long id;
    private String ip;
    private Date publishedAt;
    private String status;
    private Date updatedAt;
    private String userAgent;

    public Long getArticleId() {
        return articleId;
    }

    public String getAuthor() {
        return author;
    }

    public Long getBlogId() {
        return blogId;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public String getStatus() {
        return status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
