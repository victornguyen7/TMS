async function addUser(){
    const url = "http://localhost:1309/addUser";

    const userData = {
        username: document.getElementById('username').value,
        password: document.getElementById('password').value
        // Data to add
    };

    try{
        const response = await fetch(url,{
            method: "POST", // HTTP method to handle adding a new user
            headers: {
                "Content-type": "application/json" // Content type for sending JSON data
            },
            body: JSON.stringify(userData) // Sending the data as JSON
        });

        console.log(response)
        if(!response.ok){
            throw new Error("Network response was not ok");
        } // Sever's response

        const responseData = await response.json(); // Parse the JSON response

        console.log("Response from sever:", responseData);

        alert("User added successfully"); // Success message

        getAllUsers(); // Display the user list after adding a new user

    }
    catch (error){
        console.error("There was a problem with the POST request:", error);
    }
}

// Link the addUser function to a button click
document.getElementById("victor").addEventListener('submit', function (event){
    event.preventDefault()
    addUser(); // Send the data
})