package com.mall.mall01.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Posts implements Serializable {
    private Integer id;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Boolean disallowComment;

    private Date editTime;

    private Integer editorType;

    private Long likes;

    private String metaDescription;

    private String metaKeywords;

    private String password;

    private String slug;

    private Integer status;

    private String template;

    private String thumbnail;

    private String title;

    private Integer topPriority;

    private String url;

    private Integer version;

    private Long visits;

    private Long wordCount;

    private String formatContent;

    private String originalContent;

    private String summary;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getDisallowComment() {
        return disallowComment;
    }

    public void setDisallowComment(Boolean disallowComment) {
        this.disallowComment = disallowComment;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getEditorType() {
        return editorType;
    }

    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTopPriority() {
        return topPriority;
    }

    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public Long getWordCount() {
        return wordCount;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public String getFormatContent() {
        return formatContent;
    }

    public void setFormatContent(String formatContent) {
        this.formatContent = formatContent;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
        sb.append(", disallowComment=").append(disallowComment);
        sb.append(", editTime=").append(editTime);
        sb.append(", editorType=").append(editorType);
        sb.append(", likes=").append(likes);
        sb.append(", metaDescription=").append(metaDescription);
        sb.append(", metaKeywords=").append(metaKeywords);
        sb.append(", password=").append(password);
        sb.append(", slug=").append(slug);
        sb.append(", status=").append(status);
        sb.append(", template=").append(template);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", title=").append(title);
        sb.append(", topPriority=").append(topPriority);
        sb.append(", url=").append(url);
        sb.append(", version=").append(version);
        sb.append(", visits=").append(visits);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", formatContent=").append(formatContent);
        sb.append(", originalContent=").append(originalContent);
        sb.append(", summary=").append(summary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}