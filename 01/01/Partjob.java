// �p�[�g�N���X
public class Partjob implements IHuman{
    
    public int bonus; // �{�[�i�X�z
    HumanDto data = new HumanDto("����", "�p�[�g", 10);
    
    // �{�[�i�X���������郁�\�b�h
    public int totalBonus(){
        bonus = 30;
        return bonus;
    }
    // �����o�͂��郁�\�b�h
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}
