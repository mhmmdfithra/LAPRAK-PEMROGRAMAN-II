package praktikum5.soal1;
// kelas abstak dari shape
public abstract  class Shape {
    //deklarasi variabel
    protected String shapeName;
    // set up constructor
    public Shape(String name) {
        shapeName = name;
    }
    //Returns the surface area of the shape.
    public abstract double area();
    //Returns the sphere as a String.
    public String toString() {
        return shapeName;
    }
}
