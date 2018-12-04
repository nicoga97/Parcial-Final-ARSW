var celcius
var fahrenheit
function convertFahrenheitToCelsius(){
           axios.get( "http://localhost:8080/FahrenheitToCelsius/"+fahrenheit)
           .then(function (response) {
                var a=document.getElementById("c")
                a.innerHTML="C= "+response.data

           })
           .catch(function (error) {


           })
           .then( function () {




           });

  }
  function convertCelsiusToFahrenheit(){
             axios.get( "http://localhost:8080/CelciusToFahrenheit/"+celcius)
             .then(function (response) {
                  var a=document.getElementById("f")
                  a.innerHTML="F= "+response.data

             })
             .catch(function (error) {


             })
             .then( function () {




             });

    }