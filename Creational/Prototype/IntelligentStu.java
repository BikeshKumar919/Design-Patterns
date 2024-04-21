public class IntelligentStu extends Student{
    int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }
    public IntelligentStu(){
    }
    public IntelligentStu(IntelligentStu s){
        super(s);
        this.iq = s.iq;
    }
    @Override
    public IntelligentStu clone() {
        // TODO Auto-generated method stub
        return new IntelligentStu(this);
    }
    @Override
    public String toString() {
        return "IntelligentStu [iq=" + iq + "]";
    }
    
}
