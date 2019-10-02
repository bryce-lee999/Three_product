<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>当当—网上购物中心：图书、母婴、美妆、家居、数码、家电、服装、鞋包等，正品低价，货到付款</title>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/iconfont.css">
  <link rel="stylesheet" href="css/main.css">
</head>
<body>
 <header class="top clearfix">
    <div class="container">
      <div class="top-left">送至：<span>衡阳<span class="iconfont">&#xe607;</span></span></div>
      <ul class="top-right">
        <li>Hi，
          <a href="">132****4521</a><a href="">[退出]</a>
        </li>
        <li><a class="line" href="cart/cart.html">购物车</a></li>
        <li><a class="line" href="">我的订单</a></li>
        <li><a class="line" href="">我的云书房</a></li>
        <li><a class="line" href="">我的当当<span class="iconfont">&#xe607;</span></a></li>
        <li><a class="line" href="">小说投稿</a></li>
        <li><a class="line" href="">我要出书</a></li>
        <li><a class="line" href="">企业采购<span class="iconfont">&#xe607;</span></a></li>
        <li><a class="line" href="">客户服务<span class="iconfont">&#xe607;</span></a></li>
      </ul>
    </div>
  </header>
  <section>
    <div class="container">
      <div class="logo-line">
        <div class="logo fl">
          <img src="img/logo.gif" alt="无法显示">
        </div>
        <div class="search-box">
          <div class="search-top clearfix">
            <input type="text" class="search fl" placeholder="4.16-4.23百万图书每满100减50">
            <span class="search-option fl"><a href="">全部分类<span class="iconfont">&#xe607;</span></a></span>
            <a href="" class="iconfont search-btn fl">&#xe605;</a>
          </div>
          <div class="search-bottom clearfix">
            <ul class="search-hot fl">
              <li class="search-line"><a href="">热搜:</a></li>
              <li class="search-line"><a href="">美特斯邦威</a></li>
              <li class="search-line"><a href="">编程思维启蒙</a></li>
              <li class="search-line"><a href="">念楼学短</a></li>
              <li class="search-line"><a href="">当当优品</a></li>
              <li class="search-line"><a href="">童装童鞋</a></li>
              <li class="search-line"><a href="">巴黎圣母院</a></li>
            </ul>
            <a href="" class="search-line fr">高级搜索</a>
          </div>
        </div>
        <div class="shop-btn">
          <a href="cart/cart.html" class="shopcart"><span class="iconfont">&#xe610;</span>购物车 0</a>
          <a href="" class="shoporder">我的订单</a>
        </div>
      </div>
    </div>
  </section>
  <nav class="nav-box">
    <ul class="container">
      <li class="nav-line nav-all"><a href="">全部商品分类</a><span class="iconfont">&#xe607;</span></li>
      <li class="nav-line"><a href=""><img src="img/hot1.png" class="icon-hot">书香节</a></li>
      <li class="nav-line"><a href="">图书</a></li>
      <li class="nav-line"><a href="">电子书</a></li>
      <li class="nav-line"><a href="">网络文学</a></li>
      <li class="nav-line"><a href="">服装</a></li>
      <li class="nav-line"><a href="">运动户外</a></li>
      <li class="nav-line"><a href="">孕婴童</a></li>
      <li class="nav-line"><a href="">家居</a></li>
      <li class="nav-line"><a href="">拍卖</a></li>
      <li class="nav-line"><a href="">食品</a></li>
      <li class="nav-line"><a href="">Apple</a></li>
      <li class="nav-line"><a href="">电器城</a></li>
    </ul>
  </nav>
  <section class="content-box">
    <div class="content container">
      <ul class="fl content-left">
        <li><a href="javascript:findTypeByTno([1,2])">图书、童书</a></li><!-- onmousemove="javascript:over()" onmouseout="javascript:out()" -->
        <li><a href="javascript:findTypeByTno([3,4])">电子书、网络文学</a></li>
        <li><a href="javascript:findTypeByTno([5,6])">创意文具、拍卖</a></li>
        <li><a href="javascript:findTypeByTno([7,8])">服饰、内衣</a></li>
        <li><a href="javascript:findTypeByTno([9,10])">鞋靴、箱包</a></li>
        <li><a href="javascript:findTypeByTno([11])">运动户外</a></li>
        <li><a href="javascript:findTypeByTno([12])">孕、婴、童</a></li>
        <li><a href="javascript:findTypeByTno([13,14,15])">家居、家纺、汽车</a></li>
        <li><a href="javascript:findTypeByTno([16,17,18])">家具、家装、康体</a></li>
        <li><a href="javascript:findTypeByTno([19,20])">美妆、个人护理、成人</a></li>
        <li><a href="javascript:findTypeByTno([22,23,24])">食品、茶酒、生鲜</a></li>
        <li><a href="javascript:findTypeByTno([25,26,27])">腕表、珠宝饰品、眼镜</a></li>
        <li><a href="javascript:findTypeByTno([28,29])">手机、数码</a></li>
        <li><a href="javascript:findTypeByTno([30])">电脑办公</a></li>
        <li><a href="javascript:findTypeByTno([31])">家用电器</a></li>
        <li><a href="javascript:findTypeByTno([32,33])">当当礼品卡、生活服务</a></li>
      </ul>
      <div class="fr content-right">
        <div class="content-right-ad">
          <img src="img/2019041522350713716.jpg" alt="百万图书/服装/百货,每满100减50">
        </div>
        <ul class="content-right-notice">
          <li class="notice-btn active" href="">信息公告</li>
          <li class="notice-btn" href="">服务公告</li>
          <li class="notice-line"><a href="">·&nbsp;&nbsp;百万图书每满100减50</a></li>
          <li class="notice-line"><a href="">·&nbsp;&nbsp;美特斯邦威大牌日 1件2.2折</a></li>
          <li class="notice-line"><a href="">·&nbsp;&nbsp;百草味大牌返场满199减129</a></li>
          <li class="notice-line"><a href="">·&nbsp;&nbsp;书香节大牌文具每满100减50</a></li>
          <li class="notice-line"><a href="">·&nbsp;&nbsp;裂帛全场2件3折</a></li>
        </ul>
        <div class="content-right-pop">
          <img class="pop-img" src="img/4.20-1555661222.jpg" alt="pop ad">
        </div>
      </div>
      <div class="content-center" id="content-center">
        <ul class="banner-wrapper">
          <div class="banner">
            <li><a href=""><img class="banner-img" src="img/banner/1.jpg" alt=""></a></li>
            <li><a href=""><img class="banner-img" src="img/banner/2.jpg" alt=""></a></li>
            <li><a href=""><img class="banner-img" src="img/banner/3.jpg" alt=""></a></li>
            <li><a href=""><img class="banner-img" src="img/banner/4.jpg" alt=""></a></li>
            <li><a href=""><img class="banner-img" src="img/banner/5.jpg" alt=""></a></li>
          </div>
          <!-- control -->
          <div class="banner-btn">
            <a class="pre"></a>
            <a class="next"></a>
          </div>
          <ul class="banner-option">
            <li class="active">1</li>
            <li>2</li>
            <li>3</li>
            <li>4</li>
            <li>5</li>
          </ul>
        </ul>
        <ul class="banner-activity">
          <li><a href=""><img src="img/banner/01.jpg" alt=""></a><div class="cover">遮罩</div></li>
          <li><a href=""><img src="img/banner/02.jpg" alt=""></a><div class="cover">遮罩</div></li>
          <li><a href=""><img src="img/banner/03.jpg" alt=""></a><div class="cover">遮罩</div></li>
          <li><a href=""><img src="img/banner/04.jpg" alt=""></a><div class="cover">遮罩</div></li>
        </ul>
      </div>
    </div>
  </section>
  <section class="sell-box">
    <div class="container clearfix">
      <div class="fl sell-left">


        <div class="sell-head clearfix">
          <h1>
            <a href="">图书</a>
            <a href="">电子</a>
            <a href="">网络文学</a>
          </h1>

          <ul class="sell-head-option fr">
            <li class="active">最新上架</li>
            <li>独家畅品</li>
            <li>重点推荐</li>
            <li>电子书</li>
            <li>网络文学</li>
          </ul>
        </div>


        <div class="sell-content clearfix">
          <div class="fl sell-content-bookstyle">
            <a href=""><img src="img/sell/big2.jpg" alt="图书分类"></a>
            <!--[if lt IE 9]>
              <div class="clearfix"></div>
            <![endif]-->
          </div>

          <ul class="fl sell-content-pop clearfix">


            <li class="sell-content-pop-banner">
              <a href=""><img src="img/sell/big1.jpg" alt="热门活动"></a>
            </li>


            <li>
              <a href=""><img src="img/sell/1jpg.jpg" alt=""></a>
              <div>
                <a href="">新东方 (2020)考研英语高分<br>
                  <span class="price">¥46</span>
                </a>
              </div>
            </li>

            <li>
              <a href=""><img src="img/sell/2.jpg" alt=""></a>
              <div>
                <a href="">柏杨说史：少年读《资治通<br>
                  <span class="price">¥236.80</span>
                </a>
              </div>
            </li>

            <li>
              <a href=""><img src="img/sell/3.jpg" alt=""></a>
              <div>
                <a href="">海子抒情诗全集（评注典藏版<br>
                  <span class="price">¥101.60</span>
                </a>
              </div>
            </li>

            <li>
              <a href=""><img src="img/sell/4.jpg" alt=""></a>
              <div>
                <a href="">你今天真好看，我可以咬一<br>
                  <span class="price">¥87.50</span>
                </a>
              </div>
            </li>

            <li>
              <a href=""><img src="img/sell/5.jpg" alt=""></a>
              <div>
                <a href="">一问一世界<br>
                  <span class="price">¥60.70</span>
                </a>
              </div>
            </li>

            <li>
              <a href=""><img src="img/sell/6.jpg" alt=""></a>
              <div>
                <a href="">埃及四千年<br>
                  <span class="price">¥100.90</span>
                </a>
              </div>
            </li>

          </ul>
        </div>



      </div>
      <ul class="fr sell-rank clearfix">
        <li class="fl sell-rank-btn active"><a href="">图书畅销榜</a></li>
        <li class="fl sell-rank-btn"><a href="">童书新书榜</a></li>
        <li><span class="rank rank-top">1</span><a href="">神奇校车·桥梁书版（全20册</a></li>
        <li><span class="rank rank-top">2</span><a href="">神奇校车·图画书版（全12册，新增《科学博览会》1册）</a></li>
        <li><span class="rank rank-top">3</span><a href="">流浪的地球（刘慈欣著，无删节无改写，大人孩子均可阅读，此版本当当网销量遥遥领先！根据本书改编的同名电影2019春节上映。）</a></li>
        <li><span class="rank">4</span><a href="">人间失格（日本小说家太宰治的自传体小说）</a></li>
        <li><span class="rank">5</span><a href="">DK幼儿百科全书——那些重要的事</a></li>
        <li><span class="rank">6</span><a href="">我喜欢生命本来的样子</a></li>
        <li><span class="rank">7</span><a href="">丰子恺万般滋味，都是生活</a></li>
        <li><span class="rank">8</span><a href="">少年读史记（套装全5册）</a></li>
        <li><span class="rank">9</span><a href="">小熊和最好的爸爸（全7册）</a></li>
        <li><span class="rank">10</span><a href="">活着（2017年新版）</a></li>
      </ul>
    </div>
  </section>
  <footer class="footer-box clearfix">
    <div class="footer-top">
      <div class="footer-top-icon icon1"></div>
      <div class="footer-top-icon icon2"></div>
      <div class="footer-top-icon icon3"></div>
      <div class="footer-top-icon icon4"></div>
    </div>
    <div class="footer-bottom">
      <div class="footer-bottom-option">
        <span><a href="">公司简介</a></span><span class="divide">|</span>
        <span><a href="">诚聘英才</a></span><span class="divide">|</span>
        <span><a href="">网站联盟</a></span><span class="divide">|</span>
        <span><a href="">当当招商</a></span><span class="divide">|</span>
        <span><a href="">机构销售</a></span><span class="divide">|</span>
        <span><a href="">手机当当</a></span><span class="divide">|</span>
        <span><a href="">官方Blog</a></span><span class="divide">|</span>
        <span><a href="">热词搜索</a></span>
      </div>
      <div class="footer-bottom-desc">
        <p>Copyright (C) 当当网 2004-2017, All Rights Reserved</p>
        <p>京ICP证041189号|出版物经营许可证 新出发京批字第直0673号|食品经营许可证：JY11101050363440</p>
        <p>京公网安备110101000001号</p>
        <p>互联网违法和不良信息举报电话：4001066666-5 邮箱：service@cs.dangdang.com</p>
        <p>网络出版服务许可证（总）网出证（京）字第049号北京当当科文电子商务有限公司，公司地址：北京市朝阳区北三环东路8号静安中心21层</p>
      </div>
    </div>
  </footer>

  <!-- 兼容IE7 8的DOM以及ES新特性 -->
  <!--[if lte IE 8]>
    <script src="js/ieBetter.js"></script>
  <![endif]-->
