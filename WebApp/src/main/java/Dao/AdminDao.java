package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import Dto.Customer1;
//import Dto.Customer;
import Dto.Operator;

public class AdminDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void sign(Operator o){
	
	entityTransaction.begin();
	entityManager.persist(o);
	entityTransaction.commit();
	
}
public Operator  login(String Operator_UserName){
	Operator op=entityManager.find(Operator.class, Operator_UserName );
	return op;
}
public void create(Customer1 c) {
	
	entityTransaction.begin();
	entityManager.persist(c);
	entityTransaction.commit();
	

}
public void edit(Customer1 d){
	
	entityTransaction.begin();
	entityManager.merge(d);
	entityTransaction.commit();
}
public  Customer1 find(int customer_id) {
	// TODO Auto-generated method stub
	Customer1 customer=entityManager.find(Customer1.class,customer_id ); 
	return customer;
	
}
public Customer1 fetch(int customer_id){
	Customer1 d=entityManager.find(Customer1.class,  customer_id); 
	return d;
}
public void delete(Customer1 d){
	
	entityTransaction.begin();
	entityManager.remove(d);
	entityTransaction.commit();
}
public  Customer1 findbyId(int customer_id) {
	// TODO Auto-generated method stub
	Customer1 customer=entityManager.find(Customer1.class,customer_id ); 
	return customer;
	
}
	
}
