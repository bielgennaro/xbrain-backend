package com.xbrain.Service;

import com.xbrain.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public List<Object[]> findVendedoresComTotalEMediaDeVendas(Date dataInicial, Date dataFinal){
        return vendedorRepository.findVendedoresComTotalEMediaDeVendas(dataInicial, dataFinal);
    }

}
