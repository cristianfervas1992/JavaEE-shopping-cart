package com.ordermeal1.entities;

import com.ordermeal1.entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-11T20:43:26")
@StaticMetamodel(Ensalada.class)
public class Ensalada_ { 

    public static volatile SingularAttribute<Ensalada, Integer> idEnsalada;
    public static volatile SingularAttribute<Ensalada, String> ensNombre;
    public static volatile SingularAttribute<Ensalada, Double> ensPrecio;
    public static volatile ListAttribute<Ensalada, Order1> order1List;

}