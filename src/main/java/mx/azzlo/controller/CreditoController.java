/**
 * 
 */
package mx.azzlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.azzlo.DTO.CreditoDTO;
import mx.azzlo.error.CreditoNotFoundException;

import mx.azzlo.repository.CreditoRepository;

/**
 * @author Marco
 *
 */

@RestController
@RequestMapping("/Credito")
public class CreditoController {

	@Autowired
	CreditoRepository credito;

	@GetMapping("{id}")
	CreditoDTO One(@PathVariable Long id) {
		return credito.findById(id).orElseThrow(() -> new CreditoNotFoundException(id));
	}

	@PostMapping
	CreditoDTO newProveedor(@RequestBody CreditoDTO proveedor) {
		return credito.save(proveedor);
	}

	@PutMapping("{id}")
	CreditoDTO actualizar(@RequestBody CreditoDTO newCredito, @PathVariable Long id) {
		return credito.findById(id).map(CreditoDTO -> {
			CreditoDTO.setMonto(newCredito.getMonto());
			CreditoDTO.setPlazo(newCredito.getPlazo());
			CreditoDTO.setTipo_credito(newCredito.getTipo_credito());
			return credito.save(newCredito);
		}).orElseGet(() -> {
			newCredito.setId(id);
			return credito.save(newCredito);
		});
	}
	
	@DeleteMapping("{id}")
	void elimnar(@PathVariable Long id) {
		credito.deleteById(id);
	}
	

}
