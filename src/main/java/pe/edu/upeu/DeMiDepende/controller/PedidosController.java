/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.DeMiDepende.controller;

import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.upeu.DeMiDepende.entity.Pedidos;
import pe.edu.upeu.DeMiDepende.service.PedidoService;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/pedidos")
public class PedidosController {
    
    @Autowired
    private PedidoService pedidosService;
    
    @GetMapping("/listado")
    public String listarPedido(Model model){
        model.addAttribute("pedidos", pedidosService.readAll());
        return "pedido/pedido";
    }
    
    @GetMapping("/form")
    public String crearPedido(Model model){
        model.addAttribute("titulo", "Registrar Pedidos");
        model.addAttribute("pedido", new Pedidos());
        return "pedido/formPedido";
    }
    
    @PostMapping("/add")
    public String guardarPedido(@Valid @ModelAttribute Pedidos pedidos, BindingResult result, Model model, RedirectAttributes attributes){
        pedidosService.create(pedidos);
        return "redirect:/pedidos/listado";
    }
    
    @GetMapping("/del/{id}")
    public String eliminarPedido(Model model, @PathVariable("id") Long idPedido){
        pedidosService.delete(idPedido);
        return "redirect:/pedidos/listado";
    }
    
    @GetMapping("/edit/{id}")
    public String editarPedido(Model model, @PathVariable("id") Long idPedido){
        Pedidos pedido = pedidosService.read(idPedido);
        model.addAttribute("titulo","Modificar Pedido");
        model.addAttribute("pedido",pedido);
        return "pedido/formPedido";
    }
    
    @PostMapping("/{id}")
    public String leerPedido(Model model, @PathVariable("id") Long idPedido){
        model.addAttribute("pedido", pedidosService.read(idPedido));
        return "redirect:/pedido";
    }
}
