package com.example.atest.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedTechRoute {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tech_routing_id")
    @Expose
    private String techRoutingId;
    @SerializedName("tech_routing_name")
    @Expose
    private String techRoutingName;
    @SerializedName("factory")
    @Expose
    private String factory;
    @SerializedName("factory_id")
    @Expose
    private String factoryId;
    @SerializedName("internal_code")
    @Expose
    private String internalCode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("org_id")
    @Expose
    private String orgId;
    @SerializedName("transfer_factory")
    @Expose
    private String transferFactory;
    @SerializedName("factory_type")
    @Expose
    private String factoryType;
    @SerializedName("routing_level")
    @Expose
    private String routingLevel;
    @SerializedName("aps_id")
    @Expose
    private String apsId;
    @SerializedName("assign_work")
    @Expose
    private Object assignWork;
    @SerializedName("standard_time")
    @Expose
    private Object standardTime;
    @SerializedName("standard_pre_time")
    @Expose
    private Object standardPreTime;
    @SerializedName("standard_tct")
    @Expose
    private Object standardTct;
    @SerializedName("change_time")
    @Expose
    private Object changeTime;
    @SerializedName("device_multiple")
    @Expose
    private Object deviceMultiple;
    @SerializedName("min_unable_order_time")
    @Expose
    private Object minUnableOrderTime;
    @SerializedName("default_resource")
    @Expose
    private Object defaultResource;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTechRoutingId() {
        return techRoutingId;
    }

    public void setTechRoutingId(String techRoutingId) {
        this.techRoutingId = techRoutingId;
    }

    public String getTechRoutingName() {
        return techRoutingName;
    }

    public void setTechRoutingName(String techRoutingName) {
        this.techRoutingName = techRoutingName;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getTransferFactory() {
        return transferFactory;
    }

    public void setTransferFactory(String transferFactory) {
        this.transferFactory = transferFactory;
    }

    public String getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(String factoryType) {
        this.factoryType = factoryType;
    }

    public String getRoutingLevel() {
        return routingLevel;
    }

    public void setRoutingLevel(String routingLevel) {
        this.routingLevel = routingLevel;
    }

    public String getApsId() {
        return apsId;
    }

    public void setApsId(String apsId) {
        this.apsId = apsId;
    }

    public Object getAssignWork() {
        return assignWork;
    }

    public void setAssignWork(Object assignWork) {
        this.assignWork = assignWork;
    }

    public Object getStandardTime() {
        return standardTime;
    }

    public void setStandardTime(Object standardTime) {
        this.standardTime = standardTime;
    }

    public Object getStandardPreTime() {
        return standardPreTime;
    }

    public void setStandardPreTime(Object standardPreTime) {
        this.standardPreTime = standardPreTime;
    }

    public Object getStandardTct() {
        return standardTct;
    }

    public void setStandardTct(Object standardTct) {
        this.standardTct = standardTct;
    }

    public Object getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Object changeTime) {
        this.changeTime = changeTime;
    }

    public Object getDeviceMultiple() {
        return deviceMultiple;
    }

    public void setDeviceMultiple(Object deviceMultiple) {
        this.deviceMultiple = deviceMultiple;
    }

    public Object getMinUnableOrderTime() {
        return minUnableOrderTime;
    }

    public void setMinUnableOrderTime(Object minUnableOrderTime) {
        this.minUnableOrderTime = minUnableOrderTime;
    }

    public Object getDefaultResource() {
        return defaultResource;
    }

    public void setDefaultResource(Object defaultResource) {
        this.defaultResource = defaultResource;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
