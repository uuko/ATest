package com.example.atest.search_result;

public class PrevManufactureModel {


    /**
     * id : 20
     * mo_id : 1MO1901290040
     * item_id : F27P71-1C
     * item_name : ATR27P71  箱身,側邊鐵制側把手,左側有側邊桌,右側無側邊桌,地蓋補強片
     * qty : 10
     * techroutekey_id : 1000-02
     * online_date : 2019-02-18
     * complete_date : 2019-01-25
     * so_id : 1SO1901290006
     * batch : 2
     * created_at : 2019-05-27 19:14:41
     * updated_at : 2019-06-20 17:33:21
     * customer : 永晏欣企業有限公司
     */

    private int id;
    private String mo_id;
    private String item_id;
    private String item_name;
    private int qty;
    private String techroutekey_id;
    private String online_date;
    private String complete_date;
    private String so_id;
    private int batch;
    private String created_at;
    private String updated_at;
    private String customer;

    public PrevManufactureModel(int id, String mo_id, String item_id, String item_name, int qty, String techroutekey_id, String online_date, String complete_date, String so_id, int batch, String created_at, String updated_at, String customer) {
        this.id = id;
        this.mo_id = mo_id;
        this.item_id = item_id;
        this.item_name = item_name;
        this.qty = qty;
        this.techroutekey_id = techroutekey_id;
        this.online_date = online_date;
        this.complete_date = complete_date;
        this.so_id = so_id;
        this.batch = batch;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMo_id() {
        return mo_id;
    }

    public void setMo_id(String mo_id) {
        this.mo_id = mo_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTechroutekey_id() {
        return techroutekey_id;
    }

    public void setTechroutekey_id(String techroutekey_id) {
        this.techroutekey_id = techroutekey_id;
    }

    public String getOnline_date() {
        return online_date;
    }

    public void setOnline_date(String online_date) {
        this.online_date = online_date;
    }

    public String getComplete_date() {
        return complete_date;
    }

    public void setComplete_date(String complete_date) {
        this.complete_date = complete_date;
    }

    public String getSo_id() {
        return so_id;
    }

    public void setSo_id(String so_id) {
        this.so_id = so_id;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
