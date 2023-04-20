package com.xbrain.Repository;

import com.xbrain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
    List<Venda> findByDataBetween(Date dataInicial, Date dataFinal);

}
