package com.feng.data_search.javabean;


public class DataBean {

    private Integer d_id;
    private String d_time;
    private String d_person;
    private String d_theme;
    private String d_speakTheme;
    private String d_speakContent;
    private Integer t_id;
//    包装类 联合查询；
//    private ThemeType themeType;



    @Override
    public String toString() {
        return "DataBean{" +
                "d_id=" + d_id +
                ", d_time='" + d_time + '\'' +
                ", d_person='" + d_person + '\'' +
                ", d_theme='" + d_theme + '\'' +
                ", d_speakTheme='" + d_speakTheme + '\'' +
                ", d_speakContent='" + d_speakContent + '\'' +
                '}';
    }

    public DataBean() {
    }

    public DataBean(Integer d_id, String d_time, String d_person, String d_theme, String d_speakTheme, String d_speakContent) {
        this.d_id = d_id;
        this.d_time = d_time;
        this.d_person = d_person;
        this.d_theme = d_theme;
        this.d_speakTheme = d_speakTheme;
        this.d_speakContent = d_speakContent;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_time() {

        return d_time;
    }

    public void setD_time(String d_time) {
        this.d_time = d_time;
    }

    public String getD_person() {
        return d_person;
    }

    public void setD_person(String d_person) {
        this.d_person = d_person;
    }

    public String getD_theme() {
        return d_theme;
    }

    public void setD_theme(String d_theme) {
        this.d_theme = d_theme;
    }

    public String getD_speakTheme() {
        return d_speakTheme;
    }

    public void setD_speakTheme(String d_speakTheme) {
        this.d_speakTheme = d_speakTheme;
    }

    public String getD_speakContent() {
        return d_speakContent;
    }

    public void setD_speakContent(String d_speakContent) {
        this.d_speakContent = d_speakContent;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

//    public ThemeType getThemeType() {
//        return themeType;
//    }
//
//    public void setThemeType(ThemeType themeType) {
//        this.themeType = themeType;
//    }
}
