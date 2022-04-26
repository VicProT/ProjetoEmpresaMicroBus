/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Controle;

import Model.Modelo.ModeloItinerario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MuAwa
 */
public class ConexaoItinerario {
    
    
    ConexaoBD conex = new ConexaoBD();
    ModeloItinerario mod = new  ModeloItinerario  ();
    
    public void Salvar( ModeloItinerario  mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Itinerario (CodFuncionarios,CodBus,Lugar) values (?,?,?)");
            pst.setInt(1,mod.getCodItiMoto());
            pst.setInt(2,mod.getCodItiBus());
            pst.setString(3,mod.getLugar());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados do Itinerario inseridos" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados do Itinerario nao inseridos : \n" +ex.getMessage());
        }
        conex.desconecta();
    
    
    
    }
    
    public  ModeloItinerario BustaIti( ModeloItinerario mod){
        
        conex.conexao();
        conex.executasql("select * from Itinerario where CodItinerario like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();//pegar 1 resultado
            mod.setCodIti(conex.rs.getInt("CodItinerario"));
            mod.setCodItiMoto(conex.rs.getInt("CodFuncionarios")); 
            mod.setCodIti(conex.rs.getInt("CodBus"));
            mod.setLugar(conex.rs.getString("Lugar"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Itinerario: \n" +ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    
    }
    
    public void Editar( ModeloItinerario mod){
        conex.conexao();
        try {
            PreparedStatement  pst = conex.con.prepareStatement("update  Itinerario set  CodItinerario=? where CodItinerario=?");//alterar nao mudando o codigo
            pst.setInt(1, mod.getCodIti());
            pst.setInt(2, mod.getCodItiMoto());
            pst.setInt(3, mod.getCodItiBus());
            pst.setString(4, mod.getLugar());
            pst.setInt(5, mod.getCodIti());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Itinerario nao existe \n" +ex.getMessage());
        }
        
        conex.desconecta();
    
    }
    
    
}
