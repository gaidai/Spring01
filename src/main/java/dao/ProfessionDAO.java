/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Profession;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public interface ProfessionDAO {
 
    public Serializable addProfession(Profession p);
 
    public void updateProfession(Profession p);
 
    public void deleteProfession(Profession p);
 
    public List<Profession> findProfession();
}