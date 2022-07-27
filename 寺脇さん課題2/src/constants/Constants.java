package constants;

import java.text.MessageFormat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

//メッセージをまとめたクラス
public class Constants {
	public static int i ;
		@AllArgsConstructor(access = AccessLevel.PRIVATE)
		public enum Message{
			
			MESSAGE_01("社員名 = {0}\n役職 = {1}\n基本給 = ￥{2}"),
			MESSAGE_Line("----------------------------------------");
			@Getter
			private String message;
			
			public void show(Object...argments) {
				System.out.println(MessageFormat.format(this.getMessage(), argments));
			
			}
		}
	}

