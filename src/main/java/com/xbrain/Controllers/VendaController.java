package com.xbrain.Controllers;

import com.xbrain.Service.VendaService;
import com.xbrain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/venda", produces = MediaType.APPLICATION_JSON_VALUE)
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @ResponseBody
    @PostMapping("/cadastrar-venda")
    public void criarVenda(@RequestBody Venda venda) {
       vendaService.criarVenda(venda);
    }
}
