package com.feng.data_search.mapper;

import com.feng.data_search.javabean.ThemeType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ThemeTypeMapper {

    @Options(useGeneratedKeys = true,keyProperty = "t_id")
    @Insert("insert into ThemeType(t_themeType) values(#{t_themeType})")
    public int insertTheme(ThemeType themeType);


    /*
    * 这里是list集合
    * */
    @Select("SELECT t_themeType FROM ThemeType")
    public List<ThemeType> selectThemeType();

}
