public class Door {
    private float weight;

    public Door(){
        this.weight = 150;
    }

    public Door(Door door){ this.weight = door.weight;  }

    public float getWeight(){
        return weight;
    }
}
