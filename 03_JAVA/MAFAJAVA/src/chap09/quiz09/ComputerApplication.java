package chap09.quiz09;

public class ComputerApplication {
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.turnOn(); // "전원을 켭니다."
		computer.display(); // "DeskTop Display()"
		computer.typing(); // "DeskTop Typing()"
		computer = new NoteBook(); // 데스크탑 -> 노트북으로 변경
		computer.display(); // "NoteBook Display()"
		computer.typing(); // NoteBook Typing()
		computer.turnOff(); // "전원을 끕니다."
	}

}
