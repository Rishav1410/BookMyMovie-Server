package com.movieapp.movieapp.Data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieapp.movieapp.Data.Domain.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {

}


	