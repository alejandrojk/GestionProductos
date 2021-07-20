/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialproductos.modelos;

import java.util.ArrayList;
import tutorialproductos.entidades.Categoria;

/**
 *
 * @author Usuario
 */
public class CategoriaData {
    
    public ArrayList<Categoria> obtenerCategorias(){
        ArrayList<Categoria> lista=new ArrayList<>();
        lista.add(new Categoria(1,"Fiambres"));
        lista.add(new Categoria(2,"Lacteos"));
        lista.add(new Categoria(3,"Almacen"));
        lista.add(new Categoria(4,"Perfumeria"));
        return lista;
    }
    
}
