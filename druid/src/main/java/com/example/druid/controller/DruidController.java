package com.example.druid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: database_poll
 * @description: 测试类
 * @author: lxl
 * @create: 2020-09-02 6:37
 */
@RestController
public class DruidController {
    private static final Logger LOG = LoggerFactory.getLogger(DruidController.class);
    @Resource
    private JdbcTemplate jdbcTemplate ;
    @RequestMapping("/druidData")
    public String druidData (){
        String sql = "SELECT COUNT(1) FROM users" ;
        Integer countOne = jdbcTemplate.queryForObject(sql,Integer.class) ;
        // countOne==2
        LOG.info("countOne=="+countOne);
        return "success" ;
    }
}