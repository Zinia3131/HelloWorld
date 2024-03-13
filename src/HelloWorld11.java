public class HelloWorld11{
    private int roll;
    private String name;
    private boolean passed;
    public HelloWorld11(){
        roll = 100;
        name = "CSE";
        passed = false;
    }
    public HelloWorld11(int roll, String name, boolean passed){
        this.name = name;
        this.roll = roll;
        this.passed = passed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRoll(int roll){
        this.passed = passed;
    }
    public void setPassed(boolean passed){
        this.passed = passed;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
    public boolean isPasased(){
        return passed;
    }
    public static void main(String[] args){
        HelloWorld11 helloWorld11 = new HelloWorld11();
        helloWorld11.name = "Name = Zinia";
        helloWorld11.roll = 31;
        helloWorld11.passed = true;

        System.out.println(helloWorld11.getName());
        System.out.println(helloWorld11.getRoll());
        //System.out.println(helloWorld11.getPassed());
    }
}

