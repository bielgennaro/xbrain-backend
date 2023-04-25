package com.xbrain.Service;

import com.xbrain.Repository.VendedorRepository;
import com.xbrain.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;


    public void cadastrarVendedor(Vendedor vendedor) {
        vendedor.setData(LocalDateTime.now());
        vendedorRepository.save(vendedor);
    }
}
