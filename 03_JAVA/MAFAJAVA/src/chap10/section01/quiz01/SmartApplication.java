package chap10.section01.quiz01;

public class SmartApplication {
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		Remote remoteControl = smartTv;
		Searchable searchable = smartTv;
		searchable.volumn(2); // 2 조절
		remoteControl.turnOff(); // tv 끄기
	}

}
