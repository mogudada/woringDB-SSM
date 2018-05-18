package service;

import java.util.List;

import pojo.Working;
import pojo.WorkingExample;

public interface WorkingService {
    int deleteByPrimaryKey(Integer id);

    int insert(Working record);

    int insertSelective(Working record);

    List<Working> selectByExample(WorkingExample example);

    Working selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Working record);

    int updateByPrimaryKey(Working record);
}
