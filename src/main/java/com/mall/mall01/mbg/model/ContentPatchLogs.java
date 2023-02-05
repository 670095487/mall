package com.mall.mall01.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ContentPatchLogs implements Serializable {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer postId;

    private Date publishTime;

    private Integer sourceId;

    private Integer status;

    private Integer version;

    private String contentDiff;

    private String originalContentDiff;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContentDiff() {
        return contentDiff;
    }

    public void setContentDiff(String contentDiff) {
        this.contentDiff = contentDiff;
    }

    public String getOriginalContentDiff() {
        return originalContentDiff;
    }

    public void setOriginalContentDiff(String originalContentDiff) {
        this.originalContentDiff = originalContentDiff;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", postId=").append(postId);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", contentDiff=").append(contentDiff);
        sb.append(", originalContentDiff=").append(originalContentDiff);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}