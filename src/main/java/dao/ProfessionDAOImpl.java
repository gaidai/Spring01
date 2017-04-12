/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Profession;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;



public class ProfessionDAOImpl implements ProfessionDAO {
 
    public Serializable addProfession(Profession p) {
        System.out.println("addProfession called");
        return null;
    }
 
    public void updateProfession(Profession p) {
        System.out.println("updateProfession called");
    }
 
    public void deleteProfession(Profession p) {
        System.out.println("deleteProfession called");
    }
 
    public List<Profession> findProfession() {
        System.out.println("findProfession called");
        List<Profession> list = new LinkedList<Profession>();
        list.add(new Profession());
        return list;
    }
 
}