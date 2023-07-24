package com.railworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railworld.entity.Hr;
import com.railworld.repositiory.HrRepository;
@Service
public class HrserviceImpl implements Hrservice {
	@Autowired
	private HrRepository hrRepo;

	@Override
	public void SaveHr(Hr hr) {
		hrRepo.save(hr);
		

	}

}
