/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Controle;

import Model.Modelo.ModeloBus;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MuAwa
 */
public class ConexaoBus {
    ConexaoBD conex = new ConexaoBD();
    ModeloBus mod = new  ModeloBus();
    
    public void Salvar( ModeloBus mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Bus (PlacaBus) values (?)");
            pst.setString(1,mod.getPlaca());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados do Bus inseridos" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados do Bus nao inseridos : \n" +ex.getMessage());
        }
        conex.desconecta();
    
    
    
    }
    
    public  ModeloBus BustaBus( ModeloBus mod){
        
        conex.conexao();
        conex.executasql("select * from Bus where PlacaBus like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();//pegar 1 resultado
            mod.setCodbus(conex.rs.getInt("CodBus"));
            mod.setPlaca(conex.rs.getString("PlacaBus"));            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Bus: \n" +ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    
    }
    
    public void Editar( ModeloBus mod){
        conex.conexao();
        try {
            PreparedStatement  pst = conex.con.prepareStatement("update  Bus set  PlacaBus=? where CodBus=?");//alterar nao mudando o codigo
            pst.setString(1, mod.getPlaca());
            pst.setInt(2, mod.getCodbus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Bus nao existe \n" +ex.getMessage());
        }
        
        conex.desconecta();
    
    }
    
    
}
