/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Modelo;

/**
 *
 * @author MuAwa
 */
public class ModeloMotorista {

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    private int Codmotorista;
    private String NomeMotorista;
    private String Turno;
    private String pesquisa;

    /**
     * @return the Codmotorista
     */
    public int getCodmotorista() {
        return Codmotorista;
    }

    /**
     * @param Codmotorista the Codmotorista to set
     */
    public void setCodmotorista(int Codmotorista) {
        this.Codmotorista = Codmotorista;
    }

    /**
     * @return the NomeMotorista
     */
    public String getNomeMotorista() {
        return NomeMotorista;
    }

    /**
     * @param NomeMotorista the NomeMotorista to set
     */
    public void setNomeMotorista(String NomeMotorista) {
        this.NomeMotorista = NomeMotorista;
    }

    /**
     * @return the Turno
     */
    public String getTurno() {
        return Turno;
    }

    /**
     * @param Turno the Turno to set
     */
    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
}
