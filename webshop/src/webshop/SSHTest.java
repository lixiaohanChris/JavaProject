package webshop;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Category;
import com.bean.CategoryService;
import com.bean.CategoryServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:beans.xml")  
public class SSHTest {  
      
    @Resource  
    private Date date;  
      
    @Test //测试Spring IOC的开发环境  
    public void springIoc() {  
        System.out.println(date);  
    } 
    @Test
    public void hihernate() {  
        CategoryService categoryService = new CategoryServiceImpl();  
        Category category = new Category("男士休闲", true);  
        categoryService.save(category);  
    } 
}  
