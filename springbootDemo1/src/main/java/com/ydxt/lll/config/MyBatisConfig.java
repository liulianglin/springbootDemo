package com.ydxt.lll.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author : 147805
 * @Description : mabatis配置文件
 * Created by 147805 on 2018/4/13.
 */
@Configuration
@MapperScan("com.ydxt.lll.dao")
public class MyBatisConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() throws Exception {
        Properties properties = new Properties();
        properties.put("driverClassName", env.getProperty("datasource.driver"));
        properties.put("url", env.getProperty("datasource.url"));
        properties.put("username", env.getProperty("datasource.username"));
        properties.put("password", env.getProperty("datasource.password"));
        return DruidDataSourceFactory.createDataSource(properties);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(ds); //指定数据源
        sfb.setTypeAliasesPackage("com.ydxt.lll.domain");//指定基包
        sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapping/*.xml"));//指定XML位置
        return sfb.getObject();
    }

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        //指定扫描的mapper.xml文件所在目录
//        mapperScannerConfigurer.setBasePackage("com.ydxt.lll.dao");
//        return mapperScannerConfigurer;
//    }
}
