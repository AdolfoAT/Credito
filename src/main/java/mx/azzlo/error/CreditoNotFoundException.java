/**
 * 
 */
package mx.azzlo.error;

/**
 * @author Marco
 *
 */
public class CreditoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreditoNotFoundException(Long id) {
		super("No se encontro Credito con ID: "+id);
	}

}
