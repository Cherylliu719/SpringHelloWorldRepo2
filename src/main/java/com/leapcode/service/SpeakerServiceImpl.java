package com.leapcode.service;

import com.leapcode.model.Speaker;
import com.leapcode.repository.HibernateSpeakerRepositoryImpl;
import com.leapcode.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
