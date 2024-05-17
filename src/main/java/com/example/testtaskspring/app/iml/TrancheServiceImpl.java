package com.example.testtaskspring.app.iml;

import com.example.testtaskspring.app.api.TrancheService;
import com.example.testtaskspring.app.repository.ContractRepository;
import com.example.testtaskspring.app.repository.TrancheRepository;
import com.example.testtaskspring.domain.contract.Contract;
import com.example.testtaskspring.domain.tranche.Tranche;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrancheServiceImpl implements TrancheService {
    private final TrancheRepository trancheRepository;
    private final ContractRepository contractRepository;
    @Override
    public void execute() {
        List<Contract> contracts = contractRepository.findAll();
        for (Contract contract : contracts) {
            Tranche tranche1 = new Tranche();
            tranche1.setName("Ivan");
            Tranche tranche2 = new Tranche();
            tranche2.setName("Petr");
            List<Tranche> tranches = new ArrayList<>(List.of(tranche1, tranche2));

            contract.setTranches(tranches);
            contractRepository.save(contract);
        }
//        List<Tranche> tranchesByContractIsContaining = trancheRepository.findTranchesByContractContains(all);
//        System.out.println(tranchesByContractIsContaining);
    }
}
