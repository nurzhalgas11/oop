import java.util.Arrays;
import java.util.Comparator;
public class Lab {
    public static void main(String[] args) {
        Player[] mu = {new Player(8, "Bruno", "Fernandes", "mid"),
                new Player(29, "Aaron", "Wan-Bissaka", "right-back"),
                new Player(23, "Luke", "Shaw", "left-back"),
                new Player(19, "Raphael", "Varane", "def"),
                new Player(6, "Lisandro", "Martinez", "def"),
                new Player(10, "Marcus", "Rashford", "frwd"),
                new Player(25, "Jadon", "Sancho", "frwd")};
        Player[] bayern = {new Player(1, "Manuel", "Neuer", "keeper"),
                new Player(25, "Thomas", "Muller", "frwd"),
                new Player(42, "Jamal", "Musiala", "att"),
                new Player(19, "Alphonso", "Davies", "left-back"),
                new Player(12, "?", "Mazroui", "right-back"),
                new Player(5, "Matthias", "De Light", "def"),
                new Player(2, "Dayot", "Upamecano", "def")};
        Player[] Napoli = {new Player(77, "Kvica", "Kvaratshelia", "frwd"),
                new Player(9, "Victor", "Osimhen", "frwd"),
                new Player(11, "?", "Politano", "frwd"),
                new Player(4, "Kim", "Jin", "def"),
                new Player(20, "Di", "Lorenzo", "right-back"),
                new Player(19, "Djovani", "simeone", "frwd"),
                new Player(8, "de", "Zelinski", "mid")};
        Player[] Mancity = {new Player(9, "Erling", "Haaland", "frwd"),
                new Player(17, "Kevin", "de Bryune", "mid"),
                new Player(20, "Bernardo", "silva", "mid"),
                new Player(2, "Kyle", "Walker", "right-back"),
                new Player(31, "Moraes", "Ederson", "keeper"),
                new Player(10, "Jack", "Grealish", "mid"),
                new Player(26, "Riyad", "Mahrez", "att")};
        Player[] liverpool = {new Player(11, "Mo", "Salah", "frwd"),
                new Player(66, "Alexander", "Arnold", "right-back"),
                new Player(26, "Andy", "Robertson", "left back"),
                new Player(6, "Thiago", "Alcantara", "mid"),
                new Player(4, "van", "Dijk", "def"),
                new Player(5, "Joel", "Matip", "def"),
                new Player(14, "djon", "Henderson", "mid")};
        Club club1 = new Club("Man utd", "UK", 100,mu);
        Club club2 = new Club("bayern", "Germany", 500,bayern);
        Club club3 = new Club("mancity", "UK", 1500,Mancity);
        Club club4 = new Club("Napoli", "italy", 2000,Napoli);
        Club club5 = new Club("Liverpool", "UK", 2550,liverpool);

        Club[] clubs = {club1, club2};
        for (Club club : clubs) {
            club.printClubData();
            System.out.println();
        }
        Club[] league = {club1,club2,club3,club4,club5};
        for (Club club : league) {
            sortPlayers(club.players);
        }
        sortClub(league);
        for (Club club : league) {
            club.printClubData();
            System.out.println();
        }

    }
    static Player [] sortPlayers(Player[] players){
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player, Player t1) {
                return t1.number - player.number;
            }
        });
        return players;
    }

    static Club [] sortClub(Club[] club){
        Arrays.sort(club, new Comparator<Club>() {
            @Override
            public int compare(Club club1, Club club2) {
                return club2.points - club1.points;
            }
        });
        return club;
    }

}






class Player{
    int number;
    String name;
    String surname;
    String position;

    public Player() {
    }
    Player(int number, String name, String surname, String position){
        this.name=name;
        this.number=number;
        this.position=position;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name +
                ", surname='" + surname +
                ", position='" + position +
                '}';
    }
}
class Club{
    String name;
    String country;
    int points;
    Player[] players;

    public Club() {
    }

    public Club(String name, String country, int points, Player[] players) {
        this.name = name;
        this.country = country;
        this.points = points;
        this.players = players;
    }
    void printClubData() {
        System.out.println("Club name is " + name + " represents " + country + " points" + points);
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }}