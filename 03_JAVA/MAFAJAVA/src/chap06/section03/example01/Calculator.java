package chap06.section03.example01;

//메소드(함수)에 대해 알아봅시다.
//메소드(함수): 믹서기나 tv같은 편리한 도구를 의미합니다.
//이때까지 다른 사람이 만들어 둔 메소드를 사용했습니다. 
//예)화면표시: ptrintln() 등
//=>1)메소드 만드는 이유:다른 사람이 아직 안만들어둬서
//  2)바로 코딩하면 안돼나?(10줄): 그 코드를 오늘 내일 다음에 또
// 쓸려고 할떄 함수로 코딩: 1줄이면 됨=> 재사용성 향상(효율 업)


//메소드 만들기: void함수명(){실행문;} (추천하는 방법)
//void:함수에서 결과를 내보내기 알수 있는데(변수에 저장) 그 기능을 
//      사용하지 않겠다는 의미
public class Calculator {
    void powerOn() {
    //	함수 기능 코딩 하는부분:실행블럭
    	System.out.println("전원 켜기");
    }

    
    //2)메소드 만들기2:교재에 없음
    //TODO: 사용법 void minus(int 매개변수){실행문(매개변수);}
    void minus(int x) {
    //  기능 코딩 
    	System.out.println(x);
    }
    
    
    //3)메소드(함수) 만들기3:x+y의 더한 값의 결과를 내보내는 함수
    //TODO: 자료형 plus(int x,int y){return 실행문;}
    //return 예약어: 함수밖으로 값의 결과를 내보내기 하는 예약어
    int plus(int x, int y) {
    //기능 코딩
    	return x+y;
    }
    
    
}
