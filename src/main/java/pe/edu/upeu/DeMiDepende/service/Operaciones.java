/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.DeMiDepende.service;

import java.util.List;

/**
 *
 * @author HP
 */
public interface Operaciones<T> {
    T create(T t);
    T update(T t);
    void delete(Long id);
    T read(Long id);
    List<T> readAll();
}
