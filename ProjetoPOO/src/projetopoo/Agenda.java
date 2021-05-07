
package projetopoo;

import java.util.Calendar;

public class Agenda {
    
    String data;
    String hora;
    
    public Agenda(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }
/*
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
*/

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
