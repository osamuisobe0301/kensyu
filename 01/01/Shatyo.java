// �В��N���X
public class Shatyo implements IHuman{
    
    public int bonus; // �{�[�i�X�z
    HumanDto data = new HumanDto("�R�c", "�В�", 80);
    
    // �{�[�i�X���v�Z���郁�\�b�h
    public int totalBonus(){
        return bonus;
    }
    
    // �����o�͂��郁�\�b�h
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}
