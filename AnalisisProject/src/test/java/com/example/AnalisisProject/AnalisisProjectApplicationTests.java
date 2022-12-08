package com.example.AnalisisProject;

import com.example.AnalisisProject.entity.CoordinadorCarrera;
import com.example.AnalisisProject.entity.OfertaLaboral;
import com.example.AnalisisProject.entity.Organizacion;
import com.example.AnalisisProject.repository.CoordinadorCarreraRepository;
import com.example.AnalisisProject.repository.OfertaLaboralRepository;
import com.example.AnalisisProject.repository.OrganizacionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AnalisisProjectApplicationTests {

	@Autowired
	OfertaLaboralRepository Oferta_Repo;

	@Autowired
	OrganizacionRepository Organizacion_Repo;

	@Autowired
	CoordinadorCarreraRepository Coordinador_Repo;

	@Test
	public void Lista_OfertasLaborales_Con_Al_Menos_Una_OfertaLaboral_Es_Valida(){
		List<OfertaLaboral> ofertasList = Oferta_Repo.findAll();
		assertTrue(ofertasList.size()>=1);
	}

	@Test
	public void Obtiene_una_OfertaLaboral_por_Id_y_compara_el_numero_de_vacante_para_validar_la_ofertaLaboral_Esperada(){
		OfertaLaboral oferta = Oferta_Repo.findById(1).get();
		assertEquals(5, oferta.getNumVacante());
	}

	@Test
	public void Modifica_un_atributo_de_la_ofertaLaboral_compara_que_no_sea_igual_al_anterior_valor_del_atributo(){
		OfertaLaboral oferta = Oferta_Repo.findById(1).get();
		oferta.setExtensionContrato(5);
		Oferta_Repo.save(oferta);
		assertNotEquals(3,Oferta_Repo.findById(1).get().getExtensionContrato());
	}



	@Test
	public void Lista_las_Organizaciones_Con_Al_Menos_Una_Organizacion_Es_Valida(){
		List<Organizacion> organizaciones = Organizacion_Repo.findAll();
		assertTrue(organizaciones.size()>=1);
	}

	@Test
	public void Obtiene_una_Organizacion_por_Id_y_compara_el_numero_de_telefono_para_validar_la_organizacion_Esperada(){
		Organizacion organizacion = Organizacion_Repo.findById(1).get();
		assertEquals("22551111", organizacion.getTelefono());
	}

	@Test
	public void Modifica_un_atributo_de_la_organizacion_y_compara_que_no_sea_igual_al_anterior_valor_del_atributo(){
		Organizacion organizacion = Organizacion_Repo.findById(1).get();
		organizacion.setTelefono("22551111");
		Organizacion_Repo.save(organizacion);
		assertNotEquals("4444444",Organizacion_Repo.findById(1).get().getTelefono());
	}


	@Test
	public void Lista_los_coordinadores_y_Con_Al_Menos_Un_coordinador_Es_Valida(){
		List<CoordinadorCarrera> coordinadorCarrera = Coordinador_Repo.findAll();
		assertTrue(coordinadorCarrera.size()>=1);
	}

	@Test
	public void Obtiene_un_coordinador_por_Id_y_compara_el_nombre_para_validar_el_coordinador_Esperado(){
		CoordinadorCarrera coordinadorCarrera = Coordinador_Repo.findById(1).get();
		assertEquals("Alvaro", coordinadorCarrera.getNombre());
	}

	@Test
	public void Modifica_un_atributo_del_coordinador_y_compara_que_no_sea_igual_al_anterior_valor_del_atributo(){
		CoordinadorCarrera coordinadorCarrera = Coordinador_Repo.findById(1).get();
		coordinadorCarrera.setCorreoPersonal("alvaro@hotmail.com");
		Coordinador_Repo.save(coordinadorCarrera);
		assertNotEquals("alvaro@gmail.com",Coordinador_Repo.findById(1).get().getCorreoPersonal());
	}


}
