/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.trabajofinalap;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

public class GestorOrdenes {
    /*

    public void ingresarOrden(String descripcionOrden, double costo, Date fechaOrden, String estado, String dniCliente, int idCategoria, int idTecnico) {
        Cliente cliente = obtenerClientePorDni(dniCliente);
        if (cliente == null) {
            // Si el cliente no existe, crear uno nuevo
            // cliente = crearNuevoCliente(dniCliente, nombre, direccion, mail);
        }

       Tecnico tecnico = obtenerTecnicoPorId(idTecnico);
       Categoria categoria = obtenerCategoriaPorId(idCategoria);
       

        Orden nuevaOrden = new Orden(descripcionOrden,costo,fechaOrden,estado,cliente,categoria,tecnico);
        nuevaOrden.setDescripcionOrden(descripcionOrden);
        nuevaOrden.setCosto(costo);
        nuevaOrden.setFechaOrden(fechaOrden);
        nuevaOrden.setEstado(estado);
        nuevaOrden.setCliente(cliente);
        nuevaOrden.setCategoria(idCategoria);
        nuevaOrden.setTecnico(tecnico);

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(nuevaOrden);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Orden> listarOrdenesPorFechas(Date fechaInicio, Date fechaFin) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Orden> criteria = builder.createQuery(Orden.class);
            Root<Orden> root = criteria.from(Orden.class);

            criteria.select(root)
                    .where(builder.between(root.get("fechaOrden"), fechaInicio, fechaFin));

            return session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public Cliente obtenerClientePorDni(String dniCliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Cliente> criteria = builder.createQuery(Cliente.class);
            Root<Cliente> root = criteria.from(Cliente.class);

            criteria.select(root)
                    .where(builder.equal(root.get("dni"), dniCliente));

            return session.createQuery(criteria).uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public Tecnico obtenerTecnicoPorId(int idTecnico) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(Tecnico.class, idTecnico);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    // Métodos adicionales para obtener categoría, otras operaciones, etc.

    private Categoria obtenerCategoriaPorId(int idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } */
}