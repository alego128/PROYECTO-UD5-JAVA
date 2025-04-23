
package proyectoprogramacion;

public class Acceso { //Atributos
    private String usuario;
    private String hora;
    private String motivo;

    public Acceso(String usuario, String hora, String motivo) { //Constructor
        this.usuario = usuario;
        this.hora = hora;
        this.motivo = motivo;
    }

    //Getters
    public String getUsuario() {
        return usuario;
    }

    public String getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override //toString para imprimir los atributos actualizados
    public String toString() {
        return "---- Usuario: " + usuario + ", Hora: " + hora + ", Motivo: " + motivo + " ----";
    }
}
