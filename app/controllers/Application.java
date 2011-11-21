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

    public static void graph() {
    	    List listaPontosRealizados = new ArrayList();
    	    listaPontosRealizados.add(new MetricItem(21,60,23));
    	    listaPontosRealizados.add(new MetricItem(22,60,42));    	    
    	    listaPontosRealizados.add(new MetricItem(23,60,86));
    	
        render(listaPontosRealizados);
    }

}