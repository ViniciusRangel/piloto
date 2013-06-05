/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class PilotoCorrida extends Atleta {
    
    private char categoria;
    private ArrayList<Premiacao> premiacoes;
    private int totalCorridas;
    private int totalVitorias;
    private int totalPolePositions;
    private String escuderia;
    
    public PilotoCorrida(String nome){
        super(nome);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalCorridas() {
        return totalCorridas;
    }

    public void setTotalCorridas(int totalCorridas) {
        this.totalCorridas = totalCorridas;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalPolePositions() {
        return totalPolePositions;
    }

    public void setTotalPolePositions(int totalPolePositions) {
        this.totalPolePositions = totalPolePositions;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
        
}
