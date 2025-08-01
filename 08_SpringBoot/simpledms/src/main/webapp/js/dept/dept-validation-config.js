/**
 *
 */ 
$("#addForm").validate({
  rules: {
    // 유효성 검사 규칙
    dname: {
      required: true,                //필수라는뜻 생략 불가
      minlength: 2,                  //최소길이
    },
    loc: {
      required: true,
      minlength: 2,
    }
  },
  messages: {
   
    dname: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
    loc: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    }
  }
});
