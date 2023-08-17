package com.Solution.in.service;

import java.util.List;

import com.Solution.in.model.Hotel;

public interface HotelService {

	
	Hotel create (Hotel hotel);
	
	List<Hotel>getAll();
	
	Hotel getId(String id);
}
