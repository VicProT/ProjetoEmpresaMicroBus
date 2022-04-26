
package Controller.Controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBD {
    public Statement stm; //Busca
    public ResultSet rs; //Guarda Busca
    private String driver = "com.mysql.jdbc.Driver"; //Serviço
    private String caminho =  "jdbc:mysql://localhost:3306/empresabus"; //Local do Banco
    private String usuario = "root"; //Usuario do banco
    private String senha = "2108mort";  //Senha do banco
    public Connection con; //Conecta ao banco
    
    public void conexao(){
        
        
        try {
            System.setProperty("jdbc.Drivers", driver);//setar propriedade do drive de conexao
            con = DriverManager.getConnection(caminho, usuario, senha);//Conecta com o banco
            //JOptionPane.showMessageDialog(null,"Conexao feita");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Conexao nao feita : \n" +ex.getMessage());
        }
   
    }
    
    public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"Desconexao feita : \n");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Desconexao nao feita : \n" +ex.getMessage());
        }
    
    }
    
    public void executasql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);//type diferencia M m e CONCUR percorre a lista
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ExecutaSQL nao feito : \n"+ex);
        }
        
    
    }
  
    
    
    
}
