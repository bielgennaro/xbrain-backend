package com.xbrain.Service;

import com.xbrain.Repository.VendaRepository;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public void criarVenda(Venda venda) {
        venda.setData(LocalDateTime.now());
        vendaRepository.save(venda);
    }
}
