package com.ydxt.lll.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/14.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getContextHolder();
    }
}
