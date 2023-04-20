package com.xbrain;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDateTime data;

    private BigDecimal valor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_vendedor"))
    private Vendedor vendedor;
}