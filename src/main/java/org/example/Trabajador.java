package org.example;

public class Trabajador extends Persona implements IArchivo {

	private String isapre;
	private String afp;

	public String getIsapre() {
		return this.isapre;
	}
	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}
	public String getAfp() {
		return this.afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Trabajador() {

	}

	@Override
	public void leer() {

	}

	@Override
	public void editar() {

	}

	@Override
	public void agregar() {

	}
}