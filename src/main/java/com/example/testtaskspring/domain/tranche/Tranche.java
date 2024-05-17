package com.example.testtaskspring.domain.tranche;

import com.example.testtaskspring.domain.contract.Contract;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tranches")
public class Tranche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private Contract contract;
}
