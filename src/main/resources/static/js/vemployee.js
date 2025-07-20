
document.getElementById('leave').addEventListener("submit",
	function(event){
		const startDate = new Date(document.getElementById("sart-date").value);
		const endDate = new Date(document.getElementById("end-date").value);
		 if( endDate < startDate){
		 	alert("End Date cannot be earlier than Start Date.");
		 	event.preventDefault();//Stop form submission
		 }
	});

// // this is to auto check and input date with DB 
// 	const input = document.getElementById("emp_id");
// 	const result = document.getElementById("result");

// 	input.addEventListener("input", function()
// 		{ const value = input.value;
// 		if(value.length === 0){
// 			result.textContent = "";
// 			return;
// 		}
// 		fetch(`/leave/show?empl=${encodeURIComponent(value)}`).then(response => response.json()).then(data => {
// 			if (data.employees){
// 				result.textContent = "Employee exists";
// 				result.style.color = "blue";
// 			}else{
// 				result.textContent = "Employee does not exists!!";
// 				result.style.color = "red";
// 			}
// 		}).catch(error => {
// 			console.error("Error:", error);
// 			result.textContent = "Error checking employee ID";
// 			result.style.color = "red";
// 		});
// 	});

	// this is to auto check if an employee exist or not!!!
	let employees = [];

		//fetch all employee on page load
	fetch('/leave/shows').then(response => response.json()).then(data => {
		employees = data;// save list for later checks
	}).catch(error =>{
		console.error("Error loading employees:", error);
	});

	//add input listener to check if input matches
	document.getElementById("emp_id").addEventListener("input", function(){
		const inputValue = this.value.trim().toLowerCase();
		const result = document.getElementById("checkResult");

		if(inputValue === ""){
			result.textContent = "";
			return;
		}

		const found = employees.some(emp => emp.emplPass.toLowerCase() === inputValue );

		if( found ){
			result.textContent =" Employeeexists!!";
			result.style.color ="green";
		}else{
			result.textContent = "Employee does not exists!!";
			result.style.color = "red";
		}
	});
