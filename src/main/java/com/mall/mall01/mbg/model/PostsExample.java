package com.mall.mall01.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentIsNull() {
            addCriterion("disallow_comment is null");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentIsNotNull() {
            addCriterion("disallow_comment is not null");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentEqualTo(Boolean value) {
            addCriterion("disallow_comment =", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentNotEqualTo(Boolean value) {
            addCriterion("disallow_comment <>", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentGreaterThan(Boolean value) {
            addCriterion("disallow_comment >", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("disallow_comment >=", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentLessThan(Boolean value) {
            addCriterion("disallow_comment <", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("disallow_comment <=", value, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentIn(List<Boolean> values) {
            addCriterion("disallow_comment in", values, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentNotIn(List<Boolean> values) {
            addCriterion("disallow_comment not in", values, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("disallow_comment between", value1, value2, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andDisallowCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("disallow_comment not between", value1, value2, "disallowComment");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditorTypeIsNull() {
            addCriterion("editor_type is null");
            return (Criteria) this;
        }

        public Criteria andEditorTypeIsNotNull() {
            addCriterion("editor_type is not null");
            return (Criteria) this;
        }

        public Criteria andEditorTypeEqualTo(Integer value) {
            addCriterion("editor_type =", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeNotEqualTo(Integer value) {
            addCriterion("editor_type <>", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeGreaterThan(Integer value) {
            addCriterion("editor_type >", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("editor_type >=", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeLessThan(Integer value) {
            addCriterion("editor_type <", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("editor_type <=", value, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeIn(List<Integer> values) {
            addCriterion("editor_type in", values, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeNotIn(List<Integer> values) {
            addCriterion("editor_type not in", values, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeBetween(Integer value1, Integer value2) {
            addCriterion("editor_type between", value1, value2, "editorType");
            return (Criteria) this;
        }

        public Criteria andEditorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("editor_type not between", value1, value2, "editorType");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Long value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Long value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Long value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Long value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Long value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Long value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Long> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Long> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Long value1, Long value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Long value1, Long value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNull() {
            addCriterion("meta_description is null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNotNull() {
            addCriterion("meta_description is not null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionEqualTo(String value) {
            addCriterion("meta_description =", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotEqualTo(String value) {
            addCriterion("meta_description <>", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThan(String value) {
            addCriterion("meta_description >", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("meta_description >=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThan(String value) {
            addCriterion("meta_description <", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("meta_description <=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLike(String value) {
            addCriterion("meta_description like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotLike(String value) {
            addCriterion("meta_description not like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIn(List<String> values) {
            addCriterion("meta_description in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotIn(List<String> values) {
            addCriterion("meta_description not in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionBetween(String value1, String value2) {
            addCriterion("meta_description between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotBetween(String value1, String value2) {
            addCriterion("meta_description not between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNull() {
            addCriterion("meta_keywords is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNotNull() {
            addCriterion("meta_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsEqualTo(String value) {
            addCriterion("meta_keywords =", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotEqualTo(String value) {
            addCriterion("meta_keywords <>", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThan(String value) {
            addCriterion("meta_keywords >", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("meta_keywords >=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThan(String value) {
            addCriterion("meta_keywords <", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
            addCriterion("meta_keywords <=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLike(String value) {
            addCriterion("meta_keywords like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotLike(String value) {
            addCriterion("meta_keywords not like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIn(List<String> values) {
            addCriterion("meta_keywords in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotIn(List<String> values) {
            addCriterion("meta_keywords not in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsBetween(String value1, String value2) {
            addCriterion("meta_keywords between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
            addCriterion("meta_keywords not between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSlugIsNull() {
            addCriterion("slug is null");
            return (Criteria) this;
        }

        public Criteria andSlugIsNotNull() {
            addCriterion("slug is not null");
            return (Criteria) this;
        }

        public Criteria andSlugEqualTo(String value) {
            addCriterion("slug =", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotEqualTo(String value) {
            addCriterion("slug <>", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThan(String value) {
            addCriterion("slug >", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThanOrEqualTo(String value) {
            addCriterion("slug >=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThan(String value) {
            addCriterion("slug <", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThanOrEqualTo(String value) {
            addCriterion("slug <=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLike(String value) {
            addCriterion("slug like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotLike(String value) {
            addCriterion("slug not like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugIn(List<String> values) {
            addCriterion("slug in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotIn(List<String> values) {
            addCriterion("slug not in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugBetween(String value1, String value2) {
            addCriterion("slug between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotBetween(String value1, String value2) {
            addCriterion("slug not between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTopPriorityIsNull() {
            addCriterion("top_priority is null");
            return (Criteria) this;
        }

        public Criteria andTopPriorityIsNotNull() {
            addCriterion("top_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTopPriorityEqualTo(Integer value) {
            addCriterion("top_priority =", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityNotEqualTo(Integer value) {
            addCriterion("top_priority <>", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityGreaterThan(Integer value) {
            addCriterion("top_priority >", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_priority >=", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityLessThan(Integer value) {
            addCriterion("top_priority <", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("top_priority <=", value, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityIn(List<Integer> values) {
            addCriterion("top_priority in", values, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityNotIn(List<Integer> values) {
            addCriterion("top_priority not in", values, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityBetween(Integer value1, Integer value2) {
            addCriterion("top_priority between", value1, value2, "topPriority");
            return (Criteria) this;
        }

        public Criteria andTopPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("top_priority not between", value1, value2, "topPriority");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVisitsIsNull() {
            addCriterion("visits is null");
            return (Criteria) this;
        }

        public Criteria andVisitsIsNotNull() {
            addCriterion("visits is not null");
            return (Criteria) this;
        }

        public Criteria andVisitsEqualTo(Long value) {
            addCriterion("visits =", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotEqualTo(Long value) {
            addCriterion("visits <>", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsGreaterThan(Long value) {
            addCriterion("visits >", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsGreaterThanOrEqualTo(Long value) {
            addCriterion("visits >=", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsLessThan(Long value) {
            addCriterion("visits <", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsLessThanOrEqualTo(Long value) {
            addCriterion("visits <=", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsIn(List<Long> values) {
            addCriterion("visits in", values, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotIn(List<Long> values) {
            addCriterion("visits not in", values, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsBetween(Long value1, Long value2) {
            addCriterion("visits between", value1, value2, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotBetween(Long value1, Long value2) {
            addCriterion("visits not between", value1, value2, "visits");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNull() {
            addCriterion("word_count is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("word_count is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(Long value) {
            addCriterion("word_count =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(Long value) {
            addCriterion("word_count <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(Long value) {
            addCriterion("word_count >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(Long value) {
            addCriterion("word_count >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(Long value) {
            addCriterion("word_count <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(Long value) {
            addCriterion("word_count <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<Long> values) {
            addCriterion("word_count in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<Long> values) {
            addCriterion("word_count not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(Long value1, Long value2) {
            addCriterion("word_count between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(Long value1, Long value2) {
            addCriterion("word_count not between", value1, value2, "wordCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}