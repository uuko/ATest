package com.example.atest.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DownstreamChild {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("top_id")
    @Expose
    private Integer topId;
    @SerializedName("down_id")
    @Expose
    private Integer downId;
    @SerializedName("row_no")
    @Expose
    private Integer rowNo;
    @SerializedName("row_id")
    @Expose
    private Integer rowId;
    @SerializedName("unit_id")
    @Expose
    private String unitId;
    @SerializedName("unit_qty")
    @Expose
    private Double unitQty;
    @SerializedName("nuse_qty")
    @Expose
    private Double nuseQty;
    @SerializedName("base_qty")
    @Expose
    private Double baseQty;
    @SerializedName("remark")
    @Expose
    private String remark;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("parent")
    @Expose
    private Parent parent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Integer getDownId() {
        return downId;
    }

    public void setDownId(Integer downId) {
        this.downId = downId;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public Double getUnitQty() {
        return unitQty;
    }

    public void setUnitQty(Double unitQty) {
        this.unitQty = unitQty;
    }

    public Double getNuseQty() {
        return nuseQty;
    }

    public void setNuseQty(Double nuseQty) {
        this.nuseQty = nuseQty;
    }

    public Double getBaseQty() {
        return baseQty;
    }

    public void setBaseQty(Double baseQty) {
        this.baseQty = baseQty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
