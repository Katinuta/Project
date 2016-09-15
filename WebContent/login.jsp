
<html>
<head>
<title>Insert title here</title>
<style>
.block { 
     
    width: 260px; 
	height: 130px;
    border: solid 1px black; 
	font-size: 20px;
	margin-left: 35%;
	margin-right: 40%; 
	padding: 15px;
	margin-top:15%;
   }
  #but{
	width: 120px;
	height: 25px;
  }
  
   font{
   font-size:20px;
   }
   #forbut{
   font-size:16px;
   }
   </style>
</head>
<body>
	<form  action="Controller" method="POST" >
		<input type="hidden" name="command" value="Login"/>				
			<table>
				<tr>
					<td><label for="email"><font>Email</font></label></td>
					<td><input type="text" id="email" name="email" ></td>
				</tr>
				<tr>
					<td><label for="password"><font>Password</font></label></td>
					<td><input type="password" id="password" name="password" ></td>
				</tr>
				<tr >
					<td >
						<button id="but" type="submit"><font id="forbut">Login</font></button>
					</td>
				</tr>
			</table>
	</form>
</body>
</html>