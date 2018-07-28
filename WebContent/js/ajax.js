var myBaseUrl = "http://localhost:8080/UserManagement/";

function getUsername() {
    $.ajax({
        type: 'GET',
        url: myBaseUrl + 'rest/UserServiceJson/usersjson',
        dataType: 'json',
        data: { },
        success: function(data){
        	console.log(data);
        	var a = JSON.stringify(data);
            $('#demo').html(data[0].profession); // update the HTML here
        }
    })
}

