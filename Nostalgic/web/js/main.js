function sendDataToBack() {
    var usuario = document.getElementById("usuario").value;
    var nick = document.getElementById("nick").value;
    var telefono=document.getElementById("telefono").value;
    var correo = document.getElementById("correo").value;
    var password = document.getElementById("password").value;
    v

    $.post("urlSuperPro", {
        usuario: usuario,
        nick: nick,
        correo: correo,
        password: password,
        
    },
            function (data) {
                console.log("Exito");
                if (data.resultado) {
                    
                }

            });
    


}


