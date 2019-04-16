/*
 * package com.revature.daos;
 * 
 * import java.util.List;
 * 
 * import org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.revature.domains.Cave;
 * 
 * @Component
 * 
 * @Transactional public class CaveDaoImpl implements CaveDao {
 * 
 * @Autowired private SessionFactory mySessionFactory;
 * 
 * public void createCave(Cave cave) {
 * mySessionFactory.getCurrentSession().save(cave); }
 * 
 * public Cave readCave(Integer id) { return
 * mySessionFactory.getCurrentSession().get(Cave.class, id); }
 * 
 * public List<Cave> readAllCaves() { return
 * mySessionFactory.getCurrentSession().createCriteria(Cave.class).list(); }
 * 
 * public void updateCave(Cave cave) {
 * mySessionFactory.getCurrentSession().update(cave); }
 * 
 * public void deleteCave(Cave cave) {
 * mySessionFactory.getCurrentSession().delete(cave); }
 * 
 * }
 */