package com.ordermeal1.entities;

import com.ordermeal1.entities.Bebestible;
import com.ordermeal1.entities.Cliente;
import com.ordermeal1.entities.Edificio;
import com.ordermeal1.entities.Ensalada;
import com.ordermeal1.entities.Order1PK;
import com.ordermeal1.entities.Plato;
import com.ordermeal1.entities.Postre;
import com.ordermeal1.entities.TipoPago;
import com.ordermeal1.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-11T20:43:26")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Cliente> cliente;
    public static volatile SingularAttribute<Order1, Ensalada> ensalada;
    public static volatile SingularAttribute<Order1, Postre> postre;
    public static volatile SingularAttribute<Order1, Double> ordTotalPago;
    public static volatile SingularAttribute<Order1, Date> ordFechaRetiro;
    public static volatile SingularAttribute<Order1, TipoPago> tipoPago;
    public static volatile SingularAttribute<Order1, Usuario> usuario;
    public static volatile SingularAttribute<Order1, Plato> plato;
    public static volatile SingularAttribute<Order1, Edificio> edificio;
    public static volatile SingularAttribute<Order1, Date> ordFechaEmision;
    public static volatile SingularAttribute<Order1, Order1PK> order1PK;
    public static volatile SingularAttribute<Order1, Bebestible> bebestible;

}