package com.xbrain.Repository;

import com.xbrain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
    List<Venda> findByVendedorIdAndDataBetween(int vendedor_id, LocalDateTime data, LocalDateTime data2);
}
