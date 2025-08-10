interface ScoredCard{
    void catchOut();
    void Hit_Six();
}
class WorldCup{
    String Host_Country;
    int year;

    public WorldCup(String h , int y){
        Host_Country = h;
        year = y;

    }
}
interface ScoreCard2{
    void bowled();
    void Half_Century();

}
class Players{
    String name;
    int runs;
    float avg;

    public Players(String n , int r , float a ){

        name = n;
        runs = r;
        avg = r;
    }

}
class Coach{
    String name;
    String Country;
    int age;


    public Coach(String n,String c , int a ){

        name = n;
        Country = c;
        age = a;
    }

}
class Men_Team{
    int feesPermatch;
    public Men_Team(int f){
        feesPermatch = f;

    }
}

class Women_Team{
    int feesPermatch;
    public Women_Team(int f){
        feesPermatch = f;

    }
}

class Team extends WorldCup implements ScoredCard , ScoreCard2{
    Coach ch; // Aggregation object
    Players pl; // Composition object
    Team(String h, int y , Players pl){
        super(h, y);

    }
    public void bowled(){
        System.out.println("Batsman is bowled");
    }
    public void Half_Century(){
        System.out.println("batsman has scored half century");

    }
    public void Half_Century(Players pl){              // For Checking Composition passing the name
        System.out.println("batsman " + pl.name  + " has scored half century");

    }

    public void catchOut(){
        System.out.println("batman is catch out");
    }
    public void Hit_Six(){
        System.out.println("batsman has hit a Six");
    }
    void fees(Men_Team m){
        System.out.println("Men team fees per Match = " + m.feesPermatch);
    }
    void fees(Women_Team m){
        System.out.println("Women team fees per Match = " + m.feesPermatch);
    }
    void SetCoach(Coach c){
        System.out.println("Coach name = " + c.name);
        System.out.println("Coach Country name = " + c.Country);
        System.out.println("Coach age = " + c.age);
    }


}

public class ImplementTeam {
    public static void main(String[] args) {

        Players p = new Players("Babar Azam",2000 , 34.63f);
        Coach c = new Coach("David Wattmore", "England",56);
        Team t = new Team("Australia",2022 , p); // Composition
        t.SetCoach(c); // passing coach object to team's method
        t.fees(new Men_Team(2500)); // passing Men_team object to Team's method
        t.fees(new Women_Team(1500)); // passing Women_team object to Team's method
        t.Hit_Six();
        t.bowled();
        ScoreCard2 sc2 = t;

        sc2.Half_Century();
        ScoredCard sc = t;
        sc.catchOut();

        t.Half_Century(p);
    }
}
