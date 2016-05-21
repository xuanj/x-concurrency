package t1;

/**
 * @author xuanjian
 * 非线程安全的数值序列生成器
 */

public class UnsafSequence {
	private int value;
	
	/**
	 * 返回唯一的数值
	 */
	public int getValue(){
		return value++;
	}
}
