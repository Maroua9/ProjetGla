package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.ICategorieDao;
import tn.essat.dao.IClientDao;
import tn.essat.dao.IProduitDao;
import tn.essat.model.Client;
import tn.essat.model.Produit;

@CrossOrigin("*")
@RestController
@RequestMapping(path="/rest")
public class AppRest {
    @Autowired
	IProduitDao daop;
	@Autowired
	ICategorieDao daoc;
	@Autowired
	IClientDao daocl;
	
	@GetMapping("/produits")
	public List<Produit> get1(){
		return daop.findAll();
	}
	@GetMapping("/produits/{id}")
	public List<Produit> get2(@PathVariable("id") int id) {
		return daop.getAllProduitByCat(id);
	}
	
	@GetMapping("/verif/{email}/{password}")
	public Client get3(@PathVariable("email") String email ,@PathVariable("password") String password){
		return daocl.verif(email, password);
		}
	
	@PostMapping("/addProduit")
	public void addP(@RequestBody Produit p){
		daop.save(p);
	}
	@DeleteMapping("/deleteProduit/{id}")
	public void get5(@PathVariable("id") int id){
		daop.deleteById(id);
	}
	

}
