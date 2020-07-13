import java.io.InputStream;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws Exception {
		// URLクラスのopenStreamメソッドを使うことによってWebページのHTMLを取得することができる
		URL u = new URL("https://o-space.jp/");
		InputStream is = u.openStream();
		int i = is.read();
		while(i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}
	}
}
