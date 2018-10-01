package com.feng.data_search.javabean;

public class ThemeType {

    private Integer t_id;
    private String t_themeType;



    public ThemeType() {
    }

    public ThemeType(String t_themeType) {
        this.t_themeType = t_themeType;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_themeType() {
        return t_themeType;
    }

    public void setT_themeType(String t_themeType) {
        this.t_themeType = t_themeType;
    }
}
