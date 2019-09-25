;(function(){
  // 封装避免污染全局

  // 获取节点
  var selloption = document.querySelector('.sell-head-option').getElementsByTagName('li');
  var rankOption = document.getElementsByClassName('sell-rank-btn');
  var noticeOption = document.getElementsByClassName('notice-btn');
  hoverOptionActive(selloption);
  hoverOptionActive(rankOption);
  hoverOptionActive(noticeOption);
  // hoverOptionActive
  // 传入li数组，为数组内的元素绑定mouseover监听
  // 当鼠标滑过元素，显示active样式
  function hoverOptionActive (option) {
    var optionLength = option.length;
    for (var i = 0; i < optionLength; i++) {
      // 为所有option添加监听
      (function(i){
          option[i].onmouseover = function() {
            clearClass();
            this.className += ' active ';
          }
          function clearClass () {
            // 清除所有元素的active
            for (var i = 0; i < optionLength; i++) {
              // option[i].classList.remove('active');
              // 兼容IE 8+
              var rep = option[i].className.replace(/\s?active/,"");
              option[i].setAttribute("class", rep);
            }
          }
      })(i); 
    }
  }
})();