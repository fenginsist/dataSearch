package com.feng.data_search.controller;

import com.feng.data_search.javabean.DataBean;
import com.feng.data_search.javabean.ThemeType;
import com.feng.data_search.mapper.DataSearchMapper;
import com.feng.data_search.mapper.ThemeTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DataSearchConreoller {

    @Autowired
    DataSearchMapper dataSearchMapper;

    @Autowired
    ThemeTypeMapper themeTypeMapper;


    /*
    * 来到首页
    * */
    @RequestMapping({"index","/"})
    public String index(HttpSession session){
        List<ThemeType> list = themeTypeMapper.selectThemeType();
//        model.addAttribute("themeTypes",list);
        session.setAttribute("themeTypes",list);
        return "upload";
    }


    /*
    * 点击提交，检索数据
    * */
    @GetMapping("/dataSearch")
    public String dataSearch(DataBean dataBean,Model model){
        List<DataBean> dataBeans = dataSearchMapper.selectDataByAll(dataBean);
        model.addAttribute("dataDetails",dataBeans);
        System.out.println(dataBeans);
        return "uploadData";
    }

}
