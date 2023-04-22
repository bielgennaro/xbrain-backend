package com.xbrain.Repository;

import com.xbrain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    List<Venda> findByVendedorIdAndDataBetween(Long vendedorId, LocalDate start, LocalDate end);
}
