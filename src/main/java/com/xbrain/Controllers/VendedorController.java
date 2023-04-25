package com.xbrain.Controllers;

import com.xbrain.Service.VendedorService;
import com.xbrain.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vendedor", method = RequestMethod.POST)
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @PostMapping("/cadastrar")
    public void cadastrarVendedor(@RequestBody Vendedor vendedor) {
        vendedorService.cadastrarVendedor(vendedor);
    }
}
