package convDeMon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;





public class Curso1 {
	private Collection <String> camb= new ArrayList();
	//private Collection <Alumno> alumno= new LinkedHashSet();
	private Map<String, CambioNombre>cambMap=  new HashMap();
	
	
	
	public Curso1() {
	}



	public Collection<String> getCamb() {
		return camb;
	}



	public void setCamb(Collection<String> camb) {
		this.camb = camb;
	}



	public Map<String, CambioNombre> getCambMap() {
		return cambMap;
	}



	public void setCambMap(Map<String, CambioNombre> cambMap) {
		this.cambMap = cambMap;
	}



	public void addAlumno(String de_a, CambioNombre nombre) {
		this.camb.add(de_a);
		this.cambMap.put(de_a, nombre);
	}

}
