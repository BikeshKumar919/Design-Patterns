public class Main {
    static void fillRegistry(Registry r){
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("John");
        s1.setAddress("1234");
        r.create("s1", s1);
        IntelligentStu s2 = new IntelligentStu();
        s2.setIq(10);
        r.create("s2", s2);
    }
    public static void main(String[] args) {
        Registry r = new Registry();
        fillRegistry(r);
        IntelligentStu s2= (IntelligentStu) r.get("s2");
        System.out.println(s2.toString());
        s2.setIq(11);
        System.out.println(s2.toString());
    }
}
