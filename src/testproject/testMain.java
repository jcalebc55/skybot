/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caleb
 */
public class testMain {
    public static void main(String[] args) {
        Team t1= new Team("team1");
        Team t2= new Team("team2");
        Team t3= new Team("team3");
        List<TeamGroup> list = new ArrayList<TeamGroup>(); 
        TeamGroup group1= new TeamGroup("Group1",t1,t2);
        list.add(group1);
        System.out.println(""+group1);
        TeamGroup group2= new TeamGroup("Group1",t1,t2);
        TeamGroup group3= new TeamGroup("Group1",t1,t3);
        System.out.println(""+group2);
        System.out.println(group2.equals(group1));
        System.out.println(list.contains(group3));
        
    }
}
