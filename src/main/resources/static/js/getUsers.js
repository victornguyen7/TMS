async function getAllUsers(){
    const url = "https://localhost:1309/allUsers"; // URl to fetch data from

    try{
        const response = await fetch(url, {
            method: "GET", // HTTP method
        });

        if (!response.ok){
            throw new Error("Network response was not ok");
        } // Sever's response

        const usersData = await response.json(); // JSON response

        console.log("All users data:", usersData);

        displayUsers(usersData); // Display the users data
    }
    catch (error){
        console.error("There was a problem with your GET request: ", error);
    }
}

function displayUsers(users){ // Display the data on the webpage
    const usersList = document.getElementById("usersList");

    users.forEach(user =>{
        const userItem = document.createElement("li");
        userItem.textContent = `Username: ${user.username}, Password: ${user.password}`;
        usersList.appendChild(userItem); // Adding new data to the end of the list
    });
}

window.onload = function(){
    getAllUsers();
} // Call the function when the page loads