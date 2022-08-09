public class DBPlayer {
    private int id;
    private String name;
    private String team;
    private int number;

    public DBPlayer(int id, String name, String team, int number) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public DBPlayer() {
    }

    @Override
    public String toString() {
        String res = "Id = (" +id +"), " + "Name = (" + name + "), " +
                        "Team = (" + team + "), " + "Number = (" + number + ")" ;
        return res;
    }
}
