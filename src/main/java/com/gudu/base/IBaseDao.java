package com.gudu.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
/**
 * Hibernate 的dao操作
 * @author hanneng
 *
 * @param <T>
 */
public interface IBaseDao<T> {

	/**
	 * 保存实体
	 * @param t
	 */
	Serializable save(T t);
	/**
	 * 删除实体
	 * @param t
	 */
	void delete(T t);
	
	/**
	 * 更新实体
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 根据ID获取实体
	 * @param id
	 */
	T getById(Serializable id);
	
	/**
	 * 根据ID获得实体
	 * @param id
	 * @return
	 */
	T loadById(Serializable id);
	/**
	 *  通过IDs过的实体集合
	 * @param ids
	 * @return
	 */
	Collection<T> queryByIds(Serializable[] ids);
	/**
	 * 查询所有实体
	 * @return
	 */
	

	List<T> queryAll();
	/**
	 * 批处理
	 * @param hql
	 * @param objects
	 */
	void batchByHQL(String hql,Object...objects);
	/**
	 * 通过HQL获得实体
	 * @param hql
	 * @param objects
	 * @return
	 */
	List<T> queryByHQL(String hql,Object...objects);
	/**
	 * 根据HQL获得唯一结果
	 * @param hql
	 * @param objects
	 * @return
	 */
	Object uniqueResult (String hql,Object...objects);


	
	
	
	
}
