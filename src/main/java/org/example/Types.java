package org.example;

public abstract class Types {

    protected String name;
    protected int MaxRunDistance;
    protected int MaxJumpDistance;
    protected String type;
    public Types () {
     };
    public Types(String name, int MaxRunDistance, int MaxJumpDistance, String type) {
        this.name = name;
        this.MaxRunDistance = MaxRunDistance;
        this.MaxJumpDistance = MaxJumpDistance;
        this.type = type;
    }

    public void ruun (Wall Wall)
    {

    }

    public void run(int Dist) {
        if (Dist <= MaxRunDistance) {
            System.out.println(this.type + " " + this.name + " успешно пробежал " + Dist + " см.");
        }
        else System.out.println(this.type + " " + this.name + " не смог пробежать " + Dist + " см.");
    }

    public void jump(int Heig) {
        if (Heig <= MaxJumpDistance) {
            System.out.println(this.type + " " +this.name + " успешно перепрыгнул " + Heig+ " см.");
        }
        else System.out.println(this.type + " " +this.name + " не смог перепрыгнуть " + Heig+ " см." + " и упал.");
    }
}
