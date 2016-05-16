package ingsoftware.la10uniformes_ingsoft;

/**
 * Created by Desktop on 13/05/2016.
 */
public class Usuario {

    private String idUsuario;
    private String nombre;
    private String documento;
    private String email;
    private String contraseña;
    private String rol;

    public Usuario(String idUsuario, String nombre, String documento, String email, String contraseña, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
