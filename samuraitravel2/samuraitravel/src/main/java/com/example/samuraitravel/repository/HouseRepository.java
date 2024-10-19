package com.example.samuraitravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Houses;

public interface HouseRepository extends JpaRepository<Houses, Integer> {
	public Page<Houses> findByNameLike(String keyword, Pageable pageable);
}
