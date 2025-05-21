package chap08.section01.example04;

//자식 클래스
public class SuperAirPlane extends AirPlane {

	int flyMode;

	public SuperAirPlane(int flyMode) {
		super();
		this.flyMode = flyMode;
	}
//메소드: fly()부모클래스 함수를 오버라이딩 해서 수정 코딩

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		// super(): 부모클래스의 생성자를 의미
		// super : 부모클래스를 의미(부모 객체)
		if (flyMode == 1) {
			super.fly();
		} else {
			System.out.println("초음속 비행합니다.");
		}
		// super.fly => 부모클래스의 fly함수를 말함
	}

}
