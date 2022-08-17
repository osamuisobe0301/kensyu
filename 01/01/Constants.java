import java.text.MessageFormat;

public enum Constants{
        
    MESSAGE01("���̖��O��{0}�ŁA��E��{1}�ł��B\n������{2}���~�ŁA�{�[�i�X��{3}���~�ł��B");
    

    private String message;
    
    private Constants(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public void show(Object... argments){
        System.out.println(MessageFormat.format(this.getMessage(), argments));
    }
}