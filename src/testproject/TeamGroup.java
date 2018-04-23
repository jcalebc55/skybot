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
public class TeamGroup {
    String groupName;
    Team team1;
    Team team2;
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }
    

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    TeamGroup(String groupName,Team team1,Team team2){
        setGroupName(groupName);
        setTeam1(team1);
        setTeam2(team2);
    }
    
    public String toString(){
    return groupName+" "+team1.toString()+" "+team2.toString();
    }
    
    public boolean equals(Object obj){
        TeamGroup o= (TeamGroup)obj;
    return team1.equals(o.team1) && team2.equals(o.team2);
    
    }
    
}
