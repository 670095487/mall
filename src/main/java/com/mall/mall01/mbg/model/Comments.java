package com.mall.mall01.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Comments implements Serializable {
    private Long id;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Boolean allowNotification;

    private String author;

    private String authorUrl;

    private String content;

    private String email;

    private String gravatarMd5;

    private String ipAddress;

    private Boolean isAdmin;

    private Long parentId;

    private Integer postId;

    private Integer status;

    private Integer topPriority;

    private String userAgent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getAllowNotification() {
        return allowNotification;
    }

    public void setAllowNotification(Boolean allowNotification) {
        this.allowNotification = allowNotification;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGravatarMd5() {
        return gravatarMd5;
    }

    public void setGravatarMd5(String gravatarMd5) {
        this.gravatarMd5 = gravatarMd5;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTopPriority() {
        return topPriority;
    }

    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", allowNotification=").append(allowNotification);
        sb.append(", author=").append(author);
        sb.append(", authorUrl=").append(authorUrl);
        sb.append(", content=").append(content);
        sb.append(", email=").append(email);
        sb.append(", gravatarMd5=").append(gravatarMd5);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", parentId=").append(parentId);
        sb.append(", postId=").append(postId);
        sb.append(", status=").append(status);
        sb.append(", topPriority=").append(topPriority);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}