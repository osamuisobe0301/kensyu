// �Ј��̏������N���X
public class HumanDto{
    
    public HumanDto(String Name, String JobName,int Salary){
        this.Name = Name; // ���O
        this.JobName = JobName; // ��E��
        this.Salary = Salary; // ����
    }
    
    // ���O
    private String Name;
    // ��E����
    private String JobName;
    // ����
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