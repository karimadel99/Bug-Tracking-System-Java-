/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package admin;

import java.util.List;

public interface AdminController {
    public void add(Admin Role);   //This shouldnt be an admin role rather an Engineer Role but i dont have the actual model
    public void update(Admin Role);
    public void delete(Admin Role);
    public Admin get(String Name);
    public List<Admin> list(); //To show the whole table
    public boolean loginAdmin(String Name, String Password);
}
