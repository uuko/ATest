package com.example.atest.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RelatedParentPart {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("material_id")
    @Expose
    private String materialId;
    @SerializedName("bomkey_id")
    @Expose
    private String bomkeyId;
    @SerializedName("bomkey_name")
    @Expose
    private String bomkeyName;
    @SerializedName("unit_id")
    @Expose
    private String unitId;
    @SerializedName("techroutekey_id")
    @Expose
    private String techroutekeyId;
    @SerializedName("fetch_type")
    @Expose
    private Integer fetchType;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("downstream_child")
    @Expose
    private List<DownstreamChild> downstreamChild = null;

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

    public String getBomkeyId() {
        return bomkeyId;
    }

    public void setBomkeyId(String bomkeyId) {
        this.bomkeyId = bomkeyId;
    }

    public String getBomkeyName() {
        return bomkeyName;
    }

    public void setBomkeyName(String bomkeyName) {
        this.bomkeyName = bomkeyName;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getTechroutekeyId() {
        return techroutekeyId;
    }

    public void setTechroutekeyId(String techroutekeyId) {
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

    public List<DownstreamChild> getDownstreamChild() {
        return downstreamChild;
    }

    public void setDownstreamChild(List<DownstreamChild> downstreamChild) {
        this.downstreamChild = downstreamChild;
    }
}
