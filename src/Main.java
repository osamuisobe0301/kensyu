import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		int id = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Output output = new Output();
		List<ShainData> shainList = ShainFactory.create();

		try {
			System.out.println("役職IDを入力してください。");
			System.out.println("1:社長　2:課長　3:部長　4:一般社員　　9:システム終了");
			
			while (id != 9) {
				// while文の中try-catchしてあげれば、文字種エラーの際も処理を継続できる。
				// 指定外の数字の場合処理を繰り返すので、文字種も繰り返しても良い気がする。
				// また、こうなった場合大外のtry-finallyもいらなくなる。
				try {
					String yakushokuId = br.readLine();
					id = Integer.parseInt(yakushokuId);
					output.showShain(shainList, id);
				} catch (NumberFormatException e) {
					System.out.println("数字を入力してください");
				} 
			}
		} finally {
			System.out.println("システムを終了します。");
		}
	}

}
