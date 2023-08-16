package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.paging.Pageable;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;
@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findAll(Pageable pageable) {
		String sql = "select * from news\n" +
				"order by " + pageable.getSorter().getSortBy() + " " + pageable.getSorter().getSortName() + " \n" +
				"offset " + pageable.getOffset() + " rows\n" +
				"fetch next " + pageable.getLimit() + " rows only";
		return query(sql.toString(), new NewMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT COUNT(*) FROM news";
		return count(sql);
	}

}
