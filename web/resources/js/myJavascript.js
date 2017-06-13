$(document).on('ready', function(){
    $('.carousel.carousel-slider').carousel({
        fullWidth: true     
    });
    
      $('.button-collapse').sideNav();
       $('select').material_select();
});
  $(document).ready(function() {
    Materialize.updateTextFields();
  });
  
  function activarModal(){
    setTimeout(function(){
    $('.modal').modal({
        dismissible: false
     });
     $('select').material_select();
    },500);
    
     
}