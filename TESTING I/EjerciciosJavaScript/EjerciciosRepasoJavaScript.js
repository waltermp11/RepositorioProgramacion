
//ejercicio de mostrar 4 operaciones basicas pero cada una es con una funcion.

function funcionSuma(numero1,numero2) {

    suma =0;
    if (numero1==""|| numero2!= "") {
        console.log("Ingrese numeros enteros por favor, intentelo nuevamente :D");
        return suma;
        
    }
    else {
        suma = numero1+numero2;
        console.log("La suma de los dos numeros es:",suma);

        return suma;
    }
    
    
}

function funcionaResta(numero1,numero2) {
    resta= numero1-numero2;
    return resta;
    
}

function funcionMultiplicacion(numero1,numero2) {
    multiplicacion = numero1*numero2;
    return multiplicacion;
    
}

function funcionDivision(numero1,numero2) {
    division=numero1/numero2;
    return division;
}

function mostrarFunciones() {
    
    console.log(funcionSuma(1,2));
    console.log(funcionaResta(1,2));
    console.log(funcionMultiplicacion(1,2));
    console.log(funcionDivision(1,2));
}

console.log("Ejercicio repaso ");
console.log(funcionSuma(1,2));


