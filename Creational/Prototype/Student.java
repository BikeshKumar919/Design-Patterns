public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private String address;
    public Student(){
    }
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.address = s.address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public Student clone() {
       return new Student(this);
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
    
}
