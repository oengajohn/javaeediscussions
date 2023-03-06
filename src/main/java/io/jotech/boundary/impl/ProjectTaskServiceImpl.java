package io.jotech.boundary.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import io.jotech.boundary.ProjectService;
import io.jotech.entity.Project;

@Stateless
public class ProjectTaskServiceImpl extends AbstractBeanImpl<Project, Long> implements ProjectService {

  @PersistenceContext(unitName = "pu")
  private EntityManager em;

  public ProjectTaskServiceImpl() {
    super(Project.class);
  }

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }
}