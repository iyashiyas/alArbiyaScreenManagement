$( document ).ready(function() {
(function worker() {
  $.ajax({
    url: 'home', 
    success: function(data) {
      //Success
    },
    complete: function() {
      // Schedule the next request when the current one's complete
      setTimeout(worker, 5000);
    }
  });
})();
});