// 社員の情報を持つクラス
public class HumanDto{
    
    public HumanDto(String Name, String JobName,int Salary){
        this.Name = Name; // 名前
        this.JobName = JobName; // 役職名
        this.Salary = Salary; // 給料
    }
    
    // 名前
    private String Name;
    // 役職名称
    private String JobName;
    // 給料
    private int Salary;
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public void setJobName(String JobName){
        this.JobName = JobName;
    }
    
    public String getJobName(){
        return this.JobName;
    }
    
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    
    public int getSalary(){
        return this.Salary;
    }
}