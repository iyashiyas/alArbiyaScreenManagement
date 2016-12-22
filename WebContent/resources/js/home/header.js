$( document ).ready(function() {
(function worker() {
  $.ajax({
    url: 'home', 
    success: function(data) {
    window.location.replace(response.url);
    },
    complete: function() {
      // Schedule the next request when the current one's complete
      setTimeout(worker, 5000);
    }
  });
})();
});