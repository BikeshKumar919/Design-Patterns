public class Main {
    public static void main(String[] args) {
        Student stu=Student.getBuilder().setId(1).setName("John").setCollege("MIT").build();
        
        System.out.println(stu);
    }
}


/-------------------------------------------------------------------------------------------------------------------------------------------------------------------/


Definition :

“Builder Pattern is used to create complex objects step by step, instead of putting everything into one constructor.”
