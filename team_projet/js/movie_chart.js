$(function() {
    $(".scheduled").click(function() {
        $("#rank1").attr("src","./img/Exhuma.jpg");
        $("#rank2").attr("src","./img/crime_city_3.jpg");
        $("#rank3").attr("src","./img/dark_knight.jpg");
        $("#rank4").attr("src","./img/to_busan.png");
        $("#rank5").attr("src","./img/pan's_labyrinth.jpg");
        $(".name1").text("파묘");
        $(".name2").text("범죄도시3");
        $(".name3").text("다크나이트");
        $(".name4").text("부산행");
        $(".name5").text("판의 미로 - 오필리아와 세 개의 열쇠");
        $(".mchart").css("color","gray");
        $(".scheduled").css("color","black");
    });
});
$(function() {
    $(".mchart").click(function() {
        $("#rank1").attr("src","./img/to_busan.png");
        $("#rank2").attr("src","./img/Exhuma.jpg");
        $("#rank3").attr("src","./img/lala_land.jpg");
        $("#rank4").attr("src","./img/pan's_labyrinth.jpg");
        $("#rank5").attr("src","./img/crime_city_3.jpg");
        $(".name1").text("부산행");
        $(".name2").text("파묘");
        $(".name3").text("라라랜드");
        $(".name4").text("판의 미로 - 오필리아와 세 개의 열쇠");
        $(".name5").text("범죄도시3");
        $(".mchart").css("color","black");
        $(".scheduled").css("color","gray");
    });
});

$(function() {
    $(".hover1").hover(function(){
        $(".detail1").show();
    },function() {
        $(".detail1").hide();
    });
});
$(function() {
    $(".hover1").hover(function() {
        $(".reserve1").show();
    },function() {
        $(".reserve1").hide();
    });
});

$(function() {
    $(".hover2").hover(function(){
        $(".detail2").show();
    },function() {
        $(".detail2").hide();
    });
});
$(function() {
    $(".hover2").hover(function() {
        $(".reserve2").show();
    },function() {
        $(".reserve2").hide();
    });
});

$(function() {
    $(".hover3").hover(function(){
        $(".detail3").show();
    },function() {
        $(".detail3").hide();
    });
});
$(function() {
    $(".hover3").hover(function() {
        $(".reserve3").show();
    },function() {
        $(".reserve3").hide();
    });
});

$(function() {
    $(".hover4").hover(function(){
        $(".detail4").show();
    },function() {
        $(".detail4").hide();
    });
});
$(function() {
    $(".hover4").hover(function() {
        $(".reserve4").show();
    },function() {
        $(".reserve4").hide();
    });
});

$(function() {
    $(".hover5").hover(function(){
        $(".detail5").show();
    },function() {
        $(".detail5").hide();
    });
});
$(function() {
    $(".hover5").hover(function() {
        $(".reserve5").show();
    },function() {
        $(".reserve5").hide();
    });
});