package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class KPIViewer extends Controller {

    public static void show(String slug) {
    	KeyProcessIndicator kpi = 
    		KeyProcessIndicator.find("bySlug", slug).first();

    	List<KPIData> kpiDataItems = 
    		KPIData.find("byKpi", kpi).fetch();
    	
    	//KeyProcessIndicator kpi = 
    //			new KeyProcessIndicator("semana",100,true);
    	//    List<KPIData> listaPontosRealizados = new ArrayList<KPIData>();
    	//    listaPontosRealizados.add(new KPIData(kpi,21,60,23));
    	//    listaPontosRealizados.add(new KPIData(kpi,22,60,42));    	    
    	//    listaPontosRealizados.add(new KPIData(kpi,23,60,86));
    	
        render(kpi, kpiDataItems);
    }

}