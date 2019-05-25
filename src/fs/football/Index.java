package fs.football;

import java.io.Serializable;

public class Index implements Serializable {

    int id;
    Player p;

    public Index(int id, Player p) {
        this.id = id;
        this.p = p;
    }

    @Override
    public String toString() {
        return "Index{" + "id=" + id + ", p=" + p + '}';
    }

}
