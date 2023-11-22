document.addEventListener("DOMContentLoaded", function() {
    const greeting = document.getElementById("greeting");
    const today = new Date();
    const currentHour = today.getHours();

    if (currentHour >= 0 && currentHour < 12) {
        greeting.textContent = "Good Morning, User";
    } else if (currentHour >= 12 && currentHour < 18) {
        greeting.textContent = "Good Afternoon, User";
    } else {
        greeting.textContent = "Good Evening, User";
    }
});
