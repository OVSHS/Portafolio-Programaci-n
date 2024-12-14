/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg3.semana_8;

/**
 *
 * @author TYT
 */
public class Cliente {
    private String nombreCompleto;
    private String direccion;
    private String numeroTelefono;
    private String tipoCliente;

    public Cliente(String nombreCompleto, String direccion, String numeroTelefono, String tipoCliente) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.tipoCliente = tipoCliente.toLowerCase();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
