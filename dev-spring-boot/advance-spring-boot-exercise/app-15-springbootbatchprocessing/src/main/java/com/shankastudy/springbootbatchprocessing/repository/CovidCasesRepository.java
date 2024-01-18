package com.shankastudy.springbootbatchprocessing.repository;

import com.shankastudy.springbootbatchprocessing.entities.CovidCases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CovidCasesRepository extends JpaRepository<CovidCases, String> {
}
