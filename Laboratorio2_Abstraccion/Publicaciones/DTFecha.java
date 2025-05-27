package Publicaciones;

	public class DTFecha {
	    public int dia;
	    public int mes;
	    public int anio;

	    public DTFecha(int dia, int mes, int anio) {
	        this.dia = dia;
	        this.mes = mes;
	        this.anio = anio;
	    }

	    @Override
	    public String toString() {
	        return dia + "/" + mes + "/" + anio;
	    }

	    public boolean esPosteriorA(DTFecha otra) {
	        if (this.anio > otra.anio) return true;
	        if (this.anio == otra.anio && this.mes > otra.mes) return true;
	        if (this.anio == otra.anio && this.mes == otra.mes && this.dia > otra.dia) return true;
	        return false;
	    }
	}



