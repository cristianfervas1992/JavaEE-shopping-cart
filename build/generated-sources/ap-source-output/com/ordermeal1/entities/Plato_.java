package com.ordermeal1.entities;

import com.ordermeal1.entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-11T20:43:26")
@StaticMetamodel(Plato.class)
public class Plato_ { 

    public static volatile SingularAttribute<Plato, String> plaDetalles;
    public static volatile SingularAttribute<Plato, Integer> idPlato;
    public static volatile ListAttribute<Plato, Order1> order1List;
    public static volatile SingularAttribute<Plato, String> plaNombre;
    public static volatile SingularAttribute<Plato, Boolean> plaEspecial;
    public static volatile SingularAttribute<Plato, Double> plaPrecio;

}