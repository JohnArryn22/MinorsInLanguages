const users = [];

document.getElementById("signupForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const username = document.getElementById("username").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // Password validation: at least 8 characters with an uppercase letter and a special character
    const passwordRegex = /^(?=.*[A-Z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;

    if (!passwordRegex.test(password)) {
        document.getElementById("passwordMessage").textContent = "Password should be at least 8 characters long, contain an uppercase letter, and a special character.";
        return;
    }

    const existingUser = users.find(user => user.username === username);

    if (existingUser) {
        document.getElementById("message").textContent = "Username already exists. Please choose a different one.";
    } else {
        users.push({ username, email, password });
        document.getElementById("passwordMessage").textContent = "";
        document.getElementById("message").style.color = "green";
        document.getElementById("message").textContent = "Signup successful. You can now log in.";
        document.getElementById("username").value = "";
        document.getElementById("email").value = "";
        document.getElementById("password").value = "";
    }
});
