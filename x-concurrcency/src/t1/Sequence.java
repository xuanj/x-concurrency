package t1;

/**
 * @author xuanjian
 * 线程安全的数值序列生成器
 */
public class Sequence {

	private int value;
	
	public synchronized int getValue(){
		return value++;
	}
}
