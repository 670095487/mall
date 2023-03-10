package com.mall.mall01.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Contents implements Serializable {
    private Integer postId;

    private Date createTime;

    private Date updateTime;

    private Integer headPatchLogId;

    private Integer patchLogId;

    private Integer status;

    private String content;

    private String originalContent;

    private static final long serialVersionUID = 1L;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
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

    public Integer getHeadPatchLogId() {
        return headPatchLogId;
    }

    public void setHeadPatchLogId(Integer headPatchLogId) {
        this.headPatchLogId = headPatchLogId;
    }

    public Integer getPatchLogId() {
        return patchLogId;
    }

    public void setPatchLogId(Integer patchLogId) {
        this.patchLogId = patchLogId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", headPatchLogId=").append(headPatchLogId);
        sb.append(", patchLogId=").append(patchLogId);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", originalContent=").append(originalContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}