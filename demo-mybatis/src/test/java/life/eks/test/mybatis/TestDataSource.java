package life.eks.test.mybatis;

import life.eks.demo.mybatis.BootMybatis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest(classes = BootMybatis.class)
@WebAppConfiguration
@RunWith(SpringRunner.class)
public class TestDataSource {

    @Resource
    private DataSource dataSource;
    @Test
    public void testConnection() throws Exception {
        System.out.println(this.dataSource instanceof com.alibaba.druid.pool.DruidDataSource);
    }
}
