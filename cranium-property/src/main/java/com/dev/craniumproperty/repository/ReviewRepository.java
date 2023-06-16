package com.dev.craniumproperty.repository;

import java.util.List;
import java.util.Optional;

import com.dev.craniumproperty.entity.Review;

public interface ReviewRepository {
    List<Review> findAll();

    Optional<Review> findById(Integer id);

    int deleteById(Integer id);

    int insert(Review review);

    int update(Review review);
}
