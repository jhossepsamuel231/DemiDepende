/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.DeMiDepende.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upeu.DeMiDepende.entity.Pedidos;

/**
 *
 * @author HP
 */
public interface PedidosRepository extends JpaRepository<Pedidos, Long>{
    
}
