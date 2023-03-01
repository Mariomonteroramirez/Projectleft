#Desarrolar un programa donde pida nombre edad precio de carro


tenencia = 0.013


nom = input("Ingrese su nombre: ")
nom = str(nom)
edad = input("Ingrese edad: ")
edad = int(edad)
preciocarro = input("Ingrese el precio de su carro: ")
preciocarro = float(preciocarro)

result =  preciocarro * tenencia

print ("La cantidad a pagar de tenencia es de : ", result )
print ("Nombre: "+ nom )
print ("Edad: ", edad )
print ("El precio de el carro es : ", preciocarro )
