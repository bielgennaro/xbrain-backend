package com.xbrain.Service;

import com.xbrain.Repository.VendaRepository;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda criarVenda(Venda venda){
        return vendaRepository.save(venda);
    }
}
