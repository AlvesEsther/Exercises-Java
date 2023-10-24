public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        double salary;
        salary = GrossSalary - Tax;
        return salary;
    }
    public void IncreaseSalary(double percentage){
        this.GrossSalary = GrossSalary *(1 +(percentage / 100));
    }
    public String toString(){
        return Name
                + ", $"
                + String.format("%.2f", NetSalary());

    }
}
