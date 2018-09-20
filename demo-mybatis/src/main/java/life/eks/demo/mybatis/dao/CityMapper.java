package life.eks.demo.mybatis.dao;

import life.eks.demo.mybatis.pojo.City;

/**
 * @author Eks OU
 */
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}