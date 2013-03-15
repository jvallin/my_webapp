<html>
<head>
Index !!!!
</head>
<body>
	<h2>Index   !!!!</h2>
<p>Affichage des nombres pairs en gras ...</p>
<%
	for(int i = 0; i<= 10; i++)
	{
		if(i%2 == 0)
		{
			%><b><%out.println(i);%></b><%
		}
		else
		{
			out.println(i);
		}
		%><br/><%
	}
%>
</body>
</html>
