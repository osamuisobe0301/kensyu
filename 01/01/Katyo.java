// �ے��N���X
public class Katyo implements IHuman{
    
    public int bonus; // �{�[�i�X�z
    HumanDto data = new HumanDto("�c��", "�ے�", 40);
    
    // �{�[�i�X���������郁�\�b�h
    public int totalBonus(){
        bonus = data.getSalary() * 2;
        return bonus;
    }
    
    // �����o�͂��郁�\�b�h
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}

