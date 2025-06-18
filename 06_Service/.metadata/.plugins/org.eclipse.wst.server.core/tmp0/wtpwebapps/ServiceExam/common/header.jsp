<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

     <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
                                   <!--브랜드명(사이트명)  -->
    <a class="navbar-brand" href="#">simple-coding</a>
    
    <!--햄버거 버튼 메뉴(크기가 작아지면 보임)  -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/home.do">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            그룹관리
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="/dept/dept.do">Dept</a></li>
            <li><a class="dropdown-item" href="/emp/emp.do">Emp(퀴즈)</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Board(마무리퀴즈)</a></li>
          </ul>
        </li>
        
      </ul>
      
    </div>
  </div>
</nav>

