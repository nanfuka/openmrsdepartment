package org.openmrs.module.department.api.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.department.Department;
import org.openmrs.module.department.api.dao.DepartmentDAO;

/**
 * It is a default implementation of {@link DepartmentService}.
 */
public class DepartmentServiceImpl extends BaseOpenmrsService implements DepartmentService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private DepartmentDAO dao;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(DepartmentDAO dao) {
		this.dao = dao;
	}
	
	/**
	 * @return the dao
	 */
	public DepartmentDAO getDao() {
		return dao;
	}
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getAllDepartments()
	 */
	@Override
	public List<Department> getAllDepartments() {
		return dao.getAllDepartments();
	}
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
	 */
	@Override
	public Department getDepartment(Integer departmentId) {
		return dao.getDepartment(departmentId);
	}
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
	 */
	@Override
	public Department saveDepartment(Department department) {
		return dao.saveDepartment(department);
	}
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
	 */
	@Override
	public void purgeDepartment(Department department) {
		dao.purgeDepartment(department);
	}
}
