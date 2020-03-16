package com.wilsonmarques.cursomc.cursomc.services;

import java.util.Optional;

import com.wilsonmarques.cursomc.cursomc.domain.Pedido;
import com.wilsonmarques.cursomc.cursomc.repositories.PedidoRepository;
import com.wilsonmarques.cursomc.cursomc.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}