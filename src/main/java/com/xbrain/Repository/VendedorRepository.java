package com.xbrain.Repository;

import com.xbrain.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {
    @Query
            ("SELECT v, COUNT(v), AVG(v.valor) FROM Venda  v WHERE v.data BETWEEN :dataInicial AND :dataFinal GROUP BY v.vendedor")
    List<Object[]> findVendedoresComTotalEMediaDeVendas(@Param("dataInicial") Date dataInicial, @Param("dataFinal") Date dataFinal);
}

