package com.jiedong.stockserver.dto;


public class StockInfo {
    String code;
    String name;

    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setName(String name){
        this.name = name;
    }
}
