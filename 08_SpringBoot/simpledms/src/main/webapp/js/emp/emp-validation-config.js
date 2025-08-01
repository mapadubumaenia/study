/**
 *
 */ 
$("#addForm").validate({
  rules: {
    // 유효성 검사 규칙
    ename: {
      required: true,                         //필수
      minlength: 2,
    },
    job: {
      required: true,                         //필수
      minlength: 2,
    },
    manager: {
      required: true,
      digits: true,                           //숫자만
    },
    hiredate: {
      required: true,
      date: true,                             //날짜만 입력하게함(yyyy-mm-dd)
    },
    salary: {
      required: true,
      digits: true,                        //숫자만
    },
    commission: {
      required: true,
      digits: true,                         //숫자만
    },
    dno: {
      required: true,
      digits: true,
    }
  },
  messages: {
   
    ename: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },
    job: {
      required: "필수 입력 항목입니다.",
      minlength: "최소 {0}글자 이상 입력하세요.",
    },    
    manager: {
      required: "필수 입력 항목입니다.",
      digits: "반드시 숫자만 입력하세요.",
    },
    hiredate: {
      required: "필수 입력 항목입니다.",
      date: "날짜 포맷(yyyy-MM-dd)만 입력하세요.",
    },    
    salary: {
      required: "필수 입력 항목입니다.",
      digits: "반드시 숫자만 입력하세요.",
    },
    commission: {
      required: "필수 입력 항목입니다.",
      digits: "반드시 숫자만 입력하세요.",
    },
    dno: {
      required: "필수 입력 항목입니다.",
      digits: "반드시 숫자만 입력하세요.",
    }
  }
});
