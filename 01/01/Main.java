// ���������郁�C���N���X
public class Main{
    
    // ���C�����\�b�h
    public static void main(String []args){
        
        IHuman emp;
        String shain = args[0];
        
        // ���s�������ŏ�����ς���
        switch(shain){
        case "1":
            emp = new Shatyo();
            break;
            
        case "2":
            emp = new Katyo();
            break;
            
        default :
            emp = new Partjob();
            break;
        }
        emp.totalBonus();
        emp.show();
    }
}
