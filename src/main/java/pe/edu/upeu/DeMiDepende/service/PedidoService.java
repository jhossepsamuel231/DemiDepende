/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDepende.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.DeMiDepende.entity.Pedidos;
import pe.edu.upeu.DeMiDepende.repository.PedidosRepository;

/**
 *
 * @author HP
 */
@Service
public class PedidoService implements Operaciones<Pedidos> {

    @Autowired
    private PedidosRepository pedidosRepo;

    @Override
    public Pedidos create(Pedidos t) {
        t.setFecha(new Date());
        return pedidosRepo.save(t);
    }

    @Override
    public Pedidos update(Pedidos t) {
        t.setFecha(new Date());
        return pedidosRepo.save(t);
    }

    @Override
    public void delete(Long id) {
        pedidosRepo.deleteById(id);
    }

    @Override
    public Pedidos read(Long id) {
        return pedidosRepo.findById(id).get();
    }

    @Override
    public List<Pedidos> readAll() {
        return pedidosRepo.findAll();
    }

}
