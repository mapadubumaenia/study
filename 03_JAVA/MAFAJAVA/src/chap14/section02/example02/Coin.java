package chap14.section02.example02;
/**
 * 
 *
 */
public class Coin {
//클래스의 3요소 1)필드 2)생성자 3)메소드
	private int value;   //동전값

	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
