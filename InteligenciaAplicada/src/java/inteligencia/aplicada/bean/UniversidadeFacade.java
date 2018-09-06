/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligencia.aplicada.bean;

import inteligencia.aplicada.model.Universidade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author flpj0
 */
@Stateless
public class UniversidadeFacade extends AbstractFacade<Universidade> {

    @PersistenceContext(unitName = "InteligenciaAplicadaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniversidadeFacade() {
        super(Universidade.class);
    }
    
}
