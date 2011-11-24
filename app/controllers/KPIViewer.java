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
    	
        render(kpi, kpiDataItems);
    }
    
    public static void all(){
		List<KeyProcessIndicator> kpis = 
			KeyProcessIndicator.all().fetch();

        render(kpis);
    	
    }

}