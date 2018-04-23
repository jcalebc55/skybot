/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author caleb
 */
public class Team implements Comparable<Team>{
    
    
    String teamName;
    int serialNo;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    Team(String teamName){
        setTeamName(teamName);
    
    
    }
    
    public String toString(){
    return teamName;
    }

    @Override
    public int compareTo(Team o) {
    return teamName.compareTo(o.teamName);
    
    }
    
    public boolean equals(Team o){
    
    return teamName.equals(o.teamName);
    }
    
    
}
