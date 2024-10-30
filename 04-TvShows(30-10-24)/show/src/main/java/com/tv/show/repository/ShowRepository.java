package com.tv.show.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tv.show.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

}
