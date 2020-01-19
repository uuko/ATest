package com.example.atest.search;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchManufactureModel implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("mo_id")
    @Expose
    private String moId;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("item_name")
    @Expose
    private String itemName;
    @SerializedName("qty")
    @Expose
    private Integer qty;
    @SerializedName("techroutekey_id")
    @Expose
    private String techroutekeyId;
    @SerializedName("online_date")
    @Expose
    private String onlineDate;
    @SerializedName("complete_date")
    @Expose
    private String completeDate;
    @SerializedName("so_id")
    @Expose
    private String soId;
    @SerializedName("batch")
    @Expose
    private Integer batch;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("customer")
    @Expose
    private String customer;
    @SerializedName("demand_complete_date")
    @Expose
    private String demandCompleteDate;
    @SerializedName("bill_date")
    @Expose
    private String billDate;
    @SerializedName("related_tech_route")
    @Expose
    private RelatedTechRoute relatedTechRoute;
    @SerializedName("related_parent_part")
    @Expose
    private RelatedParentPart relatedParentPart;

    protected SearchManufactureModel(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        moId = in.readString();
        itemId = in.readString();
        itemName = in.readString();
        if (in.readByte() == 0) {
            qty = null;
        } else {
            qty = in.readInt();
        }
        techroutekeyId = in.readString();
        onlineDate = in.readString();
        completeDate = in.readString();
        soId = in.readString();
        if (in.readByte() == 0) {
            batch = null;
        } else {
            batch = in.readInt();
        }
        createdAt = in.readString();
        updatedAt = in.readString();
        customer = in.readString();
        demandCompleteDate = in.readString();
        billDate = in.readString();
    }

    public static final Creator<SearchManufactureModel> CREATOR = new Creator<SearchManufactureModel>() {
        @Override
        public SearchManufactureModel createFromParcel(Parcel in) {
            return new SearchManufactureModel(in);
        }

        @Override
        public SearchManufactureModel[] newArray(int size) {
            return new SearchManufactureModel[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getTechroutekeyId() {
        return techroutekeyId;
    }

    public void setTechroutekeyId(String techroutekeyId) {
        this.techroutekeyId = techroutekeyId;
    }

    public String getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }

    public String getSoId() {
        return soId;
    }

    public void setSoId(String soId) {
        this.soId = soId;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDemandCompleteDate() {
        return demandCompleteDate;
    }

    public void setDemandCompleteDate(String demandCompleteDate) {
        this.demandCompleteDate = demandCompleteDate;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public RelatedTechRoute getRelatedTechRoute() {
        return relatedTechRoute;
    }

    public void setRelatedTechRoute(RelatedTechRoute relatedTechRoute) {
        this.relatedTechRoute = relatedTechRoute;
    }

    public RelatedParentPart getRelatedParentPart() {
        return relatedParentPart;
    }

    public void setRelatedParentPart(RelatedParentPart relatedParentPart) {
        this.relatedParentPart = relatedParentPart;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(moId);
        dest.writeString(itemId);
        dest.writeString(itemName);
        if (qty == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(qty);
        }
        dest.writeString(techroutekeyId);
        dest.writeString(onlineDate);
        dest.writeString(completeDate);
        dest.writeString(soId);
        if (batch == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(batch);
        }
        dest.writeString(createdAt);
        dest.writeString(updatedAt);
        dest.writeString(customer);
        dest.writeString(demandCompleteDate);
        dest.writeString(billDate);
    }
}
