class Student{
    private int id;//make to private to avoid direct access from outside like main stu.id=2;
    private String name;
    private String college;
    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.college = builder.college;
    }
    public static  Builder getBuilder(){
        return new Builder();
    }
    public static class Builder {
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
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
    }
    
}