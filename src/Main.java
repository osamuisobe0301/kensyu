import java.io.IOException;
import java.util.List;

public class Main{

    public static void main(String[] args)throws IOException{
        
        Input input = new Input();
        Output output = new Output();

        List<DenpyoData> denpyoData = input.showInput();
        output.show(denpyoData);
        
    }
}