<script src="js/hover_options.js"></script>
<script src="js/banner-swiper.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script type="text/javascript">

	//存放商品信息
	var goodsInfo = null;

	//进入主页自动加载1，2条的数据
	$(function(){
		var arr = [1,2];
		findTypeByTno(arr);
	});

	//获取商品类型名称
	function findTypeByTno(arr){
		$.ajax({
			url:"type/byTno",
			type:"POST",
			data:{
				"tnos":arr
			},
			traditional: true,
			dataType : "json",
			success: function(data) {
		        console.log(data);
		        findTypeitem(arr,data)
		    }
		});
	}

	//获取商品子类型名称
	function findTypeitem(arr,info){
		//设置商品类型名称
		var t = 0;
		var str = '<div class="sell-head clearfix"><h1>';
		for(var i = 0;i<info.length;i++){
			str += '<a href="">'+info[i].tname+'</a>';
		}
		$.ajax({
			url:"typeitem/byTno",
			type:"POST",
			data:{
				"tnos":arr
			},
			traditional: true,
			dataType : "json",
			success: function(data) {
		        console.log(data);
		        findGoodByTno(data,str);
		    }
		});

	}

	//动态获取商品数据
	function findGoodByTno(info,str){

		//设置商品子类型 上方商品类型
		var t = 0;
		str += '</h1><ul class="sell-head-option fr">'
		+'<li class="active mouse '+0+'" onmouseenter="javascript:typeChange('+info[0].tino+','+0+')">'
		+info[t++].tiname+'</li>';

		for(t = 1;t<8;t++){//info.length
			str += '<li class="mouse '+t+'" onmouseenter="javascript:typeChange('+info[t].tino+','+t+')">'
			+info[t].tiname+'</li>';
		}

		//商品类型 右边商品类型
		str += '</ul></div><div class="fl sell-content-bookstyle">'
			+'<a href=""><img src="img/sell/big2.jpg" alt="图书分类"></a>'
			+'<ul class="sell-content-bookstyle-group">';
		str += '</ul></div><ul class="fl sell-content-pop clearfix">';
		var newArr = new Array(t);
		for(var i=0;i<t;i++){
			newArr[i] = info[i].tino;
		}
		$.ajax({
			url:"goods/findById",
			type:"POST",
			data:{
				"tinos":newArr
			},
			traditional: true,
			dataType : "json",
			success: function(data) {
		        console.log(data);
		        goodsInfo = data;
		        showGoods(data,str);
		    }
		});
	}

	//设置商品
	function showGoods(info,str){

		//var imgs = ["img/sell/1jpg.jpg","img/sell/2.jpg","img/sell/3.jpg","img/sell/2.jpg"
		//	,"img/sell/1jpg.jpg","img/sell/2.jpg","img/sell/3.jpg","img/sell/2.jpg"];

		console.log(info);
 		for(var i = 0;i<info.length && i<8;i++){//info.length
			//javascript:getDetail('+info[i].gno+')
 			str += '<li><a href="details.jsp?gno='+goodsInfo[i].gno+'"><img src="'+info[i].gimg+'" alt=""></a>'//info[i].gimg
 			+'<div><a href="details.jsp?gno='+goodsInfo[i].gno+'">'+info[i].gname+'<br><span class="price">¥'+info[i].gprice+'</span>'
 			+'</a></div></li>';
 		}
		$('.sell-left').html('');
		$('.sell-left').html(str);
	}


	//鼠标移入事件
	function typeChange(tino,no){
		console.log(tino);
		$(".mouse").removeClass("active");
		$("."+no).addClass("active");
		showGoods2(tino);
	}

	//鼠标移入修改数据
	function showGoods2(tino){
		console.log(goodsInfo);
		var str = '';
		for(var i = 0;i<goodsInfo.length;i++){
	 		if(tino==goodsInfo[i].tino){
	 			str += '<li><a href="details.jsp?gno='+goodsInfo[i].gno+'"><img src="'+goodsInfo[i].gimg+'" alt=""></a>'
	 			+'<div><a href="details.jsp?gno='+goodsInfo[i].gno+'">'+goodsInfo[i].gname+'<br><span class="price">¥'+goodsInfo[i].gprice+'</span>'
	 			+'</a></div></li>';
	 		}
		}

		$('.sell-content-pop').html('');
		$('.sell-content-pop').html(str);

	}

	$(".classification").mouseover(function(){
		console.log('over');
		document.getElementById("content-center").style.display = "none";
	})

	$(".classification").mouseout(function(){
		console.log('out');
		document.getElementById("content-center").style.display = "block";
	})


	function getDetail(gno){

	}

</script>

</body>
</html>