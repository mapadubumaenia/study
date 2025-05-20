package chap07.Finalquiz03;

public class BoardApplication {
public static void main(String[] args) {
	Board board=new Board("제목","내용");
	
	System.out.println(board.title);
	System.out.println(board.content);
	
}
}
