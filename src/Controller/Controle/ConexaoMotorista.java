/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Controle;

import Model.Modelo.ModeloMotorista;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoMotorista {
    
    ConexaoBD conex = new ConexaoBD();
    ModeloMotorista mod = new ModeloMotorista();
    
    public void Salvar(ModeloMotorista mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Funcionarios (NomeFuncionarios,Turno) values (?,?)");
            pst.setString(1,mod.getNomeMotorista());
            pst.setString(2,mod.getTurno());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados do motorista inseridos" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados do motorista nao inseridos : \n" +ex.getMessage());
        }
        conex.desconecta();
    
    
    
    }
    
    public ModeloMotorista BustaMotorista(ModeloMotorista mod){
        
        conex.conexao();
        conex.executasql("select * from Funcionarios where NomeFuncionarios like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();//pegar 1 resultado
            mod.setCodmotorista(conex.rs.getInt("CodFuncionarios"));
            mod.setNomeMotorista(conex.rs.getString("NomeFuncionarios"));
            mod.setTurno(conex.rs.getString("Turno"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Motorista: \n" +ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    
    }
    
    public void Editar(ModeloMotorista mod){
        conex.conexao();
        try {
            PreparedStatement  pst = conex.con.prepareStatement("update  Funcionarios set  NomeFuncionarios=?,Turno=? where CodFuncionarios=?");//alterar nao mudando o codigo
            pst.setString(1, mod.getNomeMotorista());
            pst.setString(2, mod.getTurno());
            pst.setInt(3, mod.getCodmotorista());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Motorista nao existe \n" +ex.getMessage());
        }
        
        conex.desconecta();
    
    }
       
    
}
