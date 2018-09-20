package life.eks.demo.mybatis;

import life.eks.demo.mybatis.dao.CityMapper;
import life.eks.demo.mybatis.pojo.City;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Eks OU
 */
@SpringBootApplication
@RestController
@MapperScan("life")
public class BootMybatis {

    @Resource
    private CityMapper cityMapper;

    public static void main(String[] args) {
        SpringApplication.run(BootMybatis.class, args);
    }

    @RequestMapping("/")
    public City home() {
        return cityMapper.selectByPrimaryKey(1);
    }
}
