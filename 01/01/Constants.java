import java.text.MessageFormat;

public enum Constants{
        
    MESSAGE01("私の名前は{0}で、役職は{1}です。\n給料は{2}万円で、ボーナスは{3}万円です。");
    

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