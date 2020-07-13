import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		// 接続先DBを指定する
		String dburl = "jdbc:h2:~/test";
		String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
		// DBに接続する
		Connection conn = DriverManager.getConnection(dburl);
		// SQLを送信
		conn.createStatement().executeUpdate(sql);
		// DB接続を閉じる
		conn.close();
	}
}
