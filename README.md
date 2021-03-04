# pruebakommit
Prueba de ingreso Jueves 4 de Marzo

Instrucciones de uso

La aplicación está empaquetada en un jar
Para correrla se debe de usar el siguiente comando 
		
	java -jar swapi.jar "consulta del usuario"

La consulta debe tener el siguiente formato y debe estar encerrada entre comillas dobles

	select * from persona where nombrePropiedad = 'valorPropiedad'

donde

	nombrePropiedad : 

	Puede ser cualquier propiedad simple del objeto persona de la API
	esto es, gender, hair_color, name, etc...
	no funciona con listas.

	valorPropiedad

	Corresponde al valor que se busca para la propiedad especificada.
	Debe estar encerrado en comillas simples.