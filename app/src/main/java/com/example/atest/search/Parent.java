package com.example.atest.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parent {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("material_id")
    @Expose
    private String materialId;
    @SerializedName("bomkey_id")
    @Expose
    private Object bomkeyId;
    @SerializedName("bomkey_name")
    @Expose
    private String bomkeyName;
    @SerializedName("unit_id")
    @Expose
    private Object unitId;
    @SerializedName("techroutekey_id")
    @Expose
    private Object techroutekeyId;
    @SerializedName("fetch_type")
    @Expose
    private Integer fetchType;
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

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Object getBomkeyId() {
        return bomkeyId;
    }

    public void setBomkeyId(Object bomkeyId) {
        this.bomkeyId = bomkeyId;
    }

    public String getBomkeyName() {
        return bomkeyName;
    }

    public void setBomkeyName(String bomkeyName) {
        this.bomkeyName = bomkeyName;
    }

    public Object getUnitId() {
        return unitId;
    }

    public void setUnitId(Object unitId) {
        this.unitId = unitId;
    }

    public Object getTechroutekeyId() {
        return techroutekeyId;
    }

    public void setTechroutekeyId(Object techroutekeyId) {
        this.techroutekeyId = techroutekeyId;
    }

    public Integer getFetchType() {
        return fetchType;
    }

    public void setFetchType(Integer fetchType) {
        this.fetchType = fetchType;
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
