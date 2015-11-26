package com.gudu.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class BaseDaoImpl<T> implements IBaseDao<T> {

	private Class<T> clazz;

	@Resource
	private SessionFactory sessionFactory;

	@Resource
	private JdbcTemplate jdbcTemplate;


	public Session getSession() {
		System.out.println(sessionFactory);
		return sessionFactory.getCurrentSession();
	}
	public JdbcTemplate getJdbcTemplate(){
		return jdbcTemplate;
	}

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	public Serializable save(T t) {
		return  getSession().save(t);
	}

	public void delete(T t) {
		getSession().delete(t);
	}

	public void update(T t) {
		getSession().update(t);
	}

	@SuppressWarnings("unchecked")
	public T getById(Serializable id) {
		return (T) getSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public T loadById(Serializable id) {
		return (T) getSession().load(clazz, id);
	}

	public Collection<T> queryByIds(Serializable[] ids) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> queryAll() {
		return getSession().createCriteria(clazz).list();
	}

	public void batchByHQL(String hql, Object... objects) {
		Query query = getSession().createQuery(hql);
		if (objects != null) {
			for (int i = 0; i < objects.length; i++)
				query.setParameter(i, objects[i]);
		}
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<T> queryByHQL(String hql, Object... objects) {
		Query query = getSession().createQuery(hql);
		if (objects == null) {
			return query.list();
		}
		for (int i = 0; i < objects.length; i++) {
			query.setParameter(i, objects[i]);
		}
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	public Object uniqueResult(String hql, Object... objects) {
		Query query = getSession().createQuery(hql);
		if (objects == null) {
			return  query.uniqueResult();
		}
		for (int i = 0; i < objects.length; i++)
			query.setParameter(i, objects[i]);
		return  query.uniqueResult();
	}
}
