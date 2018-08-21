package com.gms.web.repository.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Override
	public void insert(MemberDTO p) {
		
	}

	@Override
	public List<?> selectLisk(Map<?, ?> p) {
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		return null;
	}

	@Override
	public MemberDTO selectOne(Map<?, ?> p) {
		return null;
	}

	@Override
	public int count(Map<?, ?> p) {
		return 0;
	}

	@Override
	public void update(Map<?, ?> p) {
		
	}

	@Override
	public void delete(Map<?, ?> p) {
		
	}

	@Override
	public boolean login(Map<?, ?> p) {
		return false;
	}

	@Override
	public void logout(Map<?, ?> p) {
		
	}
	
}
