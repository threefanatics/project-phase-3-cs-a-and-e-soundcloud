/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

/**
 *
 * @author Ibrahim
 */
class CustomerService extends Account
{ 
    private CustomerService(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    
    // static variable single_instance of type Singleton 
    private static CustomerService customer_service = null; 
    public static CustomerService getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (customer_service == null) 
            CustomerService.customer_service = new CustomerService (name, email, mobile_number, password); 
        return customer_service; 
    } 
} 

