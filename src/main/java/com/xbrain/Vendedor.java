package com.xbrain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;

    @DateTimeFormat
    private LocalDateTime data;

    private int totalVendas;

    private int mediaVendasDiaria;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
    private List<Venda> vendas;
}

