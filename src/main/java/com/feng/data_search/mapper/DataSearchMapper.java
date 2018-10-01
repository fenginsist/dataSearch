package com.feng.data_search.mapper;

import com.feng.data_search.javabean.DataBean;
import java.util.Date;
import java.util.List;


public interface DataSearchMapper {

    public List<DataBean> selectDataByAll(DataBean dataBean);
}
