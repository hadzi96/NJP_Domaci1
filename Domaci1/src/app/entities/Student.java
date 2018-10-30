package app.entities;

import java.util.Date;

import app.annotations.Column;
import app.annotations.Entity;
import app.annotations.OneToOne;
import app.annotations.Table;

@Entity
@Table(name = "student")
public class Student extends BasicEntity {
	@Column(name = "ime")
	private String ime;

	private float nekiParametar = 55.5f;

	@OneToOne
	private Ocena ocena = new Ocena("Napredna Java", 10);

	private Date datum = new java.sql.Date(System.currentTimeMillis());

	@Column(name = "prezime")
	private String prezime;

	public Student(String ime, String prezime) {
		super(1);
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}
