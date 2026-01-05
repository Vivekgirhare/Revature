$("#registerBtn").click(function(){
    let user = $("#regUser").val();
    let pass = $("#regPass").val();

    if(user=="" || pass==""){
        $("#regMsg").text("All fields required");
        return;
    }

    let users = JSON.parse(localStorage.getItem("users")) || [];

    let exists = users.find(u => u.username === user);

    if(exists){
        $("#regMsg").text("User already exists!");
        return;
    }

    users.push({username:user, password:pass});
    localStorage.setItem("users", JSON.stringify(users));

    $("#regMsg").text("Registered Successfully! Go to Login");
});
