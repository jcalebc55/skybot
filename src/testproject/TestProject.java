/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author caleb
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static List<TeamGroup> existingTeamGroups = new ArrayList<TeamGroup>();
    public static int noOfMatchUps=5;
    public static void main(String[] args) {
        // TODO code application logic here
        
    List<Team> teams=  new ArrayList<Team>();
    FillTeams(teams);
    
    for(int i=0;i< teams.size();i++)
    System.out.println(teams.get(i));
    
    List<TeamGroup> teamGroups=  new ArrayList<TeamGroup>();
    
    boolean b= fillTeamGroups(teams,teamGroups,existingTeamGroups);
    
    for(int i=0;i< teamGroups.size() && b;i++)
    System.out.println(teamGroups.get(i));
    createMatchUps(teamGroups);
    
    
     for(int i=0;i<=1000 && noOfMatchUps >0 ;i++){
    teamGroups.clear();
         Collections.shuffle(teams);
      b= fillTeamGroups(teams,teamGroups,existingTeamGroups);
     if(b){
    createMatchUps(teamGroups); 
    noOfMatchUps--;
     }
     
     }
                                            
    }   

    private static void FillTeams(List<Team> teams) {
     teams.add(new Team("team1"));
     teams.add(new Team("team2"));
     teams.add(new Team("team3"));
     teams.add(new Team("team4"));
     teams.add(new Team("team5"));
     teams.add(new Team("team6"));
     teams.add(new Team("team7"));
     teams.add(new Team("team8"));
     
    }

    private static boolean fillTeamGroups(List<Team> teams,List teamGroups,List existingList) {
     
      for(int i=0;i<teams.size();i=i+2)
      {
          Team team1=(Team)teams.get(i);
          Team team2=(Team)teams.get(i+1);
          if(team1.compareTo(team2)>1){
          
          }else{
          Team teamTemp=team1;
          team1=team2;
          team2=teamTemp;
          }
          
       TeamGroup teamGroup= new TeamGroup("TeamGroup"+i,team1,team2);
       
       if(!existingTeamGroups.contains(teamGroup))
       {existingTeamGroups.add(teamGroup);
       teamGroups.add(teamGroup); 
       
                                            }
       else{
           existingTeamGroups.removeAll(teamGroups);
       teamGroups.clear();
       return false;
       }
      
      }
        return true;
        
    }

    private static void createMatchUps(List<TeamGroup> teamGroups) {
       System.out.println("match ups in current team Group");
        for(int i=0;i<teamGroups.size()-1;i=i+2){
        System.out.println((TeamGroup)teamGroups.get(i)+" vs "+(TeamGroup)teamGroups.get(i+1));
        
        
        }
        
        
    }

    





                            }
