package com.example.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
