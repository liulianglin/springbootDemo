package com.ydxt.lll.config;

/**
 * @Author : 147805
 * @Description : 数据源key持有类
 * Created by 147805 on 2018/4/14.
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setContextHolder(DatabaseType type){
        contextHolder.set(type);
    }
    public static DatabaseType getContextHolder(){
        return contextHolder.get();
    }
}
