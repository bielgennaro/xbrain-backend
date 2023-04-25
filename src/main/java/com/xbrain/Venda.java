package com.xbrain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @DateTimeFormat
    private LocalDateTime data;

    private Double valor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "vendedor_id", referencedColumnName = "id"),
            @JoinColumn(name = "vendedor_nome", referencedColumnName = "vendedor_nome")
    })
    private Vendedor vendedor;
}