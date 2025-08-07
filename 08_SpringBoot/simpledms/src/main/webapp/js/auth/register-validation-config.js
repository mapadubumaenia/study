/**
 *
 */ 
$("#addForm").validate({  // addForm 태그를 선택해서 유효성 검사 시작
  rules: {                // 유효성 규칙
    email: {              // id 별명 검사 규칙 정의
      required: true,     // 필수(생략 불가)
      email: true,       //  이메일 형식 검증
    },
    password: {
      required: true,
      minlength: 6,
    },
    repassword: {
      required: true,
      minlength: 6,
      equalTo: password,         //비밀번호와 동일한 값을 가지도록
    },
    name: {
      required: true,
      minlength: 2,
    }
  },
  messages: {              // 위에서 검사 규칙을 위반했을때 화면에 보여줄 글자
    email: {               // 글자를 보여줄 id 별명
      required: "필수 입력 항목입니다.",           // required 규칙을 위반했을 때 보여줄 글자
      email: "올바른 이메일 형식으로  입력하세요",            // minlength 규칙을 위반했을 때 보여줄 글자
    },
    password: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {6}글자 이상 입력하세요.",
    },
    repassword: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {6}글자 이상 입력하세요.",
      equalTo: "패스워드와 같아야 합니다."
    },
    name: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {2}글자 이상 입력하세요.",
    }
  }
});
