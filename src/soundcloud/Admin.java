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


class Admin extends Account
{ 
    private Admin(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    
    // static variable single_instance of type Singleton 
    private static Admin admin = null; 
    public static Admin getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (admin == null) 
            Admin.admin = new Admin (name, email, mobile_number, password); 
        return admin; 
    } 
    public void changePassword(int id, String pass)
    {
        this.requestUser(id);
    }
} 
