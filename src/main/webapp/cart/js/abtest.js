function getAb(c){var a=c;try{$.ajax({type:"GET",cache:false,async:false,url:"abTest",data:{targetUrl:c},success:function(d){a=d}})}catch(b){console.error(b)}return a};
