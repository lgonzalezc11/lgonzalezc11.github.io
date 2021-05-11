SubProceso  menu() 
	Definir operacion Como Entero;
		Escribir '1 suma';
		Escribir '2 Resta';
		Escribir '3 multiplicación';
		Escribir '4 División';
		Escribir '5 Numero Mayor';
		Escribir '6 Imprimir numeros del 1 al 10000';
		Escribir '';
FinSubProceso

SubProceso digito1() 
	Definir numerouno Como Entero;
	Escribir 'Digita tu primer numero';
FinSubProceso

SubProceso digito2() 
	Definir numerodos Como Entero;
	Escribir 'Digita tu segundo numero';
FinSubProceso

Proceso Calculadora

	Definir  numerouno,numerodos,operacion,resultado,contador Como Entero;
	Escribir 'Hola, en esta calculadora podrás realizar las siguientes operaciones:';
	Escribir '';
	menu;
	Escribir 'Escoge la opción del menú que deseas realizar:';
	Leer operacion;
	Segun operacion Hacer
		1:	digito1;
			Leer numerouno;
			digito2;
			Leer numerodos;
			resultado=numerouno+numerodos;
			Escribir 'Tu suma es:',numerouno,'+', numerodos,"=", resultado;
			
		2:
			digito1;
			Leer numerouno;
			digito2;
			Leer numerodos;
			resultado=numerouno-numerodos;
			Escribir 'Tu resta es:',numerouno,'-', numerodos,"=", resultado;	
			
		3:
			digito1;
			Leer numerouno;
			digito2;
			Leer numerodos;
			resultado=numerouno*numerodos;
			Escribir 'Tu multiplicación es:',numerouno,'*', numerodos,"=", resultado;
			
		4:
			digito1;
			Leer numerouno;
			digito2;
			Leer numerodos;
			Si numerodos=0 Entonces
				Escribir 'No se puede dividir por 0';
			SiNo
				Si numerodos>numerouno Entonces
					Escribir 'El numero dos no puede ser mayor al numero uno';
				
			SiNo
				resultado=numerouno/numerodos;
				Escribir 'Tu División es:',numerouno,'/', numerodos,"=", resultado;
			FinSi
		FinSi
		
		5:
			digito1;
			Leer numerouno;
			digito2;
			Leer numerodos;
			Si numerouno>numerodos Entonces
				Escribir 'El numero mayor es: ',numerouno;
			SiNo
				Escribir 'El numero mayor es: ',numerodos;
			FinSi
		6:
			Escribir '';
			contador=0;
			Mientras contador<1000 Hacer
				contador=contador+1;
				Escribir contador;
			FinMientras
			
		De Otro Modo:
			Escribir 'Escogio una opcion invalida';
			
	FinSegun
	
FinProceso
