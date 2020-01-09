package first.project;

public class Team // this is the main class with access specifier as public. other class will not have public 
{ 
Member member;
public Team(Member member) {
this.member = member;
} 


// here's our main method - step 1 - entry point
public static void main(String[] args) 
{
	Member myMember = new Member("Aurieel", "light", 10, 1); // step 2 - accessing class Member and directly passing arguments to the METHOD Member. goto step 3
Team myTeam = new Team(myMember); // step 4 - creating object and passing the details as arguments. now myTeam object will contain name, type, level and rank details in it
System.out.println(myTeam.member.getName()); // step 5 - 
System.out.println(myTeam.member.getType());
System.out.println(myTeam.member.getLevel());
System.out.println(myTeam.member.getRank());
} // main method ends

}

class Member //step 3 creating a class and storing member information here separately so that this can be used in other classes.
{
private String name;
private String type;
private int level;
private int rank;
public Member(String name, String type, int level, int rank) //step 2 arguments passed will enter this method - note that method name is same as classname
{
this.name = name;
this.type = type;
this.level = level;
this.rank = rank;
} // after this step 4 ll be proceeded above in main method.

/* let's define our getter functions here */
public String getName() { // what is your name?
return this.name; // my name is ...
}
public String getType() { // what is your type?
return this.type; // my type is ...
}
public int getLevel() { // what is your level?
return this.level; // my level is ...
}
public int getRank() { // what is your rank?
return this.rank; // my rank is
}
}
