public class Builder {
    int id;
    String name;
    String college;
    Builder setId(int id){
        this.id = id;
        return this;
    }
    Builder setName(String name){
        this.name = name;
        return this;
    }
    Builder setCollege(String college){
        this.college = college;
        return this;
    }
    Student build(){
        //Object validation should be done here
        if (this.id <= 0) {
            throw new IllegalStateException("ID must be greater than 0");
        }
        return new Student(this);
    }
}
