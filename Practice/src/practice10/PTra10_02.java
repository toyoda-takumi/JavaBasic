package practice10;
/*
 * PTra10_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_02 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
			User us;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
			us=new User();

		// ★ 変数usに格納されているインスタンスのuserIdフィールドに、101を代入してください
			int userId=101;

		// ★ 変数usに格納されているインスタンスのuserNmフィールドに、"リゾーム太郎"を代入してください
			String userNm="リゾーム太郎";

		// ★ 変数usに格納されているインスタンスのmailフィールドに、"rhizome@hoge.com"を代入してください
			String mail="rhizome@hoge.com";

		// ★ 変数usに格納されているインスタンスのpasswordフィールドに、"1qazxcv"を代入してください
			String password="1qazxcv";

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
			System.out.println(userId);
			System.out.println(userNm);
			System.out.println(mail);
			System.out.println(password);
	}
}
