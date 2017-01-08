package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by songqinghua on 2017/1/8.
 */

public class Conuty extends DataSupport {

    private int id;
    private String countyName;
    private String wewather;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWewather() {
        return wewather;
    }

    public void setWewather(String wewather) {
        this.wewather = wewather;
    }

    @Override
    public String toString() {
        return "Conuty{" +
                "id=" + id +
                ", countyName='" + countyName + '\'' +
                ", wewather='" + wewather + '\'' +
                ", cityId=" + cityId +
                '}';
    }

    public Conuty(int id, String countyName, String wewather, int cityId) {
        this.id = id;
        this.countyName = countyName;
        this.wewather = wewather;
        this.cityId = cityId;
    }
}
