package com.xbrain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime data;

    private String vendedor_nome;

    private Integer totalVendas;

    private Double mediaVendasDiaria;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
    private List<Venda> vendas;
}

