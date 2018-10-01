package com.feng.data_search;

import com.feng.data_search.javabean.DataBean;
import com.feng.data_search.javabean.ThemeType;
import com.feng.data_search.mapper.DataSearchMapper;
import com.feng.data_search.mapper.ThemeTypeMapper;
import org.hibernate.validator.constraints.EAN;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSearchApplicationTests {

	@Autowired
    DataSearchMapper dataSearchMapper;

	@Autowired
    ThemeTypeMapper themeTypeMapper;

	@Test
    public void testDataSearch() {
        List<DataBean> feng = dataSearchMapper.selectDataByAll(new DataBean(null, "feng", null, "车险", null, null));
        for (DataBean a : feng){
            String s = feng.toString();
            System.out.println(s);
        }
    }

    @Test
    public void testThemeType(){
        List<ThemeType> list = themeTypeMapper.selectThemeType();
        for (ThemeType a :list){
            System.out.println(a.toString());
        }
    }

    @Test
    public void insertThemeType(){
        List<ThemeType> list = new ArrayList<>();
        ThemeType type = new ThemeType("车险");
        ThemeType type1 = new ThemeType("非车险");
        ThemeType type2 = new ThemeType("承保");
        ThemeType type3 = new ThemeType("理赔");
        ThemeType type4 = new ThemeType("财务");
        ThemeType type5 = new ThemeType("综合");
        list.add(type);
        list.add(type1);
        list.add(type2);
        list.add(type3);
        list.add(type4);
        list.add(type5);
        for (ThemeType a : list){
            themeTypeMapper.insertTheme(a);
        }


    }
}
