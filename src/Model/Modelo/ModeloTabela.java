/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Modelo;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloTabela extends AbstractTableModel {
    private ArrayList linhas = null;//colecao armazena qualquer obj
    private String[] colunas = null;//Vetor de String
    
    public ModeloTabela(ArrayList lin, String[] col){//construtor
        setLinhas(lin);
        setColunas(col);
    }
  
    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

   
   public int getColumnsCount(){
       return colunas.length;//conta numero de colunas
   
   }
   
   public int getRowCount(){
       return linhas.size();//conta numero de linhas
      
   }
   public String getColumnNome (int numCol){
       return colunas[numCol];//Retorno coluna com o nome
   
   }
   
   public Object getValueAt(int numLin,int numCol){//monta a tabela-
     Object[] linhas = (Object[])getLinhas().get(numLin); 
     return linhas[numCol];
   }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

  


    
}
