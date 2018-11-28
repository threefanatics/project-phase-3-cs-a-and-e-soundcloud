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
public class Feedback 
{
    int user_id;
    int feedback_id;
    String feedback;

    public Feedback(int user_id, int feedback_id, String feedback) {
        this.user_id = user_id;
        this.feedback_id = feedback_id;
        this.feedback = feedback;
    }
    
    
    
}
