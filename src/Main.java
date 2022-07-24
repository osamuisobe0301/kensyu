import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		int id = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<ShainData> shainList = ShainFactory.create();

		try {
			System.out.println("役職IDを入力してください。");
			System.out.println("1:社長　2:課長　3:部長　4:一般社員　　9:システム終了");
			while (id != 9) {
				String yakushokuId = br.readLine();
				id = Integer.parseInt(yakushokuId);
				Output.showShain(shainList, id);
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("システムを終了します。");
		}
	}

}
