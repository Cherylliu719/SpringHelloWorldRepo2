package com.leapcode.repository;

import com.leapcode.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
