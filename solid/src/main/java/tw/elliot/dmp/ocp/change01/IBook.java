package tw.elliot.dmp.ocp.change01;

/**
 * 书籍接口
 */
public interface IBook {
	//书籍有名称
	String getName();
	//书籍有售价
	float getPrice();
	//书籍有作者
	String getAuthor();
	//取得打折后售介
	float getOffPrice();
}
