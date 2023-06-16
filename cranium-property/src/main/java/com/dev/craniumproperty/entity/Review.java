package com.dev.craniumproperty.entity;

import java.sql.Date;

public class Review {
    private Integer id;
    private Integer agentId;   
    private Integer propertyId;   
    private Integer userId;   
    private Integer agencyId;   
    private String category;  
    private String description;  
    private Integer rating;  
    private Integer verifyAdminId;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;
    private Boolean deleted;
    private Date deletedAt;
    private Integer deletedBy;

    public Review() {
    }

    public Review(Integer id, Integer agentId, Integer propertyId, Integer userId, Integer agencyId, String category,
            String description, Integer rating, Integer verifyAdminId, Date createdAt, Integer createdBy,
            Date updatedAt, Integer updatedBy, Boolean deleted, Date deletedAt, Integer deletedBy) {
        this.id = id;
        this.agentId = agentId;
        this.propertyId = propertyId;
        this.userId = userId;
        this.agencyId = agencyId;
        this.category = category;
        this.description = description;
        this.rating = rating;
        this.verifyAdminId = verifyAdminId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getVerifyAdminId() {
        return verifyAdminId;
    }

    public void setVerifyAdminId(Integer verifyAdminId) {
        this.verifyAdminId = verifyAdminId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Integer deletedBy) {
        this.deletedBy = deletedBy;
    }

    
    
}
