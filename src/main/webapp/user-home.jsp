<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<title>Flight Search</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="script.js"></script>

<body>
	<div class="container">
		<div class="card custom-bg w-75 p-4 d-flex">
			<div class="row">
				<div class="pb-3 h3 text-left">Flight Search &#128747;</div>
			</div>
			<form id="flight-form" onsubmit="return validateForm()">
				<div class="row">
					<div class="form-group col-md align-items-start flex-column">
						<label for="origin" class="d-inline-flex">From</label> <input
							type="text" placeholder="City or Airport" class="form-control"
							id="origin" name="origin" required>
					</div>
					<div class="form-group col-md align-items-start flex-column">
						<label for="depart" class="d-inline-flex">To</label> <input
							type="text" placeholder="City or Airport" class="form-control"
							id="depart" name="depart" required>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md align-items-start flex-column">
						<label for="departure-date" class=" d-inline-flex">Depart</label>
						<input type="date" class="form-control" id="departure-date"
							name="departure-date" onkeydown="return false" required>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-lg-6 align-items-start flex-column">
						<label for="cabin" class="d-inline-flex">Flight Type</label> <select
							class="form-select" id="cabin">
							<option>-select-</option>
							<option value="ECONOMY">Economy</option>
							<option value="BUSINESS">Business</option>
						</select>
					</div>
				</div>
				</br>
				<div class="row">
					<div class="text-left col-auto">
						<button type="submit" class="btn btn-primary">Search
							flights</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>

</html>