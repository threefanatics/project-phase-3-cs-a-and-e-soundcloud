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
public class Account 
{
    String name;
    int account_id;
    String email;
    String mobile_number;
    String password;
    String blocked_until;

    public Account(String name, String email, String mobile_number, String password) 
    {
        this.name = name;
        this.email = email;
        this.mobile_number = mobile_number;
        this.password = password;
    }
    
}
