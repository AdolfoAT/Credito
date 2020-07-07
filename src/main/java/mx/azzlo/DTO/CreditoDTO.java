/**
 * 
 */
package mx.azzlo.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Marco
 *
 */
@Entity
public class CreditoDTO {

	
	private @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(name = "monto")
	private int monto;
	
	@Column(name = "plazo")
	private int plazo;
	
	@Column(name = "tipo_credito")
	private String tipo_credito;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	 * @return the plazo
	 */
	public int getPlazo() {
		return plazo;
	}

	/**
	 * @param plazo the plazo to set
	 */
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	/**
	 * @return the tipo_credito
	 */
	public String getTipo_credito() {
		return tipo_credito;
	}

	/**
	 * @param tipo_credito the tipo_credito to set
	 */
	public void setTipo_credito(String tipo_credito) {
		this.tipo_credito = tipo_credito;
	}

	@Override
	public String toString() {
		return "CreditoDTO [id=" + id + ", monto=" + monto + ", plazo=" + plazo + ", tipo_credito=" + tipo_credito
				+ ", getId()=" + getId() + ", getMonto()=" + getMonto() + ", getPlazo()=" + getPlazo()
				+ ", getTipo_credito()=" + getTipo_credito() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + monto;
		result = prime * result + plazo;
		result = prime * result + ((tipo_credito == null) ? 0 : tipo_credito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditoDTO other = (CreditoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (monto != other.monto)
			return false;
		if (plazo != other.plazo)
			return false;
		if (tipo_credito == null) {
			if (other.tipo_credito != null)
				return false;
		} else if (!tipo_credito.equals(other.tipo_credito))
			return false;
		return true;
	}

	
}
