
package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;


public class Turista {
    private String codigo;
    private String nombre; 
    private String apellidos;
    private String direccion;
    private String telefono;   
    private Sucursal sucursal;
    
    public Turista() {
    }

    public Turista(String codigo, String nombre, String apellidos, String direccion, String telefono,Sucursal sucursal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
