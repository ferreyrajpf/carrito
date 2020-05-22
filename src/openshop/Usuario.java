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
public class Usuario {
	private String nombre;
	private String email;
	private int dni;
	private int telefono;
	private String contrasena;
	
	public Usuario(String nombre, String email, int dni, int telefono, String contrasena)
	{
		this.nombre = nombre;
		this.email=email;
		this.dni=dni;
		this.telefono=telefono;
		this.contrasena=contrasena;
	}
}