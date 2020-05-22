/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openshop;

/**
 *
 * @author juan
 */
public class FormasPago {
    public String Tipo;
    
    
    public FormasPago(String tipo)
    {
        this.Tipo = tipo;
    }
    public String getTipo() {
            return this.Tipo;
    }
    public void setTipo(String value) {
            this.Tipo = value;
    }
    
}
