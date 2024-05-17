package com.example.testtaskspring.app.repository;

import com.example.testtaskspring.domain.contract.Contract;
import com.example.testtaskspring.domain.tranche.Tranche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TrancheRepository extends JpaRepository<Tranche, Long> {

//    List<Tranche> findTranchesByContractContains(List<Contract> contracts);
}
