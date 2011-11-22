package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void pie() {
        render();
    }

    public static void about() {
        render();
    }

    public static void semana() {
    		KeyProcessIndicator kpi = new KeyProcessIndicator("produtividade-semana");
    	
    	    List<KPIData> listaPontosRealizados = new ArrayList<KPIData>();
    	    listaPontosRealizados.add(new KPIData(kpi,21,60,23));
    	    listaPontosRealizados.add(new KPIData(kpi,22,60,42));    	    
    	    listaPontosRealizados.add(new KPIData(kpi,23,60,86));
    	
        render(kpi, listaPontosRealizados);
    }

}