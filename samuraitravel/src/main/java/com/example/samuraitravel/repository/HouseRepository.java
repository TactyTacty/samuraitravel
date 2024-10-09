package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Houses;

public interface HouseRepository extends JpaRepository<Houses, Integer> {

}
