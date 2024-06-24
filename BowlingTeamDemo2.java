//ch8ex
import java.util.*;
public class BowlingTeamDemo2 {

public static void main(String[] args) {

	String name;
	int x;
	int y;
	final int NUM_TEAM_MEMBERS = 4;
	final int NUM_TEAMS = 3;
	Scanner input = new Scanner(System.in);
	BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

//input phase
	for(y = 0; y < NUM_TEAMS; ++y) {
		teams[y] = new BowlingTeam(); 
		System.out.print("enter team name");
		name = input.nextLine();
		teams[y].setTeamName(name);

	for(x = 0; x < NUM_TEAM_MEMBERS; ++x ) {
		System.out.print("Enter team member's name: ____");
		name = input.nextLine();
		teams[y].setMember(x, name);  
			}//members for loop 
						}//teams FOR loop 

//output phase
for(y=0; y < NUM_TEAMS; ++y) {

	System.out.println("\nMembers of team " + teams[y].getTeamName());
	for(x = 0; x < NUM_TEAM_MEMBERS; ++x ) {
	System.out.print(teams[y].getMember(x) + " ");
	 	}//FOR loop
System.out.println();	}//teams output FOR loop 
}}
