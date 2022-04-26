
package Model.Modelo;


public class ModeloItinerario {
    private String pesquisa;
    private int codIti;
    private int codItiMoto;
    private int codItiBus;
    private String Lugar;

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

    /**
     * @return the codIti
     */
    public int getCodIti() {
        return codIti;
    }

    /**
     * @param codIti the codIti to set
     */
    public void setCodIti(int codIti) {
        this.codIti = codIti;
    }

    /**
     * @return the codItiMoto
     */
    public int getCodItiMoto() {
        return codItiMoto;
    }

    /**
     * @param codItiMoto the codItiMoto to set
     */
    public void setCodItiMoto(int codItiMoto) {
        this.codItiMoto = codItiMoto;
    }

    /**
     * @return the Lugar
     */
    public String getLugar() {
        return Lugar;
    }

    /**
     * @param Lugar the Lugar to set
     */
    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    /**
     * @return the codItiBus
     */
    public int getCodItiBus() {
        return codItiBus;
    }

    /**
     * @param codItiBus the codItiBus to set
     */
    public void setCodItiBus(int codItiBus) {
        this.codItiBus = codItiBus;
    }
}
