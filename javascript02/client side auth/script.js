const users = [];

document.getElementById("signupForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const existingUser = users.find(user => user.username === username);

    if (existingUser) {
        document.getElementById("message").textContent = "Username already exists. Please choose a different one.";
    } else {
        users.push({ username, password });
        document.getElementById("message").style.color = "green";
        document.getElementById("message").textContent = "Signup successful. You can now log in.";
        document.getElementById("username").value = "";
        document.getElementById("password").value = "";
    }
});
