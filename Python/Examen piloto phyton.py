pi=3.1416

radio = input("Ingrese el radio de el circulo: ")
radio = float(radio)

if (radio > 0):
     radioc = radio * radio
     result =  pi * radioc
     print("El area de el circulo es:",result)#Para concatenar es con , "coma"
else:
    print("Error en los campos agregados")
    print("Tenga lindo dia")
