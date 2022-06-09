package parte_1.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import parte_1.Alumno;

public class TestAlumno {
	Alumno vacio;
	Alumno lleno;
	List<Alumno> Alumnos_list;
	Set<Alumno> Alumnos_set;
		
	@Before
	public void setUp() {
		vacio = new Alumno();
		lleno = new Alumno("Esteban","quito",255);
		
		Alumnos_list = new ArrayList<>();
		
		Alumnos_list.add(new Alumno());
		Alumnos_list.add(new Alumno("A","A",1));
		Alumnos_list.add(new Alumno("B","B",2));
		Alumnos_list.add(new Alumno("C","C",3));
		Alumnos_list.add(new Alumno("D","D",-4));
		
		Alumnos_set = new HashSet<Alumno>();
		
		Alumnos_set.add(new Alumno());
		Alumnos_set.add(new Alumno("A","A",1));
		Alumnos_set.add(new Alumno("B","B",2));
		Alumnos_set.add(new Alumno("C","C",3));
		Alumnos_set.add(new Alumno("D","D",-4));
	} 
	
	@After
	public void tearDown() throws Exception{
		vacio = null;
		lleno = null;
		Alumnos_list = null;
		Alumnos_set = null;
	}
	
	@Test
	public void test_vacio_nombre() {
		assertEquals("vacio",vacio.getNombre());
	}
	
	@Test
	public void test_vacio_apellido() {
		assertEquals("vacio",vacio.getApellido());
	}
	
	@Test
	public void test_vacio_legajo() {
		assertEquals(0,vacio.getLegajo());
	}
	
	@Test
	public void test_lleno_nombre() {
		assertEquals("Esteban",lleno.getNombre());
	}
	
	@Test
	public void test_lleno_apellido() {
		assertEquals("quito",lleno.getApellido());
	}
	
	@Test
	public void test_lleno_legajo() {
		assertEquals(255,lleno.getLegajo());
	}
	
	@Test
	public void test_list() {
		assertTrue(Alumnos_list.contains(new Alumno("A","A",1)));
		assertTrue(Alumnos_list.contains(new Alumno("B","B",2)));
		assertTrue(Alumnos_list.contains(new Alumno("C","C",3)));
		assertTrue(Alumnos_list.contains(new Alumno("D","D",-4)));
		assertFalse(Alumnos_list.contains(new Alumno("ZZ","ZZ",300)));
		assertFalse(Alumnos_list.contains(new Alumno("","",0)));
	}
	
	@Test
	public void test_set() {
		assertTrue(Alumnos_set.contains(new Alumno("A","A",1)));
		assertTrue(Alumnos_set.contains(new Alumno("B","B",2)));
		assertTrue(Alumnos_set.contains(new Alumno("C","C",3)));
		assertTrue(Alumnos_set.contains(new Alumno("D","D",-4)));
		assertFalse(Alumnos_set.contains(new Alumno("ZZ","ZZ",300)));
		assertFalse(Alumnos_set.contains(new Alumno("","",0)));
	}
	
	@Test
	public void test_set_add() {
		assertFalse(Alumnos_set.add(new Alumno("A","A",1)));
	}
	
}
