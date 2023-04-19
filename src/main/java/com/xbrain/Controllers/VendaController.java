package com.xbrain.Controllers;

import com.xbrain.Service.VendaService;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda criarVenda(@RequestBody Venda venda){
        return vendaService.criarVenda(venda);
    }
}
