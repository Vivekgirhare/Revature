$("#loginBtn").click(function(){
    let user = $("#loginUser").val();
    let pass = $("#loginPass").val();

    let users = JSON.parse(localStorage.getItem("users")) || [];

    let found = users.find(u => u.username === user && u.password === pass);

    if(found){
        localStorage.setItem("activeUser", user);
        window.location.href="quiz.html";
    } else {
        $("#loginMsg").text("Invalid Username or Password");
    }
});
