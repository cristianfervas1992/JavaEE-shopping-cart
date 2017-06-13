package com.ordermeal1.entities;

import com.ordermeal1.entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-11T20:43:26")
@StaticMetamodel(Edificio.class)
public class Edificio_ { 

    public static volatile SingularAttribute<Edificio, Integer> idEdificio;
    public static volatile SingularAttribute<Edificio, String> ediDireccion;
    public static volatile ListAttribute<Edificio, Order1> order1List;
    public static volatile SingularAttribute<Edificio, String> ediNombre;

}