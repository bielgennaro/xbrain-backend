package com.xbrain.Controllers;

import com.xbrain.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @GetMapping("/total-media-vendas")
    public List<Object[]> findVendedoresComTotalEMediaDeVendas(
            @RequestParam("data-inicial") @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataInicial,
            @RequestParam("data-final") @DateTimeFormat(pattern = "dd-MM-yyyy") Date dataFinal) {
        return vendedorService.findVendedoresComTotalEMediaDeVendas(dataInicial, dataFinal);

    }

}
