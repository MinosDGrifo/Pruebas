package modeo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")

public class persona {
	@Id
	@GeneratedValue=GeneraType.IDENTITY;
	private Integer id;
	private String nombre;
	private String telefono;
	public persona() {
		super();
	}
	public persona(Integer id, String nombre, String telefono) {
		super();
		id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
