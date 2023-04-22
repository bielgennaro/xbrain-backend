package com.xbrain.Service;

import com.xbrain.Repository.VendaRepository;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
@RequestMapping
@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping
    public void criarVenda(Venda venda) {
        venda.setData(LocalDateTime.now());
        vendaRepository.save(venda);
    }
}
