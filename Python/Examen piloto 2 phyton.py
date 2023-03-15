
nombre = input("Ingrese su nombre: ")
nombre = str(nombre)

apelli = input("Ingrese sus apellidos: ")
apelli = str(apelli)

edad = input("Ingrese su edad: ")
edad = int(edad)

if(edad >= 18 and edad <= 69):
    ingresosm = input("Ingrese la cantidad de Ingresos economicos que tiene ")
    ingresosm = float(ingresosm)
    if(ingresosm < 10000):
        print("usted no es candidato para un prestamo bancario con nosotros: ")
    elif(ingresosm >= 10000 and ingresosm < 25000):
        print("Usted es candidato para nuestra segmentacion Clasica")
        print("Tenga lindo dia bye")
        
    elif(ingresosm >= 25000 and ingresosm < 35000):
            print("Usted es candidato para nuestra segmentacion Oro")
            print("Lndo dia hasta luego")
    elif(ingresosm > 35000):
                print("Usted es candidato para nuestra segmentacion Platino")
                print("Lindo dai adios")
else:
    print("No puede solicitar su prestamo bancario debe ser mayor de edad")
    print("Tengo lindo dia hasta luego")
