package com.fashion.graduationmanagement;

import com.fashion.graduationmanagement.mapper.CategoryMapper;
import com.fashion.graduationmanagement.pojo.Category;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: wuzhuhao
 * @Date: 19-12-26 下午6:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GraduationManagementApplication.class)
public class TestMybaits {
    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void test(){
        List<Category> cs = categoryMapper.findAll();
        for (Category c : cs) {
            System.out.println("c.getName():"+ c.getName());
        }
    }
}
