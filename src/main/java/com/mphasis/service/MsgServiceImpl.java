package com.mphasis.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class MsgServiceImpl implements MsgService {

	@Override
	public String generateMsg() {
		if(LocalTime.now().getHour()<12)
			return "Good Morinig";
		else if(LocalTime.now().getHour()<18)
			return "Good AfterNoon";
		else if(LocalTime.now().getHour()<20)
			return "Good evening";
		else 
			return "Good Night";
		
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
