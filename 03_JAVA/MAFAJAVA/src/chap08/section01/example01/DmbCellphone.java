package chap08.section01.example01;
//자식 클래스
public class DmbCellphone extends Cellphone {
       int channel;
       
       
        
      public void turnOn() {
		System.out.println("tv를 수신합니다.");
		
		
		
	}

    //생성자 함수
public DmbCellphone( String model, int channel) {
	super();
	this.channel = channel;
	this.model =model;
}
}
