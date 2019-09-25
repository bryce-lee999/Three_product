/**
 * 使用原生JS实现轮播图效果
 */


;(function(){
  var swiperObj = document.getElementsByClassName('banner')[0];
  var swiperBtnGroup = document.getElementsByClassName('banner-btn')[0];
  var swiperBtn = swiperBtnGroup.getElementsByTagName('a');
  var preBtn = swiperBtn[0];
  var nextBtn = swiperBtn[1];
  // 按钮组
  var swiperOptGroup = document.querySelector('.banner-option').getElementsByTagName('li');
  var swiperOption = {};
  var page = 1;
  
  /**
   * 向前一页
   */
  preBtn.onclick = function () {
    var left = parseInt(getStyle(swiperObj, 'left'));
    if (left >= 0) {
      return;
    }
    left += 800;
    page = Math.abs(left)/800;
    // 触发重绘
    swiperOption.page = page;
    swiperObj.setAttribute('style', 'left:'+left+'px !important;');
  };

  /**
   * 向后一页
   */
  nextBtn.onclick = function () {
    var left = parseInt(getStyle(swiperObj, 'left'));
    if (left <= -3200) {
      return;
    }
    left -= 800;
    page = Math.abs(left)/800;
    // 触发重绘
    swiperOption.page = page;
    swiperObj.setAttribute('style', 'left:'+left+'px !important;');
  };

  /**
   * 处理按钮组
   */
  var optionLength = swiperOptGroup.length;
  for (var i = 0; i < optionLength; i++) {
    // 为所有option添加监听
    (function(i){
        swiperOptGroup[i].onmouseover = function() {
          // 触发重绘
          page = i;
          swiperOption.page = i;
          var left = -(page*800);
          swiperObj.setAttribute('style', 'left:'+left+'px !important;');
        }
    })(i); 
  }

  /**
   * 监听banner页数的变化
   */
  Object.defineProperty(swiperOption, 'page', {
    get: function() {
      // console.log('get：' + page);
      return page;
    },
    set: function(value) {
      // 如果监听到变化，改变option的对应active
      for(var i = 0; i < swiperOptGroup.length; i++){
        // 清除样式
        swiperOptGroup[i].className = '';
      }
      for(var i = 0; i < swiperOptGroup.length; i++){
        // 添加样式
        swiperOptGroup[page].className += ' active ';
      }
      return value;
    }
  });

  /**
   * 获取属性值
   */
  function getStyle (obj, oStyle) {
    //获取元素的样式
    if (obj.currentStyle) {
        return obj.currentStyle[oStyle];
    } else {
        return getComputedStyle(obj, null)[oStyle];
    }
  }
})();