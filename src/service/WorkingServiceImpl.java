package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.WorkingMapper;
import pojo.Working;
import pojo.WorkingExample;
@Service("workingService")
public class WorkingServiceImpl implements WorkingService {
	@Autowired
	private WorkingMapper wkm;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return wkm.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Working record) {
		// TODO Auto-generated method stub
		return wkm.insert(record);
	}

	@Override
	public int insertSelective(Working record) {
		// TODO Auto-generated method stub
		return wkm.insertSelective(record);
	}

	@Override
	public List<Working> selectByExample(WorkingExample example) {
		// TODO Auto-generated method stub
		return wkm.selectByExample(example);
	}

	@Override
	public Working selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return wkm.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Working record) {
		// TODO Auto-generated method stub
		return wkm.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Working record) {
		// TODO Auto-generated method stub
		return wkm.updateByPrimaryKey(record);
	}

}
