package com.Solution.in.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Solution.in.exception.ResourceNotFoundException;
import com.Solution.in.model.Hotel;

import com.Solution.in.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private com.Solution.in.repository.HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
	    String hotelId = UUID.randomUUID().toString();
	    hotel.setId(hotelId); // Set the ID on the Hotel object
	    return hotelRepository.save(hotel);
	}


	@Override 
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getId(String id) {
		
		return hotelRepository.findById(id).orElseThrow((() -> new ResourceNotFoundException("hotel with given id not found")));
	}

}
