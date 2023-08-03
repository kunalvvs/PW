package Practice.Encapsulation;

public class First {
    
    private String name;
    private float salary;

    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    void name(String name)
    {
        this.name=name;
    }
    void sal(float salary)
    {
        this.salary=salary;
    }
    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

}
class MainMethod
{
    public static void main(String args[])
    {
        First f = new First();
        f.name("Kunal");
        f.sal(10000);
        
        f.name("Rahul");
        f.show();
        System.out.println(f.getName());
    }
}
