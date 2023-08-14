package com.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pg.pojos.Tenant;
import com.pg.pojos.Login;

public interface TenantRepository extends JpaRepository<Tenant , Integer> {
	
	
	
	@Query(value="select * from tenants t where t.order_id=:loginId",nativeQuery = true)
	public Tenant getByLoginId(Integer loginId);
	
	/*
	 * @Query(
	 * value="select * from customers c,address a,orders o,branch b where c.address_id=a.address and c.order_id=o.order_id and b.branch_id=:br_id"
	 * ,nativeQuery = true) public List<Customer> getCustomerOrderDetails(Integer
	 * br_id);
	 */

	@Query("select c from Tenant t  where login=:loginId")
	public Tenant getTenantByLoginId(Login loginId);
	
	/*
	@Query("select c from Customer c where customer_id=:custId")
	public Tenant getOrderCustomerById(int custId);
	*/
}
