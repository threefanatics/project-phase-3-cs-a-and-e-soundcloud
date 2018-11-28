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
public class SongManager extends Account
{
    private SongManager(String name, String email, String mobile_number, String password)
    {
        super(name, email, mobile_number, password);
    }
    
    // static variable single_instance of type Singleton 
    private static SongManager song_manager = null; 
    public static SongManager getInstance(String name, String email, String mobile_number, String password) 
    { 
        if (song_manager == null) 
            SongManager.song_manager = new SongManager (name, email, mobile_number, password); 
        return song_manager; 
    } 
} 
