package com.xbrain.Service;

import com.xbrain.Repository.VendaRepository;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> findByVendedorIdAndDataBetween(int vendedor_id, LocalDateTime data, LocalDateTime data2){
        return vendaRepository.findByVendedorIdAndDataBetween(vendedor_id, data, data2);
    }

    public void criarVenda(Venda venda) {
        venda.setData(LocalDateTime.now());
        vendaRepository.save(venda);
    }
}
