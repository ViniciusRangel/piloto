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
public class ControlePilotoCorrida {
    private ArrayList<PilotoCorrida>listaPilotoCorrida;
    
    public ControlePilotoCorrida(){
        this.listaPilotoCorrida = new ArrayList<PilotoCorrida>();
    }
    
    public ArrayList<PilotoCorrida> getlistaPilotoCorridas() {
        return listaPilotoCorrida;
    }
    
    public void adicionar(PilotoCorrida piloto) {
        listaPilotoCorrida.add(piloto);
    }
    
    public void remover(PilotoCorrida piloto) {
        listaPilotoCorrida.remove(piloto);
    }
    
    public PilotoCorrida pesquisar(String nome) {
        for (PilotoCorrida p: listaPilotoCorrida) {
            if (p.getNome().equalsIgnoreCase(nome)) 
                return p;
        }
        return null;
    }
}
